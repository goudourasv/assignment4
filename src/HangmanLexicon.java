/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import acm.util.*;
import java.io.*;
import java.util.ArrayList;

public class HangmanLexicon {
	private ArrayList<String> wordList;
//This is the HangmanLexicon constructor
	public HangmanLexicon(){
		wordList = new ArrayList<>();
		try {
			BufferedReader rd = new BufferedReader(new FileReader("HangmanLexicon.txt"));
			while (true) {
				String word = rd.readLine();
				if (word == null) break;
				wordList.add(word);
			}
			rd.close();
		}catch (IOException ex) {
			throw new ErrorException(ex);
		}
	}



/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return wordList.size();
	}

/** Returns the word at the specified index. */
	public String getWord(int index) {
			return wordList.get(index);
//		switch (index) {
//			case 0: return "BUOY";
//			case 1: return "COMPUTER";
//			case 2: return "CONNOISSEUR";
//			case 3: return "DEHYDRATE";
//			case 4: return "FUZZY";
//			case 5: return "HUBBUB";
//			case 6: return "KEYHOLE";
//			case 7: return "QUAGMIRE";
//			case 8: return "SLITHER";
//			case 9: return "ZIRCON";
//			default: throw new ErrorException("getWord: Illegal index");
		}
}
