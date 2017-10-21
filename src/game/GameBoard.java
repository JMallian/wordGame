package game;

public class GameBoard {
	private int dimension;
	private String[][] board;
	
	public void setBoardDimension(int dimension) {
		this.dimension = dimension;
	}
	
	public void createBoard(int dimension) {
		this.dimension = dimension;
		board = new String[dimension][dimension];
		fillBoard();
	}
	
	//in case the GUI wants this
	public int getDimension() {
		return this.dimension;
	}
	
	public String[][] getBoard() {
		return this.board;
	}
	
	public void printBoardToConsole() {
		int letterCount = 0;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j].equals("Qu")) {
					System.out.print(" " + board[i][j] + " "); //to make Qu take up same amount of column space as a single letter
				} else {
					System.out.print(" " + board[i][j] + "  ");
				}
				letterCount++;
				if(letterCount % dimension == 0) { //goes to new row
					System.out.println("");
				}
			}
		}
	}
	
	private void fillBoard() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				board[i][j] = Letter.getLetter();
			}
		}
	}
}
