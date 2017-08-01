package com.software.rmh.walkthroughthebible.Controllers

import android.app.Fragment
import android.app.FragmentManager
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.software.rmh.walkthroughthebible.Models.BibleLocationsKJV
import com.software.rmh.walkthroughthebible.Models.Book
import com.software.rmh.walkthroughthebible.R
import com.software.rmh.walkthroughthebible.Views.AboutFragment
import com.software.rmh.walkthroughthebible.Views.BiblesFragment
import com.software.rmh.walkthroughthebible.Views.BookListFragment

import java.util.ArrayList

class MainActivity : AppCompatActivity(), BookListFragment.BookListFragmentListener {

	// ArrayList of Book objects. Will need to be accessed by other classes.
	val books = ArrayList<Book>()

	internal var fm = getFragmentManager()
	internal var bottomNavigation: AHBottomNavigation

	protected fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		if (savedInstanceState == null) {
			fm.beginTransaction().add(R.id.container, BookListFragment.newInstance(), BOOKS_FRAGMENT_KEY).commit()
			if (getSupportActionBar() != null) getSupportActionBar().setTitle(R.string.books)
		}
		initViews()
		initBooks()

	}

	private fun initViews() {

		bottomNavigation = findViewById(R.id.bottom_navigation) as AHBottomNavigation
		val books = AHBottomNavigationItem(getString(R.string.books), ContextCompat.getDrawable(this, R.drawable.icon_book))
		//AHBottomNavigationItem glossary = new AHBottomNavigationItem(getString(R.string.glossary), ContextCompat.getDrawable(this, R.drawable.icon_glossary));
		//AHBottomNavigationItem tour = new AHBottomNavigationItem(getString(R.string.tour), ContextCompat.getDrawable(this, R.drawable.icon_tour));
		val bibles = AHBottomNavigationItem(getString(R.string.bibles), ContextCompat.getDrawable(this, R.drawable.icon_bible))
		val about = AHBottomNavigationItem(getString(R.string.about), ContextCompat.getDrawable(this, R.drawable.icon_about))


		//bottomNavigation.addItem(glossary);
		//bottomNavigation.addItem(tour);
		bottomNavigation.addItem(bibles)
		bottomNavigation.addItem(books)
		bottomNavigation.addItem(about)

		bottomNavigation.isBehaviorTranslationEnabled = true
		bottomNavigation.defaultBackgroundColor = ContextCompat.getColor(this, R.color.nav_bar_background)
		bottomNavigation.currentItem = 1

		bottomNavigation.setOnTabSelectedListener { position, wasSelected ->
			changeFragment(position)
			true
		}
	}

	private fun changeFragment(position: Int) {

		when (position) {
			0 -> replaceCurrentFragment(BIBLES_FRAGMENT_KEY, BiblesFragment.newInstance(), R.string.bibles)
			1 ->
				//replaceCurrentFragment(GLOSSARY_FRAGMENT_KEY, GlossaryFragment.newInstance(), R.string.glossary);
				replaceCurrentFragment(BOOKS_FRAGMENT_KEY, BookListFragment.newInstance(), R.string.books)
			2 ->
				//replaceCurrentFragment(TOUR_FRAGMENT_KEY, VirtualTourFragment.newInstance(), R.string.tour);
				replaceCurrentFragment(ABOUT_FRAGMENT_KEY, AboutFragment.newInstance(), R.string.about)
			else -> {
			}
		}

	}

	private fun replaceCurrentFragment(key: String, fragment: Fragment, titleResource: Int) {
		fm.beginTransaction().replace(R.id.container, fragment, key).commit()
		if (getSupportActionBar() != null) getSupportActionBar().setTitle(titleResource)
	}

	/**
	 * Creates all 66 books of the Bible and adds them to an ArrayList that stores them in order.
	 * Each Book object contains the name, which is pulled from resources in the strings.xml from an array,
	 * the number of chapters, which is pulled from a HashMap in Books.class, the book number in numerical order which
	 * is just equal to the index plus one, since indexing starts at 0 but the first book of the Bible (Genesis) is
	 * book 1, and finally two-dimensional String array which all the locations referenced in that book, broken out
	 * by each chapter as its own array.
	 */
	private fun initBooks() {
		val kjv = BibleLocationsKJV()
		// Gets the array from Resources (strings.xml)
		val bookNames = getResources().getStringArray(R.array.all_books)
		// Stops looping at 65 because there are 66 books and 0-65 == 66 loops.
		for (i in 0..65) {
			val book = Book()
			book.setName(bookNames[i]) // Only works because the books are in order in the array
					//.setChapters(Books.map.get(book.getName())) // Sets number of chapters the book has
					.setIndex(i + 1).locations = kjv.getBookLocations(i)
			books.add(book)
		}
	}

	override fun onBookListEmpty() {
		val fragment = fm.findFragmentByTag(BOOKS_FRAGMENT_KEY) as BookListFragment
		fragment.setBookList(books)
	}

	companion object {

		// Keys to identify each Fragment in the stack.
		private val BOOKS_FRAGMENT_KEY = "BookList"
		//private static String GLOSSARY_FRAGMENT_KEY = "Glossary";
		//private static String TOUR_FRAGMENT_KEY = "VirtualTour";
		private val BIBLES_FRAGMENT_KEY = "BiblesList"
		private val ABOUT_FRAGMENT_KEY = "About"
	}
}
