package game;

import java.util.Random;

public class SixSidedLetterDice {
	//a board is conceptually made of letter "dice" that is randomly distributed each game
	//each dice has letters on it
	//for example in a 4x4 game each dice is 6 sided
	//one dice, for example, is AAAFRS
	//this is to model the frequency of letters in English words
	//in the case of a 4x4 board with 6 sided nice, this is how the game Boggle does it
	
	private String d1 = "ASPFFK";
	private String d2 = "NUIHMQ";
	private String d3 = "OBJOAB";
	private String d4 = "LNHNRZ";
	private String d5 = "AHSPCO";
	private String d6 = "RYVDEL";
	private String d7 = "IOTMUC";
	private String d8 = "LREIXD";
	private String d9 = "TERWHV";
	private String d10 = "TSTIYD";
	private String d11 = "WNGEEH";
	private String d12 = "ERTTYL";
	private String d13 = "OWTOAT";
	private String d14 = "AEANEG";
	private String d15 = "EIUNES";
	private String d16 = "TOESSI";
	
	public static String getDiceFromID(int ID) {
		switch(ID) {
		case 1: return "ASPFFK";
		case 2: return "NUIHMQ";
		case 3: return "OBJOAB";
		case 4: return "LNHNRZ";
		case 5: return "AHSPCO";
		case 6: return "RYVDEL";
		case 7: return "IOTMUC";
		case 8: return "LREIXD";
		case 9: return "TERWHV";
		case 10: return "TSTIYD";
		case 11: return "WNGEEH";
		case 12: return "ERTTYL";
		case 13: return "OWTOAT";
		case 14: return "AEANEG";
		case 15: return "EIUNES";
		case 16: return "TOESSI";
		default: return "ZZZZZZ";
		}
	}
	
	public static String getLetterFromString(String dice) {
		Random random = new Random();
		int randomNumber = random.nextInt(dice.length());
		return Character.toString(dice.charAt(randomNumber));		
	}
}
