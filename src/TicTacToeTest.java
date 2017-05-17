import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {

	Board board = new Board();
	
	@Test
	public void emptyBoard() {
		assertEquals(board.hasWinner(), false);
	}
	
	@Test
	public void setValidMarkNoWinner() {
		try {
			board.setMark("X", 0, 0);
		} catch (InvalidPositionException e) {
			fail("Invalid Position");
			e.printStackTrace();
		}
		assertEquals(board.hasWinner(), false);
	}
	
	@Test
	public void setValidMarkWithWinner() {
		try {
			board.setMark("X", 0, 0);
			board.setMark("X", 1, 1);
			board.setMark("X", 2, 2);
		} catch (InvalidPositionException e) {
			fail("Invalid Position");
			e.printStackTrace();
		}
		assertEquals(board.hasWinner(), true);
	}
	
	@Test
	public void setInValidMark() {
		try {
			board.setMark("X", 1, 3);			
		} catch (InvalidPositionException e) {
			assertEquals(e.getMessage(), "Invalid Position");
		}
	}
}
