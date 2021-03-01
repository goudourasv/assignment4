/*
 * File: HangmanCanvas.java
 * ------------------------
 * This file keeps track of the Hangman display.
 */

import acm.graphics.*;

public class HangmanCanvas extends GCanvas {
	private GLabel currentLabel;
	private GLabel incorrectLettersGuessed;

	public HangmanCanvas(){
		currentLabel = new GLabel("",50,350);
		currentLabel.setFont("SansSerif-20");
		add(currentLabel);
	}

/** Resets the display so that only the scaffold appears */
	public void reset() {
//		drawScaffoldBeamRope();


	}

	private void drawScaffoldBeamRope() {
//		GLine scaffold = new GLine(x,y,x,y1);
//		add(scaffold);
//		GLine beam = new GLine(x,y,x1,y);
//		add(beam);
//		GLine rope = new GLine(x,y,x,y1);
//		add(rope);
	}

	/**
 * Updates the word on the screen to correspond to the current
 * state of the game.  The argument string shows what letters have
 * been guessed so far; unguessed letters are indicated by hyphens.
 */
	public void displayWord(String word) {
		currentLabel.setLabel(word);

	}
/**
 * Updates the display to correspond to an incorrect guess by the
 * user.  Calling this method causes the next body part to appear
 * on the scaffold and adds the letter to the list of incorrect
 * guesses that appears at the bottom of the window.
 */
	public void noteIncorrectGuess(String str) {
		incorrectLettersGuessed = new GLabel(str,50,390);
		incorrectLettersGuessed.setFont("SansSerif-12");
		add(incorrectLettersGuessed);

	}


	/* Constants for the simple version of the picture (in pixels) */
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 36;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 72;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 36;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;

}
