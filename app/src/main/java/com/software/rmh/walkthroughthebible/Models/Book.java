package com.software.rmh.walkthroughthebible.Models;

/**
 * Created by rhoffman on 2/9/17.
 */

public class Book {

	private String name;
	private int chapters;
	private int index;
	private String[][] locations;

	public Book(String name, int chapters, int index, String[][] locations){
		this.name = name;
		this.chapters = chapters;
		this.index = index;
		this.locations = locations;
	}

	public String getName(){
		return name;
	}

	public int getChapters(){
		return chapters;
	}

	public int getIndex(){
		return index;
	}

	public String[][] getLocations() {
		return locations;
	}
}
