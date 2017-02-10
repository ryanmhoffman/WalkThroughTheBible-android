package com.software.rmh.walkthroughthebible.Controllers;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.software.rmh.walkthroughthebible.Models.BibleLocationsKJV;
import com.software.rmh.walkthroughthebible.Models.Book;
import com.software.rmh.walkthroughthebible.Models.Books;
import com.software.rmh.walkthroughthebible.R;
import com.software.rmh.walkthroughthebible.Views.AboutFragment;
import com.software.rmh.walkthroughthebible.Views.BiblesFragment;
import com.software.rmh.walkthroughthebible.Views.BookListFragment;
import com.software.rmh.walkthroughthebible.Views.GlossaryFragment;
import com.software.rmh.walkthroughthebible.Views.VirtualTourFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BookListFragment.BookListFragmentListener {

	// Keys to identify each Fragment in the stack.
	private static String BOOKS_FRAGMENT_KEY = "BookList";
	private static String GLOSSARY_FRAGMENT_KEY = "Glossary";
	private static String TOUR_FRAGMENT_KEY = "VirtualTour";
	private static String BIBLES_FRAGMENT_KEY = "BiblesList";
	private static String ABOUT_FRAGMENT_KEY = "About";

	// ArrayList of Book objects. Will need to be accessed by other classes.
	private ArrayList<Book> books = new ArrayList<>();

	FragmentManager fm = getFragmentManager();
	AHBottomNavigation bottomNavigation;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if(savedInstanceState == null){
			fm.beginTransaction().add(R.id.container, BookListFragment.newInstance(), BOOKS_FRAGMENT_KEY).commit();
			if(getSupportActionBar() != null) getSupportActionBar().setTitle(R.string.books);
		}
		initViews();
		initBooks();

	}

	private void initViews(){

		bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);
		AHBottomNavigationItem books = new AHBottomNavigationItem(getString(R.string.books), ContextCompat.getDrawable(this, R.drawable.icon_book));
		AHBottomNavigationItem glossary = new AHBottomNavigationItem(getString(R.string.glossary), ContextCompat.getDrawable(this, R.drawable.icon_glossary));
		AHBottomNavigationItem tour = new AHBottomNavigationItem(getString(R.string.tour), ContextCompat.getDrawable(this, R.drawable.icon_tour));
		AHBottomNavigationItem bibles = new AHBottomNavigationItem(getString(R.string.bibles), ContextCompat.getDrawable(this, R.drawable.icon_bible));
		AHBottomNavigationItem about = new AHBottomNavigationItem(getString(R.string.about), ContextCompat.getDrawable(this, R.drawable.icon_about));

		bottomNavigation.addItem(books);
		bottomNavigation.addItem(glossary);
		bottomNavigation.addItem(tour);
		bottomNavigation.addItem(bibles);
		bottomNavigation.addItem(about);

		bottomNavigation.setBehaviorTranslationEnabled(true);
		bottomNavigation.setDefaultBackgroundColor(ContextCompat.getColor(this, R.color.nav_bar_background));

		bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
			@Override
			public boolean onTabSelected(int position, boolean wasSelected) {
				changeFragment(position);
				return true;
			}
		});
	}

	private void changeFragment(int position){

		switch(position){
			case 0:
				replaceCurrentFragment(BOOKS_FRAGMENT_KEY, BookListFragment.newInstance(), R.string.books);
				break;
			case 1:
				replaceCurrentFragment(GLOSSARY_FRAGMENT_KEY, GlossaryFragment.newInstance(), R.string.glossary);
				break;
			case 2:
				replaceCurrentFragment(TOUR_FRAGMENT_KEY, VirtualTourFragment.newInstance(), R.string.tour);
				break;
			case 3:
				replaceCurrentFragment(BIBLES_FRAGMENT_KEY, BiblesFragment.newInstance(), R.string.bibles);
				break;
			case 4:
				replaceCurrentFragment(ABOUT_FRAGMENT_KEY, AboutFragment.newInstance(), R.string.about);
				break;
			default:
				break;
		}

	}

	private void replaceCurrentFragment(String key, Fragment fragment, int titleResource){
		fm.beginTransaction().replace(R.id.container, fragment, key).commit();
		if(getSupportActionBar() != null) getSupportActionBar().setTitle(titleResource);
	}

	@Override
	public void onScroll(int direction) {

	}

	/**
	 * Creates all 66 books of the Bible and adds them to an ArrayList that stores them in order.
	 * Each Book object contains the name, which is pulled from resources in the strings.xml from an array,
	 * the number of chapters, which is pulled from a HashMap in Books.class, the book number in numerical order which
	 * is just equal to the index plus one, since indexing starts at 0 but the first book of the Bible (Genesis) is
	 * book 1, and finally two-dimensional String array which all the locations referenced in that book, broken out
	 * by each chapter as its own array.
	 */
	private void initBooks(){
		BibleLocationsKJV kjv = new BibleLocationsKJV();
		// Gets the array from Resources (strings.xml)
		String[] bookNames = getResources().getStringArray(R.array.all_books);
		// Stops looping at 65 because there are 66 books and 0-65 == 66 loops.
		for(int i = 0; i < 66; i++) {
			Book book = new Book();
			book.setName(bookNames[i]) // Only works because the books are in order in the array
					.setChapters(Books.getMap().get(bookNames[i])) // Sets number of chapters the book has
					.setIndex(i+1) // Loop index + 1 == book index
					.setLocations(kjv.getBookLocations(i));
			books.add(book);
		}
	}

}
