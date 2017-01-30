package com.software.rmh.walkthroughthebible.Views;


import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.software.rmh.walkthroughthebible.R;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChapterFragment extends Fragment {

	private TextView bookText;
	private ArrayList<String> books = new ArrayList<>();
	private int position;
	private String book;
	private int chapter;
	private Bundle bundle;

	public ChapterFragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View root = inflater.inflate(R.layout.fragment_chapter, container, false);

		if((bundle = getArguments()) != null){
			books = bundle.getStringArrayList("ARRAYLIST");
			position = bundle.getInt("BOOK_POSITION");

			book = books.get(position);
		}

		bookText = (TextView) root.findViewById(R.id.bookText);
		new BookAsyncTask().execute(book);
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

		if(bookText != null){
			// Use try with resources so the BufferedReader gets closed automatically when exiting.
			try(LineNumberReader reader = new LineNumberReader(new InputStreamReader(this.getActivity().getAssets().open("KingJamesVersion/" + book + ".txt")))){
				String line;
				if((line = reader.readLine()) != null){
					text = line;
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		// Returns the text of the book or null if unable to get the text.
		// The possibility of null return is on purpose.
		return text;
	}

	/**
	 * AsyncTask is required in order to not lag the main thread when loading the .txt file. Some of the books are very long
	 * and loading takes up to 2 or 3 seconds. This allows the view to load so the app doesn't freeze, and when the text
	 * finishes loading into memory it gets displayed inside the TextView.
	 */
	private class BookAsyncTask extends AsyncTask<String, Long, String> {

		// On the main thread, before the task starts
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
		}

		// On a separate thread in the background
		@Override
		protected String doInBackground(String... params) {
			return getBookText(params[0]);
		}

		// On the main thread, after background thread is finished
		@Override
		protected void onPostExecute(String result) {
			super.onPostExecute(result);
			bookText.setText(result);
		}
	}

}
