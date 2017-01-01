package com.software.rmh.walkthroughthebible.Controllers;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
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

		if(savedInstanceState == null){
			//FragmentTransaction ft = getFragmentManager().beginTransaction();
			//ft.add(R.id.container, BooksListFragment.newInstance()).commit();
		}

		initViews();

		books = getResources().getStringArray(R.array.all_books);
		// Inflate the layout for this fragment
		ListView listView = (ListView) findViewById(R.id.listView);
		ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, books);
		if(listView != null) {
			listView.setAdapter(adapter);

			listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
					Toast.makeText(MainActivity.this, "Clicked " + i, Toast.LENGTH_SHORT).show();
				}
			});
		}
	}

	private void initViews(){
		BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationBar);
		bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item) {
				changeFragment(item);
				return false;
			}
		});
	}

	private void changeFragment(MenuItem item){
		Fragment fragment = null;

		switch(item.getItemId()){
			case R.id.books:
				// Books Fragment
				//fragment = BooksListFragment.newInstance();
				break;
			case R.id.glossary:
				// Glossary Fragment
				break;
			case R.id.tour:
				// Tour Fragment
				break;
			case R.id.bibles:
				// Bibles Fragment
				break;
			case R.id.about:
				// About Fragment
				break;
		}

		//if(fragment != null){
		//	FragmentTransaction ft = getFragmentManager().beginTransaction();
		//	ft.add(R.id.container, fragment);
		//	ft.commit();
		//}
	}
}
