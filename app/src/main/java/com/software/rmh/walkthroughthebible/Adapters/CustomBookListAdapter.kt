package com.software.rmh.walkthroughthebible.Adapters

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.software.rmh.walkthroughthebible.Controllers.BookActivity
import com.software.rmh.walkthroughthebible.Models.Book
import com.software.rmh.walkthroughthebible.Models.Wrapper
import com.software.rmh.walkthroughthebible.R

import java.util.ArrayList

/**
 * [RecyclerView.Adapter] that can display a list of Strings.
 */
class CustomBookListAdapter(private val books: ArrayList<Book>) : RecyclerView.Adapter<CustomBookListAdapter.ViewHolder>() {

	fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val view = LayoutInflater.from(parent.context)
				.inflate(R.layout.fragment_book, parent, false)
		return ViewHolder(view)
	}

	fun onBindViewHolder(holder: ViewHolder, position: Int) {

		holder.textView.text = books[position].name
	}

	val itemCount: Int
		get() = books.size

	inner class ViewHolder private constructor(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
		private val textView: TextView

		init {
			view.setOnClickListener(this)
			textView = view.findViewById(R.id.content) as TextView
		}

		override fun onClick(view: View) {
			val intent = Intent(view.context, BookActivity::class.java)
			val bundle = Bundle()
			bundle.putSerializable("ARRAYLIST", Wrapper(books))
			bundle.putInt("BOOK_POSITION", getAdapterPosition())
			intent.putExtras(bundle)
			view.context.startActivity(intent)
		}
	}
}
