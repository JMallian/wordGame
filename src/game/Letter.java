package game;

import java.util.Random;

//since E has a frequency of 12.02 in the English language (approximately) and 12% of 1000 is 120 the first
//120 integers correspond to E, and so on for every letter in the alphabet
//due to rounding up the range of number is not 1000, but 1002

public class Letter {
	private static int endRange = 1002;
	
	//used by fillBoard() in GameBoard class
	public static String getLetter() {
		Random random = new Random();
		int randomNumber = random.nextInt(endRange + 1);
		if(randomNumber <= 120) {
			return "E";
		} else if(randomNumber <= 211) {
			return "T";
		} else if(randomNumber <= 292) {
			return "A";
		} else if(randomNumber <= 371) {
			return "O";
		} else if(randomNumber <= 444) {
			return "I";
		} else if(randomNumber <= 514) {
			return "N";
		} else if(randomNumber <= 577) {
			return "S";
		} else if(randomNumber <= 637) {
			return "R";
		} else if(randomNumber <= 696) {
			return "H";
		} else if(randomNumber <= 739) {
			return "D";
		} else if(randomNumber <= 779) {
			return "L";
		} else if(randomNumber <= 808) {
			return "U";
		} else if(randomNumber <= 835) {
			return "C";
		} else if(randomNumber <= 861) {
			return "M";
		} else if(randomNumber <= 884) {
			return "F";
		} else if(randomNumber <= 905) {
			return "Y";
		} else if(randomNumber <= 926) {
			return "W";
		} else if(randomNumber <= 946) {
			return "G";
		} else if(randomNumber <= 964) {
			return "P";
		} else if(randomNumber <= 979) {
			return "B";
		} else if(randomNumber <= 990) {
			return "V";
		} else if(randomNumber <= 997) {
			return "K";
		} else if(randomNumber <= 999) {
			return "X";
		} else if(randomNumber == 1000) {
			return "Qu"; //because in almost all words with q, q is usually followed by u
		} else if(randomNumber == 1001) {
			return "J";
		} else if(randomNumber == 1002) {
			return "Z";
		} else {
			return "Something went wrong.";
		}
	}
}
