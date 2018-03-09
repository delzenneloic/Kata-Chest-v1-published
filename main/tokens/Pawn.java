package tokens;

import board.Board;
import board.Position;

public class Pawn extends AbstractPawn{
	public Pawn(Colors color){
		super(color,Pawns.pawn);
	}
	
	public Colors color() {
		return this.color;
	}
	
	public boolean allows(Position from,Position to,Board board) {
		switch(this.color) {
			case dark:
				return to.is_inside_board() && from.file() != to.file() && from.rank()-1==to.rank();
			case light:
				return to.is_inside_board() && from.file() != to.file() && from.rank()+1==to.rank();
			default:
				return false;
		}
	}
}
