package player;
import board.Position;
import tokens.Colors;
import tokens.Pawn;

public class Player {
	Colors color;
	String name;
	
	Player(Colors color,String name){
		this.color = color;
		this.name = name;
	}
	
	void move(Pawn t,Position p) {
		
	}
}
