package com.software.rmh.walkthroughthebible.Views;


import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.software.rmh.walkthroughthebible.Models.Book;
import com.software.rmh.walkthroughthebible.Models.Books;
import com.software.rmh.walkthroughthebible.Models.Wrapper;
import com.software.rmh.walkthroughthebible.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChapterFragment extends Fragment {

	// Views
	private TextView bookText;
	private FloatingActionButton previous;
	private FloatingActionButton next;
	private ScrollView scrollView;

	private OnTextReadyCallback callback;

	private String book;
	private Books chapters = new Books();

	// Count lines in the .txt file to keep track of which chapter the user is on.
	private int counter = 1;

	public ChapterFragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View root = inflater.inflate(R.layout.fragment_chapter, container, false);

		Bundle bundle;
		if((bundle = getArguments()) != null){
			Wrapper wrapper = (Wrapper) bundle.getSerializable("ARRAYLIST");
			ArrayList<Book> books = wrapper.getBooks();
			int position = bundle.getInt("BOOK_POSITION");

			book = books.get(position).getName();
		}

		callback = (OnTextReadyCallback) this.getActivity();

		next = (FloatingActionButton) root.findViewById(R.id.nextChapter);
		previous = (FloatingActionButton) root.findViewById(R.id.previousChapter);
		setFABListeners();

		scrollView = (ScrollView) root.findViewById(R.id.scroller);

		bookText = (TextView) root.findViewById(R.id.bookText);

		if(savedInstanceState == null){
			requestBookText();
		}

		return root;
	}

	/**
	 * Requests the text of the chapter from BookActivity.
	 *
	 * @return String containing the requested chapter.
	 */
	private void requestBookText(){

		callback.getText(book, counter);

		// Reset the ScrollView to the top and decrement counter if it
		// is above the total number of chapters in the book.
		if(counter > chapters.getMap().get(book)) counter--;
		scrollView.scrollTo(0, 0);
	}

	/**
	 * This method is called by BookActivity after the OnTextReadyCallback interface is called.
	 * That will retrieve the full chapter from ChapterLoader, then call this method and pass
	 * the text of the chapter in as a String. This then sets the TextView text.
	 *
	 * @param text a String representing one full chapter of the book.
	 */
	public void setChapterText(String text){
		bookText.setText(text);
	}

	private void setFABListeners(){
		next.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				counter++;
				requestBookText();
			}
		});

		previous.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(counter > 1) counter--;
				requestBookText();
			}
		});
	}

	/**
	 * Clears the TextView of any old content so it can have new text loaded in.
	 */
	private void clearViews(){
		bookText.setText("");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		// Add the counter to the outState Bundle on state change
		outState.putInt("COUNTER", counter);
	}

	@Override
	public void onViewStateRestored(Bundle savedInstanceState) {
		super.onViewStateRestored(savedInstanceState);
		if(savedInstanceState != null){
			clearViews();

			// Reset the counter to the correct chapter
			counter = savedInstanceState.getInt("COUNTER");
			requestBookText();
		}
	}

	public interface OnTextReadyCallback {
		void getText(String book, int chapter);
	}

}
