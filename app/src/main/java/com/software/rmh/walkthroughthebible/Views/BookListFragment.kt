package com.software.rmh.walkthroughthebible.Views

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.software.rmh.walkthroughthebible.Adapters.CustomBookListAdapter
import com.software.rmh.walkthroughthebible.Controllers.MainActivity
import com.software.rmh.walkthroughthebible.Models.Book
import com.software.rmh.walkthroughthebible.R

import java.util.ArrayList

/**
 * A fragment representing a list of books in String format.
 */
/**
 * Mandatory empty constructor for the fragment manager to instantiate the
 * fragment (e.g. upon screen orientation changes).
 */
class BookListFragment : Fragment() {

	private var books: ArrayList<Book>? = null
	private var recyclerView: RecyclerView? = null
	private var listener: BookListFragmentListener? = null
	private val activity = getActivity() as MainActivity

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		/*String[] booksArray = getResources().getStringArray(R.array.all_books);
		int len = booksArray.length;
		books.addAll(Arrays.asList(booksArray).subList(0, len));*/

		if (listener == null) {
			listener = getActivity() as BookListFragmentListener
		}
	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
	                          savedInstanceState: Bundle): View? {
		val view = inflater.inflate(R.layout.fragment_book_list, container, false)

		// Set the adapter
		if (view is RecyclerView) {
			recyclerView = view as RecyclerView
			recyclerView!!.setLayoutManager(LinearLayoutManager(view.getContext()))
			if (books != null) {
				recyclerView!!.setAdapter(CustomBookListAdapter(books!!))
			} else {
				listener!!.onBookListEmpty()
				recyclerView!!.setAdapter(CustomBookListAdapter(books!!))
			}
			val divider = DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL)
			recyclerView!!.addItemDecoration(divider)
		}
		return view
	}

	override fun onAttach(context: Context) {
		super.onAttach(context)
	}

	override fun onDetach() {
		super.onDetach()
	}

	interface BookListFragmentListener {
		fun onBookListEmpty()
	}

	fun setBookList(books: ArrayList<Book>) {
		this.books = books
	}

	companion object {

		fun newInstance(): BookListFragment {
			return BookListFragment()
		}
	}
}
