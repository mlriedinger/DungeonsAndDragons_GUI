package Warriors.Model.Board;

import Warriors.Model.Player.Character;

public class EmptyCell implements Cell {
	
	public EmptyCell() {
		
	}
	
	public String toString() {
		return "La case est vide.";
	}

	@Override
	public void interactWithPlayer(Character character) {
		// TODO Auto-generated method stub
		System.out.println("Cette case est vide... \n");
	}

}
