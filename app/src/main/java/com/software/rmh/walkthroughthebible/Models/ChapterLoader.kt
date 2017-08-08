package com.software.rmh.walkthroughthebible.Models

import android.content.Context

import java.io.IOException
import java.io.InputStreamReader
import java.io.LineNumberReader

/**
 * Created by RMH on 2/17/17.
 *
 * This class will load a chapter from the selected book. It keeps track of
 * which chapter it just loaded so that it can correctly load the next or
 * previous one without losing track.
 */

class ChapterLoader(internal var context: Context) {

    // I could probably combine this function with the one below it.
    // I would have to check to see if the first chapter had already been 
    // loaded, and if so, run through the loop.
	fun loadChapter(book: String): String? {
		var text: String? = null
		try {
			LineNumberReader(
                InputStreamReader(
                    context.assets.open("KingJamesVersion/$book.txt"))).use { reader ->
				text = reader.readLine()
				val line = text
				if (text != null) return line
			}
		} catch (e: IOException) {
			e.printStackTrace()
		}

		return text
	}

	/**
	 * Slightly more complicated than loadChapter()
	 *
	 * This function will load chapters 2 through the end of the book, and keep
	 * track of which one is currently being displayed so that it can get the
	 * next or previous one loaded correctly.
	 *
	 * @param book The name of the Book
	 * @param counter The number of chapters in the Book
	 *
	 * @return String? It will return the line containing the chapter corresponding
	 * to the number it is on, except when at the beginning or end of a book,
	 * then it returns null.
	 */
	fun loadAnotherChapter(book: String, counter: Int): String? {
		var text: String? = null
		try {
			LineNumberReader(
                InputStreamReader(
                    context.assets.open("KingJamesVersion/$book.txt"))).use { reader ->
                var line: String?
                // Skip past all lines until arriving at the one needed.
				for (i in 0..counter - 1) {
                    line = reader.readLine()
					if (line != null) {
						text = line
					}
				}

			}
		} catch (e: IOException) {
			e.printStackTrace()
		}

		return text
	}

	private fun getLocationsForChapter(
                    bookIndex: Int, chapterNumber: Int): Array<String> {
		val locations = BibleLocationsKJV()
		val book = locations.getBookLocations(bookIndex)
		return book[chapterNumber]
	}

	private fun highlightLocations(bookIndex: Int, chapterNumber: Int) {
		val cities = getLocationsForChapter(bookIndex, chapterNumber)
		for (city in cities) {

		}
	}

}
