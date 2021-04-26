/*
 * File: FileLexicon.java
 * -------------------------
 * This file contains a stub implementation of the FileLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import acm.util.*;
import java.io.*;
import java.util.ArrayList;

public class FileLexicon implements Lexicon {
    private ArrayList<String> wordList;

    public FileLexicon(){
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
    }
}
