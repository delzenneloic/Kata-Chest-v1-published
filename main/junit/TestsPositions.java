package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import board.Board;
import board.Position;

public class TestsPositions {

	@Test
	public void test() {
		int k = 3;
		Position a = Board.position(0, 0);
		Position b = Board.position(k, k);
		Position c = Board.position(k, k+1);
		
		assertTrue("OK: a and b are on the same ascending diagonal", a.hasSameAscendingDiagonal(b));
		assertTrue("OK: a and c are not on the same acsending diagonal", !a.hasSameAscendingDiagonal(c));
	}

}
