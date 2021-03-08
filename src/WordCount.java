/* File:WordCount.java
 *--------------
 *This program  reads a file and reports how many
 * lines, words, and characters appear  in  it.*/

import acm.program.ConsoleProgram;
import acm.util.*;
import java.io.*;
import java.util.ArrayList;

public class WordCount extends ConsoleProgram {
    private ArrayList<String> lineList;
    private ArrayList<String> wordList;
    private ArrayList<String> charList;
    
    public WordCount() {
        lineList = new ArrayList<>();
        wordList = new ArrayList<>();
        charList = new ArrayList<>();

        try {
            BufferedReader rd = new BufferedReader(new FileReader("lear.txt"));
            while (true) {
                String line = rd.readLine();
                if (line == null) break;
                lineList.add(line);
                addWordsToList(line);
                addCharsToList(line);
            }
            rd.close();

        } catch (IOException ex) {
            throw new ErrorException(ex);
        }
    }

    private void addCharsToList(String line) {
        for(int i=0; i<=line.length()-1; i++){
            char ch = line.charAt(i);
            if (Character.isLetter(ch)) {
                String letter = String.valueOf(ch);
                charList.add(letter);
            }
        }
    }

    private void addWordsToList(String line) {
        String[] words= line.split(" ");
        for (int i=0; i<=words.length -1; i++) {
            wordList.add(words[i]);
        }
    }

    public void run(){
        println("File name: lear.txt");
        println("Lines = " + lineList.size());
        println("Words = " + wordList.size());
        println("Chars = " + charList.size());
    }
}