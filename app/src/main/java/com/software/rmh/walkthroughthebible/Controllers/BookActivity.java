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
import com.software.rmh.walkthroughthebible.R;
import com.software.rmh.walkthroughthebible.Views.ChapterFragment;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity implements OnMapReadyCallback{

	private ArrayList<String> books = new ArrayList<>();
	private int position;

	private FragmentManager fm = getFragmentManager();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book);

		Bundle bundle = getIntent().getExtras();
		if(bundle != null){
			ChapterFragment fragment = new ChapterFragment();
			fragment.setArguments(bundle);
			fm.beginTransaction().add(R.id.bookContainer, fragment).commit();
		}

		if(bundle != null){
			books = bundle.getStringArrayList("ARRAYLIST");
			position = bundle.getInt("BOOK_POSITION");
		}

		// Set the ActionBar title to the name of the book.
		if(getSupportActionBar() != null) getSupportActionBar().setTitle(books.get(position));

		MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);
	}


	@Override
	public void onMapReady(GoogleMap googleMap) {
		LatLng canton = new LatLng(40.7989, 81.3784);
		googleMap.addMarker(new MarkerOptions().position(canton).title("Canton, OH"));
		googleMap.moveCamera(CameraUpdateFactory.newLatLng(canton));
	}
}
