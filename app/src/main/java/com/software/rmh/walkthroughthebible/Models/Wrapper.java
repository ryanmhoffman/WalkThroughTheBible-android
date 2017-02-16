package com.software.rmh.walkthroughthebible.Models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by rhoffman on 2/15/17.
 */

public class Wrapper implements Serializable {

	private ArrayList<Book> list;

	public Wrapper(ArrayList<Book> books){
		list = books;
	}

	public ArrayList<Book> getBooks(){
		return list;
	}
}
