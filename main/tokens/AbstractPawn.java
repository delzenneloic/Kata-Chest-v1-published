package tokens;

import board.Board;
import board.Position;

public abstract class AbstractPawn {
	Colors color;
	Pawns pawn;
	
	public AbstractPawn(Colors color,Pawns pawn){
		this.color = color;
		this.pawn = pawn;
	}
	
	public char pawnRepresentation() {
		switch(this.pawn) {
			case pawn:
				return 'p';
			case rook:
				return 'R';
			case knight:
				return 'N';
			case bishop:
				return 'B';
			case queen:
				return 'Q';
			case king:
				return 'K';
			default:
				return '?';
		}
	}
	
	abstract public boolean allows(Position from,Position to,Board board);
	
	public char colorRepresentation() {
		return this.color == Colors.dark ? 'x' : '0';
	}
	
	public Colors color() {
		return this.color;
	}
}
