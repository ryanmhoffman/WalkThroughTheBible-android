package com.software.rmh.walkthroughthebible.Controllers;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.software.rmh.walkthroughthebible.R;

public class MainActivity extends AppCompatActivity {



	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initViews();

	}

	private void initViews(){
		BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationBar);
		bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item) {
				switch(item.getItemId()){
					case R.id.books:
						// Books Fragment
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
				return false;
			}
		});
	}
}
