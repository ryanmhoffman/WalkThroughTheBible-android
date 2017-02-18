package com.software.rmh.walkthroughthebible.Controllers;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.software.rmh.walkthroughthebible.Models.Book;
import com.software.rmh.walkthroughthebible.Models.Wrapper;
import com.software.rmh.walkthroughthebible.R;
import com.software.rmh.walkthroughthebible.Views.ChapterFragment;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity implements OnMapReadyCallback{

	private ArrayList<Book> books = new ArrayList<>();
	private int position;
	private ChapterFragment fragment;

	private static String FRAG_TAG = "CHAPTER_FRAGMENT";

	private FragmentManager fm = getFragmentManager();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book);

		Bundle bundle = getIntent().getExtras();
		if(bundle != null){
			fragment = (ChapterFragment) fm.findFragmentByTag(FRAG_TAG);

			if(fragment == null){
				fragment = new ChapterFragment();
				fragment.setArguments(bundle);
			}

			fm.beginTransaction().replace(R.id.bookContainer, fragment, FRAG_TAG).commit();

			Wrapper wrapper = (Wrapper) bundle.getSerializable("ARRAYLIST");
			books = wrapper.getBooks();
			position = bundle.getInt("BOOK_POSITION");
		}

		// Set the ActionBar title to the name of the book.
		if(getSupportActionBar() != null) getSupportActionBar().setTitle(books.get(position).getName());

		MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);
	}

	@Override
	public void onMapReady(GoogleMap googleMap) {
		LatLng Jerusalem = new LatLng(31.7683, 35.2137);
		googleMap.addMarker(new MarkerOptions().position(Jerusalem).title("Canton, OH"));
		googleMap.moveCamera(CameraUpdateFactory.newLatLng(Jerusalem));
	}
}
