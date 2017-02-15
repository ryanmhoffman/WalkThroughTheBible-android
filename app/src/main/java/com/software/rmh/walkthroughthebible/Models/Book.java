package com.software.rmh.walkthroughthebible.Models;

import android.os.Parcel;
import android.os.Parcelable;
/**
 * Created by rhoffman on 2/9/17.
 *
 * Represents one book of the Bible. It only contains information about the book, it does not have all of the text that makes up
 * the book. The actual content of each book is pulled from a .txt file at runtime.
 *
 * This class only contains, the Name, the Index number in standard Biblical order, the number of chapters, and a reference of
 * every location mentioned within the book.
 */

public class Book implements Parcelable {

	private String name;
	private int chapters;
	private int index;
	private String[][] locations;

	/**
	 * If this constructor is used, the variables will be null until they are set with the setter methods.
	 *
	 * Use with caution as it is possible to call a getter before a setter and have a null value returned.
	 */
	public Book(){
		// Empty constructor.
	}

	/**
	 * Optional constructor to set all the variables at once instead of using the setter methods.
	 *
	 * @param name a String that is just the name of the book of the Bible.
	 * @param chapters an int representing the number of chapters the book has.
	 * @param index an int representing the numerical value of the book when in order as in a typical Bible.
	 * @param locations a two-dimensional array listing all locations referenced in the book, sorted by chapter.
	 */
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

	/**
	 * Sets chapters variable if not set by the optional constructor. Returns the Book object so the methods can be chained
	 * together if desired.
	 *
	 * @param chapters an int representing the number of chapters the book has.
	 * @return Book
	 */
	public Book setChapters(int chapters) {
		this.chapters = chapters;
		return this;
	}

	/**
	 * Sets index variable if not set by the optional constructor. Returns the Book object so the methods can be chained
	 * together if desired.
	 *
	 * @param index an int representing the numerical value of the book when in order as in a typical Bible.
	 * @return Book
	 */
	public Book setIndex(int index) {
		this.index = index;
		return this;
	}

	/**
	 * Sets locations variable if not set by the optional constructor. Returns the Book object so the methods can be chained
	 * together if desired.
	 * @param locations a two-dimensional array listing all locations referenced in the book, sorted by chapter.
	 * @return Book
	 */
	public Book setLocations(String[][] locations) {
		this.locations = locations;
		return this;
	}

	/**
	 * Sets name variable if not set by the optional constructor. Returns the Book object so the methods can be chained
	 * together if desired.
	 *
	 * @param name a String that is just the name of the book of the Bible.
	 * @return Book
	 */
	public Book setName(String name) {
		this.name = name;
		return this;
	}

	private Book(Parcel in) {
		name = in.readString();
		chapters = in.readInt();
		index = in.readInt();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeInt(chapters);
		dest.writeInt(index);
	}

	@SuppressWarnings("unused")
	public static final Parcelable.Creator<Book> CREATOR = new Parcelable.Creator<Book>() {
		@Override
		public Book createFromParcel(Parcel in) {
			return new Book(in);
		}

		@Override
		public Book[] newArray(int size) {
			return new Book[size];
		}
	};


}
