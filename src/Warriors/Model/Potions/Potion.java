package Warriors.Model.Potions;

import Warriors.Model.Board.Cell;
import Warriors.Model.Player.Character;

public abstract class Potion implements Cell {

	// Attributes

	private String name;
	private int healBonus;
	private static Potion randomPotion;
	
	// Constructor

	public Potion(String name, int healBonus) {
		this.name = name;
		this.healBonus = healBonus;
	}
	
	// Getters
	
	public int getHealBonus() {
		return this.healBonus;
	}

	// Methods
	
	/** This function chooses randomly a potion */
	
	public static Potion randomPotion() {
		int dice = 1 + (int) (Math.random() * ((6 - 1) + 1));
		switch(dice) {
		case 1 :
		case 2 :
		case 3 :
		case 4 :
			randomPotion = new MinorHealPotion();
			break;
		case 5 : 
		case 6 :
			randomPotion = new MajorHealPotion();
			break;
		}
		return randomPotion;
	}
	
	@Override
	public String toString() {
		return "Une " + name + " ! Tu gagnes " + healBonus + " points de vie !";
	}

}
