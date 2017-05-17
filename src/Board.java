
public class Board {
	
	String[][] board  = new String[3][3];

	public Board() {
		
	}
	
	public void setMark(String mark, int x, int y) throws InvalidPositionException {
		if (x > 2 || y > 2 || x < 0 || y < 0)
			throw new InvalidPositionException();
		else
			board[x][y] = mark;
	}
	
	public boolean hasWinner() {
		String symbol = "X";
		
		for (int i = 0; i <= 1; i++){
			
			if (i == 1)
				symbol = "O";
			
			if (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol ||
				board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol ||
				board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol)
				return true;
			
			if (board[0][1] == symbol && board[0][1] == symbol && board[0][2] == symbol ||
				board[1][1] == symbol && board[1][1] == symbol && board[1][2] == symbol ||
				board[2][1] == symbol && board[2][1] == symbol && board[2][2] == symbol)
				return true;
				
			if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol ||
				board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
				return true;
		}
		
		return false;
	}
}

