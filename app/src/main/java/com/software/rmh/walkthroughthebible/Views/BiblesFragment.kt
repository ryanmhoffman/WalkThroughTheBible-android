package com.software.rmh.walkthroughthebible.Views


import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.software.rmh.walkthroughthebible.Adapters.CustomBiblesAdapter
import com.software.rmh.walkthroughthebible.R

import java.util.ArrayList
import java.util.Arrays

/**
 * A simple [Fragment] subclass.
 * Use the [BiblesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BiblesFragment : Fragment() {

	internal var recyclerView: RecyclerView
	internal var bibles: MutableList<String>

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		bibles = ArrayList<String>()

		val allBibles = resources.getStringArray(R.array.bibles_list)
		val len = allBibles.size
		bibles.addAll(Arrays.asList(*allBibles).subList(0, len))
	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
	                          savedInstanceState: Bundle): View? {
		// Inflate the layout for this fragment
		val view = inflater.inflate(R.layout.fragment_book_list, container, false)

		// Set the adapter
		if (view is RecyclerView) {
			recyclerView = view as RecyclerView
			recyclerView.setLayoutManager(LinearLayoutManager(view.getContext()))
			recyclerView.setAdapter(CustomBiblesAdapter(bibles))
			val divider = DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL)
			recyclerView.addItemDecoration(divider)
		}
		return view
	}

	companion object {

		/**
		 * Use this factory method to create a new instance of
		 * this fragment using the provided parameters.
		 */
		fun newInstance(): BiblesFragment {
			return BiblesFragment()
		}
	}

}// Required empty public constructor
