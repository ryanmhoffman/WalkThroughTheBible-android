package com.software.rmh.walkthroughthebible.Models

import android.content.Context
import com.software.rmh.walkthroughthebible.Enums.Version

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
		val path: String = "KingJamesVersion/$book.txt"
		try {
			LineNumberReader(
                InputStreamReader(
                    context.assets.open(path))).use { reader ->
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
	 * @return String? It will return the line containing the chapter
	 * corresponding to the number it is on, except when at the beginning or
	 * end of a book, then it returns null.
	 */
	fun loadAnotherChapter(book: String, counter: Int): String? {
		var text: String? = null
        val path: String = "KingJamesVersion/$book.txt"
		try {
			LineNumberReader(
                InputStreamReader(
                    context.assets.open(path))).use { reader ->
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

    // TODO: Clean this up, test it, etc.
	/**
	 * Algorithm to move between the chapters in a given book. It will allow
	 * you to move from the first chapter incrementally to the last, but no
	 * further due to restrictions on the incrementer.
	 */
    fun loadAChapter(version: Version = Version.KJV,
					 book: String, counter: Int): String? {
		var text: String? = null
		// Should the "when() be a separate function?"
        var path: String = ".txt"
		when(version){
			Version.KJV -> path = "KingJamesVersion/$book.txt"
			Version.ESV -> path = ".txt" // ESV not yet supported...
		}
		try {
		    LineNumberReader(
				InputStreamReader(
					context.assets.open(path))).use { reader ->
                var line: String?
				// Should counter be checked here to ensure it is not out of
				// bounds for the book?
				for (i in 0..counter - 1){
					line = reader.readLine()
                    text = line
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
