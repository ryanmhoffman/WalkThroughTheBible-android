package com.software.rmh.walkthroughthebible.Controllers;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import com.software.rmh.walkthroughthebible.R;
import com.software.rmh.walkthroughthebible.Views.BookListFragment;

public class MainActivity extends AppCompatActivity {

	// Keys to identify each Fragment in the stack.
	private static String BOOKS_FRAGMENT_KEY = "BookList";
	private static String GLOSSARY_FRAGENT_KEY = "Glossary";
	private static String TOUR_FRAGMENT_KEY = "VirtualTour";
	private static String BIBLES_FRAGMENT_KEY = "BiblesList";
	private static String ABOUT_FRAGMENT_KEY = "About";

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if(savedInstanceState == null){
			Log.d("frag", "test");
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			ft.add(BookListFragment.newInstance(), BOOKS_FRAGMENT_KEY).commit();
		}

		initViews();

	}

	private void initViews(){
		BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationBar);
		bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item) {
				changeFragment(item);
				return true;
			}
		});
	}

	private void changeFragment(MenuItem item){
		Fragment fragment = null;

		switch(item.getItemId()){
			case R.id.books:
				// Books Fragment
				fragment = BookListFragment.newInstance();
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

		if(fragment != null){
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			ft.add(R.id.container, fragment);
			ft.commit();
		}
	}
}
