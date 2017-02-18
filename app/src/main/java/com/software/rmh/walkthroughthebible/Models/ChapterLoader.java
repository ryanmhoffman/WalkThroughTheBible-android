package com.software.rmh.walkthroughthebible.Models;

import android.content.Context;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
/**
 * Created by RMH on 2/17/17.
 *
 */

public class ChapterLoader {

	public ChapterLoader(){

	}

	public String loadChapter(Context context, String book){
		String text = null;
		// Use try with resources so the BufferedReader gets closed automatically when exiting.
		try(LineNumberReader reader =
					new LineNumberReader(new InputStreamReader(context.getAssets().open("KingJamesVersion/" + book + ".txt")))){

			if((text = reader.readLine()) != null) return text;
		} catch(IOException e){
			e.printStackTrace();
		}

		return text;
	}

	public String loadAnotherChapter(Context context, String book, int counter){
		String text = null;
		// Use try with resources so the BufferedReader gets closed automatically when exiting.
		try(LineNumberReader reader =
					new LineNumberReader(new InputStreamReader(context.getAssets().open("KingJamesVersion/" + book + ".txt")))){
			String line;
			// Loop through all lines before the one needed, stopping at the correct one.
			for(int i = 0; i < counter; i++) {
				if((line = reader.readLine()) != null) {
					text = line;
				}
			}

		} catch(IOException e){
			e.printStackTrace();
		}

		return text;
	}

}
