package tokens;

import board.Board;
import board.Position;
import tokens.AbstractPawn;

public class King extends AbstractPawn {
	public King(Colors color){
		super(color,Pawns.king);
	}
	
	public boolean allows(Position from,Position to,Board board) {
		return to.is_inside_board()
			&& (Math.abs(from.rank()-to.rank()) + Math.abs(from.file()-to.file()) == 1)
			&& this.is_safe(to,board);
	}
	
	public boolean is_safe(Position q,Board board) {
		// Not correct : does not take into account the possibility that the new position "to" put the King in danger!
		return true;
	}
}
