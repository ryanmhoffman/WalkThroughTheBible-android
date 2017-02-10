package com.software.rmh.walkthroughthebible;

import com.software.rmh.walkthroughthebible.Models.BibleLocationsKJV;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTests {

	@Test
	public void bookArray_isCorrect() {
		BibleLocationsKJV books = new BibleLocationsKJV();
		String[][] Revelations = {
				{"Asia", "Ephesus", "Laodicea", "Philadelphia", "Pergamos", "Patmos", "Sardis", "Smyrna", "Thyatira"},
				{"Ephesus", "Israel", "Pergamos", "Smyrna", "Thyatira"},
				{"Jerusalem", "Laodicea", "Philadelphia", "Sardis", "temple"},
				{null},
				{null},
				{null},
				{"Israel", "temple"},
				{null},
				{"Euphrates"},
				{null},
				{"Egypt", "Sodom", "temple"},
				{null},
				{null},
				{"Babylon", "Sion", "temple"},
				{"temple"},
				{"Babylon", "Euphrates", "temple"},
				{null},
				{"Babylon"},
				{null},
				{"Gog", "Magog"},
				{"Israel", "Jerusalem", "temple"},
				{null}
		};
		assertArrayEquals("Arrays should match", Revelations, books.getBookLocations(65));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void exceptionThrown(){
		BibleLocationsKJV books = new BibleLocationsKJV();
		books.getBookLocations(66);
	}

}