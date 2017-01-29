package com.software.rmh.walkthroughthebible.Controllers;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.software.rmh.walkthroughthebible.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

	private ArrayList<String> books = new ArrayList<>();
	private int position;
	private TextView bookText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book);

		Bundle bundle = getIntent().getExtras();
		if(bundle != null){
			books = bundle.getStringArrayList("ARRAYLIST");
			position = bundle.getInt("BOOK_POSITION");
		}

		// Set the ActionBar title to the name of the book.
		if(getSupportActionBar() != null) getSupportActionBar().setTitle(books.get(position));

		bookText = (TextView) findViewById(R.id.bookText);

		new BookAsyncTask().execute(books.get(position));
	}

	private String setBookTextString(String book){
		String text = null;

		if(bookText != null){
			// Use try with resources so the BufferedReader gets closed automatically when exiting.
			// This saves writing the code to manually close it in a finally block.
			try(BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("KingJamesVersion/" + book + ".txt")))){
				String line;
				while((line = reader.readLine()) != null){
					// We can assume that the file is only one line.
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
	 *
	 * There should be a circular progress bar while the text is loading that cancels once loaded. This has not been implemented yet.
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
			return setBookTextString(params[0]);
		}

		// On the main thread, after background thread is finished
		@Override
		protected void onPostExecute(String result) {
			super.onPostExecute(result);
			bookText.setText(result);
		}
	}

}
