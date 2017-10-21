package game;
//will have methods for checking if a played word was valid (exists in the game board)
//and the points earned
//could one day check to see if word played is an actually word

public class GameWord {
	
	public boolean isValidWord(String aString, GameBoard aGameBoard) {
		//oh god, I think this function should probably involve recursion??
		//at any rate, this is some kind of search
		char Start = aString.charAt(0);
		String match = "";
		String[][] board = aGameBoard.getBoard();
		Boolean isMatch = true;
		
		for(int i = 0; i < aGameBoard.getDimension() - 1; i++) {
			for(int j = 0; j < aGameBoard.getDimension() - 1; j++) {
				if(board[i][j].equals(Character.toString(Start))) {
					
				}
			}
		}
		return false;
	}
}
