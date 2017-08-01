package com.software.rmh.walkthroughthebible.Models

import android.content.Context

import java.io.IOException
import java.io.InputStreamReader
import java.io.LineNumberReader

/**
 * Created by RMH on 2/17/17.

 */

class ChapterLoader(internal var context: Context) {

	fun loadChapter(book: String): String {
		var text: String? = null
		// Use try with resources so the BufferedReader gets closed automatically when exiting.
		try {
			LineNumberReader(InputStreamReader(context.assets.open("KingJamesVersion/$book.txt"))).use { reader ->

				if ((text = reader.readLine()) != null) return text
			}
		} catch (e: IOException) {
			e.printStackTrace()
		}

		return text
	}

	fun loadAnotherChapter(book: String, counter: Int): String {
		var text: String? = null
		// Use try with resources so the BufferedReader gets closed automatically when exiting.
		try {
			LineNumberReader(InputStreamReader(context.assets.open("KingJamesVersion/$book.txt"))).use { reader ->
				var line: String
				// Loop through all lines before the one needed, stopping at the correct one.
				for (i in 0..counter - 1) {
					if ((line = reader.readLine()) != null) {
						text = line
					}
				}

			}
		} catch (e: IOException) {
			e.printStackTrace()
		}

		return text
	}

	private fun getLocationsForChapter(bookIndex: Int, chapterNumber: Int): Array<String> {
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
