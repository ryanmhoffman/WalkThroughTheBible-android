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
import com.software.rmh.walkthroughthebible.Models.Wrapper;
import com.software.rmh.walkthroughthebible.R;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
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
		//new BookAsyncTask().execute(book);
		bookText.setText(getBookText(book));
		return root;
	}

	/**
	 * Opens a .txt file from assets and reads the selected chapter into a String.
	 *
	 * @param book A String containing the name of the book requested.
	 * @return String containing the requested chapter.
	 */
	private String getBookText(String book){
		String text = null;

		if(counter == 1){

			if(bookText != null){
				// Use try with resources so the BufferedReader gets closed automatically when exiting.
				try(LineNumberReader reader = new LineNumberReader(new InputStreamReader(this.getActivity().getAssets().open("KingJamesVersion/" + book + ".txt")))){
					String line;
					// Assign the String value if not null.
					if((line = reader.readLine()) != null) text = line;
				} catch(IOException e){
					e.printStackTrace();
				}
			}

		}

		// Returns the text of the book or null if unable to get the text.
		// The possibility of null return is on purpose.
		return text;
	}

	// Count up to the line right before the one needed, then read the next line into a String and return it.
	private String getNextOrPreviousChapter(){
		String text = null;

		if(bookText != null){
			// Use try with resources so the BufferedReader gets closed automatically when exiting.
			try(LineNumberReader reader = new LineNumberReader(new InputStreamReader(this.getActivity().getAssets().open("KingJamesVersion/" + book + ".txt")))){
				// Loop through all lines before the one needed, stopping at the correct one.
				for(int i = 0; i < counter; i++) {
					String line;
					// Null check and String value assignment
					if((line = reader.readLine()) != null) {
						text = line;
						// Reset the ScrollView to the top
						scrollView.scrollTo(0, 0);

					} else {
						// Prevents counter from climbing way beyond the number of chapters in the book.
						// Even if the user keeps pressing the next button counter will only ever get as
						// high as the highest chapter number.
						counter--;
					}
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		}

		return text;
	}

	private void setFABListeners(){
		next.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				counter++;
				if(getNextOrPreviousChapter() != null){
					bookText.setText("");
					bookText.setText(getNextOrPreviousChapter());
				}
			}
		});

		previous.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(counter > 1) counter--;
				if(getNextOrPreviousChapter() != null){
					bookText.setText("");
					bookText.setText(getNextOrPreviousChapter());
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
