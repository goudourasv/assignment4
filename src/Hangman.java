/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.program.*;
import acm.util.*;

public class Hangman extends ConsoleProgram {
    private static final int NUMBER_OF_TURNS = 8;
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private String currentString;
    private int guessesCounter;
    private String selectedWord = selectWord();
    private HangmanLexicon myHangmanLexicon;

    public void run() {
        setupGame();
        playGame();
    }
    private void playGame() {
        guessesCounter = NUMBER_OF_TURNS;
        println("Welcome to Hangman");
        currentString = printDashes();
        while(guessesCounter>0){
            println("The word now looks like this: " + currentString);
            println("You have " + guessesCounter + " guesses left");
            String guessedLetter = readLine("Guess a letter:");
            guessedLetter = guessedLetter.toUpperCase();
            println("Your guess is: " + guessedLetter);
            currentString = replaceCorrectLettersInString(guessedLetter);
            if (guessesCounter == 0){
                println("you are completely hung");
                println("The word was" + selectedWord);
                break;
            }
            if(currentString.equals(selectedWord)) {
                println("You guessed the word: " + currentString);
                println("You Win!!");
                break;
            }
        }
    }

    private String replaceCorrectLettersInString(String guessedLetter) {
        String result = currentString;
        boolean correctLetter = false;

        for(int i=0; i<selectedWord.length(); i++){
            char ch = selectedWord.charAt(i);
            String letter = String.valueOf(ch);
            letter = letter.toUpperCase();
           if(guessedLetter.equals(letter)){
               correctLetter = true;
               result =result.substring(0,i) + guessedLetter + result.substring(i+1);
           }
        }
        if (correctLetter == true) {
            println("The guess is correct");
        }else{
            println("There are no " + guessedLetter + "'s in the word");
            guessesCounter--;
        }
        return result;
    }

    private void setupGame() {
        selectedWord = selectWord();

    }

    //select a secret word at random
    private String selectWord() {
        myHangmanLexicon = new HangmanLexicon();
        int randomCase = rgen.nextInt(10);
        selectedWord = myHangmanLexicon.getWord(randomCase);
        return selectedWord;
    }

    //Prints a row of dashes,one for each letter
    private String printDashes() {
        String result = "";
        for(int i =0; i<selectedWord.length(); i++){
            result = result + "-";

        }
        return result;
    }
}
