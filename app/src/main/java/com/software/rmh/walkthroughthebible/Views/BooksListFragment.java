package com.software.rmh.walkthroughthebible.Views;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.software.rmh.walkthroughthebible.R;

/**
 * A simple {@link Fragment} subclass.
 *
 * Use the {@link BooksListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BooksListFragment extends Fragment {

	private String[] books;

	public BooksListFragment() {
		// Required empty public constructor
	}


	public static BooksListFragment newInstance() {
		return new BooksListFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		books = getResources().getStringArray(R.array.all_books);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		ListView listView = (ListView) container.findViewById(R.id.listView);
		ArrayAdapter adapter = new ArrayAdapter(this.getContext(), android.R.layout.simple_list_item_1, books);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
				Toast.makeText(BooksListFragment.this.getContext(), "Clicked " + i, Toast.LENGTH_SHORT).show();
			}
		});

		return inflater.inflate(R.layout.fragment_books_list, container, false);
	}

	@Override
	public void onAttach(Context context) {
		super.onAttach(context);

	}

	@Override
	public void onDetach() {
		super.onDetach();
	}

}
