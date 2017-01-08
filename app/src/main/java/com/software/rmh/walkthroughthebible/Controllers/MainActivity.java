package com.software.rmh.walkthroughthebible.Controllers;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.software.rmh.walkthroughthebible.R;
import com.software.rmh.walkthroughthebible.Views.AboutFragment;
import com.software.rmh.walkthroughthebible.Views.BiblesFragment;
import com.software.rmh.walkthroughthebible.Views.BookListFragment;
import com.software.rmh.walkthroughthebible.Views.GlossaryFragment;
import com.software.rmh.walkthroughthebible.Views.VirtualTourFragment;

public class MainActivity extends AppCompatActivity implements BookListFragment.BookListFragmentListener {

	// Keys to identify each Fragment in the stack.
	private static String BOOKS_FRAGMENT_KEY = "BookList";
	private static String GLOSSARY_FRAGMENT_KEY = "Glossary";
	private static String TOUR_FRAGMENT_KEY = "VirtualTour";
	private static String BIBLES_FRAGMENT_KEY = "BiblesList";
	private static String ABOUT_FRAGMENT_KEY = "About";

	FragmentManager fm = getFragmentManager();
	BottomNavigationView bottomNavigationView;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if(savedInstanceState == null){
			fm.beginTransaction().add(R.id.container, BookListFragment.newInstance(), BOOKS_FRAGMENT_KEY).commit();
		}
		initViews();



	}

	private void initViews(){
		bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationBar);
		bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item) {
				changeFragment(item);
				return true;
			}
		});
	}

	private void changeFragment(MenuItem item){

		switch(item.getItemId()){
			case R.id.books:
				fm.beginTransaction()
						.replace(R.id.container, BookListFragment.newInstance(), BOOKS_FRAGMENT_KEY)
						.commit();
				break;
			case R.id.glossary:
				fm.beginTransaction()
						.replace(R.id.container, GlossaryFragment.newInstance(), GLOSSARY_FRAGMENT_KEY)
						.commit();
				break;
			case R.id.tour:
				fm.beginTransaction()
						.replace(R.id.container, VirtualTourFragment.newInstance(), TOUR_FRAGMENT_KEY)
						.commit();
				break;
			case R.id.bibles:
				fm.beginTransaction()
						.replace(R.id.container, BiblesFragment.newInstance(), BIBLES_FRAGMENT_KEY)
						.commit();
				break;
			case R.id.about:
				fm.beginTransaction()
						.replace(R.id.container, AboutFragment.newInstance(), ABOUT_FRAGMENT_KEY)
						.commit();
				break;
		}

	}

	@Override
	public void onScroll(int direction) {

		switch(direction){
			case BookListFragment.SCROLL_DOWN:
				hideBottomNavigationView();
				break;
			case BookListFragment.SCROLL_UP:
				showBottomNavigationView();
				break;
			case BookListFragment.NO_SCROLL:
				// Do nothing
			default:
				break;
		}
	}

	private void hideBottomNavigationView(){
		bottomNavigationView.animate().translationY(0).setListener(new AnimatorListenerAdapter() {
			@Override
			public void onAnimationEnd(Animator animation) {
				super.onAnimationEnd(animation);
				bottomNavigationView.setVisibility(View.GONE);
			}
		});
	}

	private void showBottomNavigationView(){
		bottomNavigationView.animate().translationY(bottomNavigationView.getHeight()).setListener(new AnimatorListenerAdapter() {
			@Override
			public void onAnimationEnd(Animator animation) {
				super.onAnimationEnd(animation);
				bottomNavigationView.setVisibility(View.VISIBLE);
			}
		});
	}
}
