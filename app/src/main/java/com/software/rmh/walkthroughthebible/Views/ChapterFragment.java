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
import com.software.rmh.walkthroughthebible.Models.ChapterLoader;
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

	private ArrayList<Book> books = new ArrayList<>();
	private int position;
	private String book;
	private Bundle bundle;
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

		if((bundle = getArguments()) != null){
			Wrapper wrapper = (Wrapper) bundle.getSerializable("ARRAYLIST");
			books = wrapper.getBooks();
			position = bundle.getInt("BOOK_POSITION");

			book = books.get(position).getName();
		}

		next = (FloatingActionButton) root.findViewById(R.id.nextChapter);
		previous = (FloatingActionButton) root.findViewById(R.id.previousChapter);
		setFABListeners();

		scrollView = (ScrollView) root.findViewById(R.id.scroller);

		bookText = (TextView) root.findViewById(R.id.bookText);
		if(savedInstanceState == null) bookText.setText(requestBookText());

		return root;
	}

	/**
	 * Requests the text of the chapter from ChapterLoader.
	 *
	 * @return String containing the requested chapter.
	 */
	private String requestBookText(){
		String text = null;
		ChapterLoader loader = new ChapterLoader();

		if((counter == 1) && (bookText != null)){
			text = loader.loadChapter(this.getActivity(), book);
		} else if(bookText != null){
			// Reset the ScrollView to the top
			text = loader.loadAnotherChapter(this.getActivity(), book, counter);
			if(counter > chapters.getMap().get(book)) counter--;
			scrollView.scrollTo(0, 0);
		}

		return text;
	}

	private void setFABListeners(){
		next.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				counter++;
				if(requestBookText() != null){
					bookText.setText("");
					bookText.setText(requestBookText());
				}
			}
		});

		previous.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(counter > 1) counter--;
				if(requestBookText() != null){
					bookText.setText("");
					bookText.setText(requestBookText());
				}
			}
		});
	}

	private void clearViews(){
		bookText.setText("");
		next.setVisibility(View.GONE);
		previous.setVisibility(View.GONE);
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}

	@Override
	public void onViewStateRestored(Bundle savedInstanceState) {
		super.onViewStateRestored(savedInstanceState);
		if(savedInstanceState != null){
			clearViews();
			bookText.setText(savedInstanceState.getString("TEXT"));
		}
	}

}
