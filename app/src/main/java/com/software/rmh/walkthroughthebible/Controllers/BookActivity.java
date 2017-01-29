package com.software.rmh.walkthroughthebible.Controllers;

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
		setBookText(books.get(position));
	}

	// TODO: refactor this as it is currently incredibly inefficient with memory
	// Possibly run this on a background thread, but it is so slow it causes a 1+ second lag
	// Perhaps break it up into smaller files that load in chunks, one after the next
	private void setBookText(String book){
		if(bookText != null){
			// Use try with resources so the BufferedReader gets closed automatically when exiting.
			// This saves writing the code to manually close it in a finally block.
			try(BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("KingJamesVersion/" + book + ".txt")))){
				String line;
				while((line = reader.readLine()) != null){
					// We can assume that the file is only one line.
					bookText.setText(line);
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
