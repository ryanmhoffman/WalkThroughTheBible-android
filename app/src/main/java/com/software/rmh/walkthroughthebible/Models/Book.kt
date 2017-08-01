package com.software.rmh.walkthroughthebible.Models

import android.os.Parcel
import android.os.Parcelable

import java.io.Serializable

/**
 * Created by rhoffman on 2/9/17.

 * Represents one book of the Bible. It only contains information about the book, it does not have all of the text that makes up
 * the book. The actual content of each book is pulled from a .txt file at runtime.

 * This class only contains, the Name, the Index number in standard Biblical order, the number of chapters, and a reference of
 * every location mentioned within the book.
 */

class Book : Parcelable, Serializable {

	private var name: String? = null
	private var chapters: Int = 0
	private var index: Int = 0
	private var locations: Array<Array<String>>? = null

	/**
	 * If this constructor is used, the variables will be null until they are set with the setter methods.

	 * Use with caution as it is possible to call a getter before a setter and have a null value returned.
	 */
	constructor() {
		// Empty constructor.
	}

	/**
	 * Optional constructor to set all the variables at once instead of using the setter methods.

	 * @param name a String that is just the name of the book of the Bible.
	 * *
	 * @param chapters an int representing the number of chapters the book has.
	 * *
	 * @param index an int representing the numerical value of the book when in order as in a typical Bible.
	 * *
	 * @param locations a two-dimensional array listing all locations referenced in the book, sorted by chapter.
	 */
	constructor(name: String, chapters: Int, index: Int, locations: Array<Array<String>>) {
		this.name = name
		this.chapters = chapters
		this.index = index
		this.locations = locations
	}

	fun getName(): String {
		return name
	}

	fun getChapters(): Int {
		return chapters
	}

	fun getIndex(): Int {
		return index
	}

	fun getLocations(): Array<Array<String>> {
		return locations
	}

	/**
	 * Sets chapters variable if not set by the optional constructor. Returns the Book object so the methods can be chained
	 * together if desired.

	 * @param chapters an int representing the number of chapters the book has.
	 * *
	 * @return Book
	 */
	fun setChapters(chapters: Int): Book {
		this.chapters = chapters
		return this
	}

	/**
	 * Sets index variable if not set by the optional constructor. Returns the Book object so the methods can be chained
	 * together if desired.

	 * @param index an int representing the numerical value of the book when in order as in a typical Bible.
	 * *
	 * @return Book
	 */
	fun setIndex(index: Int): Book {
		this.index = index
		return this
	}

	/**
	 * Sets locations variable if not set by the optional constructor. Returns the Book object so the methods can be chained
	 * together if desired.
	 * @param locations a two-dimensional array listing all locations referenced in the book, sorted by chapter.
	 * *
	 * @return Book
	 */
	fun setLocations(locations: Array<Array<String>>): Book {
		this.locations = locations
		return this
	}

	/**
	 * Sets name variable if not set by the optional constructor. Returns the Book object so the methods can be chained
	 * together if desired.

	 * @param name a String that is just the name of the book of the Bible.
	 * *
	 * @return Book
	 */
	fun setName(name: String): Book {
		this.name = name
		return this
	}

	private constructor(`in`: Parcel) {
		name = `in`.readString()
		chapters = `in`.readInt()
		index = `in`.readInt()
		locations = `in`.readSerializable() as Array<Array<String>>
	}

	override fun describeContents(): Int {
		return 0
	}

	override fun writeToParcel(dest: Parcel, flags: Int) {
		dest.writeString(name)
		dest.writeInt(chapters)
		dest.writeInt(index)
	}

	companion object {

		val CREATOR: Parcelable.Creator<Book> = object : Parcelable.Creator<Book> {
			override fun createFromParcel(`in`: Parcel): Book {
				return Book(`in`)
			}

			override fun newArray(size: Int): Array<Book> {
				return arrayOfNulls(size)
			}
		}
	}


}
