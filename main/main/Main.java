package main;
import files.Reader;
import board.Board;;

public class Main {
	public static void main(String[] args) {
		Reader reader = new Reader("InitialPositions.xml");
		Board b = reader.board();
		
		System.out.println("Welcome to the chest game!");
		System.out.println("");
		
		b.show();
	}
}
