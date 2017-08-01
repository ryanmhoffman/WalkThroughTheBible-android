package com.software.rmh.walkthroughthebible.Controllers

import android.app.FragmentManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.software.rmh.walkthroughthebible.Models.Book
import com.software.rmh.walkthroughthebible.Models.ChapterLoader
import com.software.rmh.walkthroughthebible.Models.Wrapper
import com.software.rmh.walkthroughthebible.R
import com.software.rmh.walkthroughthebible.Views.ChapterFragment

import java.util.ArrayList

/**
 * BookActivity is an Activity that controls the map, and the book and chapter that is selected. The map is displayed as the top
 * half of the screen in portrait or as the left half of the screen in landscape orientation. The remaining portion is the chapter
 * of the Bible that is to be displayed.

 * BookActivity manages the state and content of the two Fragments. It acts as the controller and each Fragment is a view. All
 * communication with the Model(s) are to go through this class.
 */
class BookActivity : AppCompatActivity(), OnMapReadyCallback, ChapterFragment.OnTextReadyCallback {

	private var books = ArrayList<Book>()
	private var position: Int = 0
	private var fragment: ChapterFragment? = null

	private val fm = getFragmentManager()

	protected fun onCreate(savedInstanceState: Bundle) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_book)

		val bundle = getIntent().getExtras()
		if (bundle != null) {
			fragment = fm.findFragmentByTag(FRAG_TAG)

			if (fragment == null) {
				fragment = ChapterFragment()
				fragment!!.arguments = bundle
			}

			fm.beginTransaction().replace(R.id.bookContainer, fragment, FRAG_TAG).commit()

			val wrapper = bundle!!.getSerializable("ARRAYLIST") as Wrapper
			books = wrapper.books
			position = bundle!!.getInt("BOOK_POSITION")
		}

		// Set the ActionBar title to the name of the book.
		if (getSupportActionBar() != null) getSupportActionBar().setTitle(books[position].name)

		val mapFragment = getFragmentManager().findFragmentById(R.id.map) as MapFragment
		mapFragment.getMapAsync(this)
	}

	override fun onMapReady(googleMap: GoogleMap) {
		val Jerusalem = LatLng(31.7683, 35.2137)
		googleMap.addMarker(MarkerOptions().position(Jerusalem).title("Jerusalem"))
		googleMap.moveCamera(CameraUpdateFactory.newLatLng(Jerusalem))
	}

	override fun getText(book: String, chapter: Int) {
		val loader = ChapterLoader(this)

		// Make sure fragment points to the correct Fragment.
		if (fragment == null) fragment = fm.findFragmentByTag(FRAG_TAG)

		// Get the chapter text from ChapterLoader and set the text in the ChapterFragment.
		var text: String? = null
		if (chapter == 1) {
			text = loader.loadChapter(book)
			fragment!!.setChapterText(text)
		} else {
			text = loader.loadAnotherChapter(book, chapter)
			fragment!!.setChapterText(text)
		}

	}

	companion object {

		private val FRAG_TAG = "CHAPTER_FRAGMENT"
	}
}
