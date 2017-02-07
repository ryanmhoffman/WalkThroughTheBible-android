package com.software.rmh.walkthroughthebible.Models;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by rhoffman on 2/2/17.
 *
 * Just a map of all books of the Bible with how many chapters each has.
 */

public class Books {

	private static final Map<String, Integer> map = new HashMap<>();

	public Books(){
		map.put("Genesis", 50);
		map.put("Exodus", 40);
		map.put("Leviticus", 27);
		map.put("Numbers", 36);
		map.put("Deuteronomy", 34);
		map.put("Joshua", 24);
		map.put("Judges", 21);
		map.put("Ruth", 4);
		map.put("1 Samuel", 31);
		map.put("2 Samuel", 24);
		map.put("1 Kings", 22);
		map.put("2 Kings", 25);
		map.put("1 Chronicles", 29);
		map.put("2 Chronicles", 36);
		map.put("Ezra", 10);
		map.put("Nehemiah", 13);
		map.put("Esther", 10);
		map.put("Job", 42);
		map.put("Psalms", 150);
		map.put("Proverbs", 31);
		map.put("Ecclesiastes", 12);
		map.put("Song of Solomon", 8);
		map.put("Isaiah", 66);
		map.put("Jeremiah", 52);
		map.put("Lamentations", 5);
		map.put("Ezekiel", 48);
		map.put("Daniel", 12);
		map.put("Hosea", 14);
		map.put("Joel", 3);
		map.put("Amos", 9);
		map.put("Obadiah", 1);
		map.put("Jonah", 4);
		map.put("Micah", 7);
		map.put("Nahum", 3);
		map.put("Habakkuk", 3);
		map.put("Zephaniah", 3);
		map.put("Haggai", 2);
		map.put("Zechariah", 14);
		map.put("Malachi", 4);
		map.put("Matthew", 28);
		map.put("Mark", 16);
		map.put("Luke", 24);
		map.put("John", 21);
		map.put("Acts", 28);
		map.put("Romans", 16);
		map.put("1 Corinthians", 16);
		map.put("2 Corinthians", 13);
		map.put("Galatians", 6);
		map.put("Ephesians", 6);
		map.put("Philippians", 4);
		map.put("Colossians", 4);
		map.put("1 Thessalonians", 5);
		map.put("2 Thessalonians", 3);
		map.put("1 Timothy", 6);
		map.put("2 Timothy", 4);
		map.put("Titus", 3);
		map.put("Philemon", 1);
		map.put("Hebrews", 13);
		map.put("James", 5);
		map.put("1 Peter", 5);
		map.put("2 Peter", 3);
		map.put("1 John", 5);
		map.put("2 John", 1);
		map.put("3 John", 1);
		map.put("Jude", 1);
		map.put("Revelations", 22);
	}

}
