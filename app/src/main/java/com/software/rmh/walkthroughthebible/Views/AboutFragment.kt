package com.software.rmh.walkthroughthebible.Views


import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.software.rmh.walkthroughthebible.R

/**
 * A simple [Fragment] subclass.
 * Use the [AboutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutFragment : Fragment() {

	private val about = StringBuilder()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)


	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
	                          savedInstanceState: Bundle): View? {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_about, container, false)
	}

	companion object {

		/**
		 * Use this factory method to create a new instance of
		 * this fragment using the provided parameters.
		 */
		fun newInstance(): AboutFragment {
			return AboutFragment()
		}
	}

}// Required empty public constructor
