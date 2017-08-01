package com.software.rmh.walkthroughthebible.Adapters

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.software.rmh.walkthroughthebible.R

/**
 * [RecyclerView.Adapter] that can display a list of Strings.
 */

class CustomBiblesAdapter(private val bibles: List<String>) : 
                RecyclerView.Adapter<CustomBiblesAdapter.CustomViewHolder>() {

	fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
		val view = LayoutInflater.from(parent.context)
				.inflate(R.layout.fragment_book, parent, false)
		return CustomViewHolder(view)
	}

	fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

		holder.textView.text = bibles[position]
		if (position == 1) {
			holder.textView.setTextColor(ContextCompat.getColor(
                            holder.textView.context, android.R.color.darker_gray))
		}
	}

	val itemCount: Int
		get() = bibles.size

	inner class CustomViewHolder private constructor(view: View) : 
                            RecyclerView.ViewHolder(view), View.OnClickListener {
		private val textView: TextView

		init {
			view.setOnClickListener(this)
			textView = view.findViewById(R.id.content) as TextView
		}

		override fun onClick(view: View) {
			// Intent to start new Activity to read the select book with the map.
		}
	}
}
