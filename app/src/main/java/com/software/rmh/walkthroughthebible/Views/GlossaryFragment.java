package com.software.rmh.walkthroughthebible.Views;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.software.rmh.walkthroughthebible.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GlossaryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GlossaryFragment extends Fragment {

	public GlossaryFragment() {
		// Required empty public constructor
	}

	/**
	 * Use this factory method to create a new instance of
	 * this fragment using the provided parameters.
	 */
	public static GlossaryFragment newInstance() {
		return new GlossaryFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_glossary, container, false);
	}

}
