package com.software.rmh.walkthroughthebible.Views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.software.rmh.walkthroughthebible.R;

public class MainActivity extends AppCompatActivity {

	private String[] books;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		books = getResources().getStringArray(R.array.all_books);

		initViews();
	}

	private void initViews(){
		ListView listView = (ListView) findViewById(R.id.listView);
		ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, books);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
				Toast.makeText(MainActivity.this, "Clicked " + i, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
