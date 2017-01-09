package com.software.rmh.walkthroughthebible.Views;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.software.rmh.walkthroughthebible.Adapters.CustomBiblesAdapter;
import com.software.rmh.walkthroughthebible.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BiblesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BiblesFragment extends Fragment {

	RecyclerView recyclerView;
	List<String> bibles;

	public BiblesFragment() {
		// Required empty public constructor
	}

	/**
	 * Use this factory method to create a new instance of
	 * this fragment using the provided parameters.
	 */
	public static BiblesFragment newInstance() {
		return new BiblesFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		bibles = new ArrayList<>();

		String[] allBibles = getResources().getStringArray(R.array.bibles_list);
		int len = allBibles.length;
		bibles.addAll(Arrays.asList(allBibles).subList(0, len));
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_book_list, container, false);

		// Set the adapter
		if(view instanceof RecyclerView) {
			recyclerView = (RecyclerView) view;
			recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
			recyclerView.setAdapter(new CustomBiblesAdapter(bibles));
			DividerItemDecoration divider = new DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL);
			recyclerView.addItemDecoration(divider);
		}
		return view;
	}

}
