package board;

import java.util.Vector;

import tokens.AbstractPawn;
import tokens.Colors;

public class Board {
	Vector<AbstractPawn> board;
	public final static int SIZE = 8;
	public final static int SQUARES = Board.SIZE * Board.SIZE;
	
	public Board(){
		this.board = new Vector<AbstractPawn>(Board.SQUARES);
		
		for(int i=0; i< Board.SQUARES; ++i)
			this.board.addElement(null);
	}
	
	public int size() {
		return Board.SIZE;
	}
	
	static Position position(int no) {
		return new Position(no);
	}
	
	static public Position position(int rank,int file) {
		return new Position(rank,file);
	}
	
	static public Position position(String reference) {
		int rank = (int)(reference.charAt(1) - '1');
		int file = (int)(reference.charAt(0) - 'a');
		return new Position(rank,file);
	}
	
	public AbstractPawn getPawn(Position q) {
		return this.board.get(q.no());
	}
	
	public void setPawn(Position q,AbstractPawn p) {
		this.board.set(q.no(), p);
	}
	
	public void show() {
		String rank = null;
		for(int i=Board.SIZE-1; i>=0; --i) { // The board is printed top-down
			rank = "";
			for(int j=0; j< Board.SIZE; ++j) {
				Position q = Board.position(i,j);
				AbstractPawn p = this.getPawn(q);
				rank += "[" + (p == null ? " " : p.pawnRepresentation())
					 +  "," + (p == null ? " " : p.colorRepresentation())
					 +  "," + (q.color() == Colors.dark ? 'x' : '0')
					 +  "]";
			}
			System.out.println(rank);
		}
	}
	
	public boolean is_free(Position q) {
		return this.getPawn(q) == null;
	}
}
