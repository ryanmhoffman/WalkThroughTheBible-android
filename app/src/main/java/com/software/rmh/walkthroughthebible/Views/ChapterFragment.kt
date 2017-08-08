package com.software.rmh.walkthroughthebible.Views


import android.app.Fragment
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.TextView

import com.software.rmh.walkthroughthebible.Models.Books
import com.software.rmh.walkthroughthebible.Models.Wrapper
import com.software.rmh.walkthroughthebible.R

/**
 * A simple [Fragment] subclass.
 */
class ChapterFragment : Fragment() {

	// Views
	private var bookText: TextView? = null
	private var previous: FloatingActionButton? = null
	private var next: FloatingActionButton? = null
	private var scrollView: ScrollView? = null

	private var callback: OnTextReadyCallback? = null

	private var book: String? = null
	private val chapters = Books()

	// Count lines in the .txt file to keep track of which chapter the user is on.
	private var counter = 1

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
	                          savedInstanceState: Bundle?): View? {
		// Inflate the layout for this fragment
		val root = inflater.inflate(R.layout.fragment_chapter, container, false)

		val bundle: Bundle
		if ((bundle = arguments) != null) {
			val wrapper = bundle.getSerializable("ARRAYLIST") as Wrapper
			val books = wrapper.books
			val position = bundle.getInt("BOOK_POSITION")

			book = books[position].getName()
		}

		callback = this.activity as OnTextReadyCallback

		next = root.findViewById(R.id.nextChapter) as FloatingActionButton
		previous = root.findViewById(R.id.previousChapter) as FloatingActionButton
		setFABListeners()

		scrollView = root.findViewById(R.id.scroller)

		bookText = root.findViewById(R.id.bookText)

		if (savedInstanceState == null) {
			requestBookText()
		}

		return root
	}

	/**
	 * Requests the text of the chapter from BookActivity.

	 * @return String containing the requested chapter.
	 */
	private fun requestBookText() {

		callback!!.getText(book, counter)

		// Reset the ScrollView to the top and decrement counter if it
		// is above the total number of chapters in the book.
		if (counter > chapters.getBooksMap().get(book)) counter--
		scrollView!!.scrollTo(0, 0)
	}

	/**
	 * This method is called by BookActivity after the OnTextReadyCallback interface is called.
	 * That will retrieve the full chapter from ChapterLoader, then call this method and pass
	 * the text of the chapter in as a String. This then sets the TextView text.

	 * @param text a String representing one full chapter of the book.
	 */
	fun setChapterText(text: String) {
		bookText!!.text = text
	}

	private fun setFABListeners() {
		next!!.setOnClickListener(View.OnClickListener {
			counter++
			requestBookText()
		})

		previous!!.setOnClickListener(View.OnClickListener {
			if (counter > 1) counter--
			requestBookText()
		})
	}

	/**
	 * Clears the TextView of any old content so it can have new text loaded in.
	 */
	private fun clearViews() {
		bookText!!.text = ""
	}

	override fun onSaveInstanceState(outState: Bundle) {
		super.onSaveInstanceState(outState)
		// Add the counter to the outState Bundle on state change
		outState.putInt("COUNTER", counter)
	}

	override fun onViewStateRestored(savedInstanceState: Bundle?) {
		super.onViewStateRestored(savedInstanceState)
		if (savedInstanceState != null) {
			clearViews()

			// Reset the counter to the correct chapter
			counter = savedInstanceState.getInt("COUNTER")
			requestBookText()
		}
	}

	interface OnTextReadyCallback {
		fun getText(book: String, chapter: Int)
	}

}// Required empty public constructor
