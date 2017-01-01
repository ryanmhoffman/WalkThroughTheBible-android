package com.software.rmh.walkthroughthebible.Views;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.software.rmh.walkthroughthebible.Adapters.MyStringRecyclerViewAdapter;
import com.software.rmh.walkthroughthebible.R;

import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class BookListFragment extends Fragment {

	private OnListFragmentInteractionListener mListener;
	private List<String> books;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public BookListFragment() {
	}

	@SuppressWarnings("unused")
	public static BookListFragment newInstance() {
		return new BookListFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String[] booksArray = getResources().getStringArray(R.array.all_books);
		int len = booksArray.length;
		for(int i = 0; i < len; i++){
			books.add(booksArray[i]);
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_book_list, container, false);

		// Set the adapter
		if(view instanceof RecyclerView) {
			RecyclerView recyclerView = (RecyclerView) view;
			recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
			recyclerView.setAdapter(new MyStringRecyclerViewAdapter(books, mListener));
		}
		return view;
	}


	@Override
	public void onAttach(Context context) {
		super.onAttach(context);
		if(context instanceof OnListFragmentInteractionListener) {
			mListener = (OnListFragmentInteractionListener) context;
		} else {
			throw new RuntimeException(context.toString()
					+ " must implement OnListFragmentInteractionListener");
		}
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mListener = null;
	}

	/**
	 * This interface must be implemented by activities that contain this
	 * fragment to allow an interaction in this fragment to be communicated
	 * to the activity and potentially other fragments contained in that
	 * activity.
	 */
	public interface OnListFragmentInteractionListener {
		// TODO: Update argument type and name
		void onListFragmentInteraction();
	}
}
