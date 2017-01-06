package com.software.rmh.walkthroughthebible.Views;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.software.rmh.walkthroughthebible.Adapters.CustomBookListAdapter;
import com.software.rmh.walkthroughthebible.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A fragment representing a list of books in String format.
 */
public class BookListFragment extends Fragment {

	private List<String> books;
	private RecyclerView recyclerView;
	private BookListFragmentListener listener;

	// Directional int Keys
	public static final int SCROLL_UP = 0;
	public static final int SCROLL_DOWN = 1;
	public static final int NO_SCROLL = 2;

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
		books = new ArrayList<>();

		String[] booksArray = getResources().getStringArray(R.array.all_books);
		int len = booksArray.length;
		books.addAll(Arrays.asList(booksArray).subList(0, len));

		if(listener == null){
			listener = (BookListFragmentListener) getActivity();
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_book_list, container, false);

		// Set the adapter
		if(view instanceof RecyclerView) {
			recyclerView = (RecyclerView) view;
			recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
			recyclerView.setAdapter(new CustomBookListAdapter(books));
			DividerItemDecoration divider = new DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL);
			recyclerView.addItemDecoration(divider);

			recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
				@Override
				public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
					super.onScrolled(recyclerView, dx, dy);
					if(dy > 0){
						// Scrolling down
						listener.onScroll(SCROLL_DOWN);
					} else if(dy < 0){
						// Scrolling up
						listener.onScroll(SCROLL_UP);
					} else {
						listener.onScroll(NO_SCROLL);
					}
				}

				@Override
				public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
					super.onScrollStateChanged(recyclerView, newState);
					switch(newState){
						case RecyclerView.SCROLL_STATE_IDLE:
							break;
						case RecyclerView.SCROLL_STATE_DRAGGING:
							break;
					}
				}
			});
		}
		return view;
	}

	@Override
	public void onAttach(Context context) {
		super.onAttach(context);

	}

	@Override
	public void onDetach() {
		super.onDetach();
	}

	public interface BookListFragmentListener {
		void onScroll(int direction);
	}

}
