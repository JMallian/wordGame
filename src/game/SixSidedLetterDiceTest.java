package game;

import static org.junit.Assert.*;

import org.junit.Test;

public class SixSidedLetterDiceTest {

	@Test
	public void testGetDiceFromID() {
		String test1 = SixSidedLetterDice.getDiceFromID(1);
		assertEquals("ASPFFK", test1);
	}

	@Test
	public void testGetLetterFromString() {
		String test1 = "ASPFFK";
		String compare = SixSidedLetterDice.getLetterFromString(test1);
		assertTrue(test1.contains(compare));
	}
}
