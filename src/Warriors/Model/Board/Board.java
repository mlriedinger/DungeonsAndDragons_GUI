package Warriors.Model.Board;

import java.util.ArrayList;
import java.util.Arrays;
import Warriors.Model.Ennemies.*;
import Warriors.Model.Potions.*;
import Warriors.Model.Weapons.*;

public class Board {
	
	// Constants
	
	private final Integer[] DRAGON_LIST = {45, 52, 56, 62};
	private final Integer[] WARLOCK_LIST = {10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
	private final Integer[] GOBLIN_LIST = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
	private final Integer[] HAMMER_LIST = {2, 5, 11, 22, 38};
	private final Integer[] SWORD_LIST = {19, 26, 42, 53};
	private final Integer[] LIGHTNING_LIST = {1, 4, 8, 17, 23};
	private final Integer[] FIREBALL_LIST = {48, 49};
	private final Integer[] MINOR_HEAL_POTION_LIST = {7, 13, 31, 33, 39, 43};
	private final Integer[] MAJOR_HEAL_POTION_LIST = {28, 41};
	private final int BOARD_SIZE = 64;
	
	// Attributes
	

	private ArrayList<Cell> cellList = new ArrayList<Cell>();
	
	// Constructors
	
	/** Constructor with no parameter so that the board will be filled according to the instructions of 
	 * the exercise 
	 */
	
	public Board() {
		this.cellList.add(0, new EmptyCell());
		for (int i = 1; i < BOARD_SIZE; i++){
			if (Arrays.asList(DRAGON_LIST).contains(i)) this.cellList.add(new Dragon());
			else if (Arrays.asList(WARLOCK_LIST).contains(i)) this.cellList.add(new Warlock());
			else if (Arrays.asList(GOBLIN_LIST).contains(i)) this.cellList.add(new Goblin());
			else if (Arrays.asList(HAMMER_LIST).contains(i)) this.cellList.add(new Hammer());
			else if (Arrays.asList(SWORD_LIST).contains(i)) this.cellList.add(new Sword());
			else if (Arrays.asList(LIGHTNING_LIST).contains(i)) this.cellList.add(new Lightning());
			else if (Arrays.asList(FIREBALL_LIST).contains(i)) this.cellList.add(new Fireball());
			else if (Arrays.asList(MINOR_HEAL_POTION_LIST).contains(i)) this.cellList.add(new MinorHealPotion());
			else if (Arrays.asList(MAJOR_HEAL_POTION_LIST).contains(i)) this.cellList.add(new MajorHealPotion());
			else this.cellList.add(new EmptyCell());
		}
	}
	
	/** Constructor with a parameter that gives the size of the board and fills it randomly **/ 
	
	public Board(int BOARD_SIZE) {
		this.cellList.add(0, new EmptyCell());
		for (int i = 1; i < BOARD_SIZE; i++) {
			int dice = 1 + (int) (Math.random() * ((6 - 1) + 1));
			switch(dice) {
			case 1 :
			case 2 :
				this.cellList.add(new EmptyCell());
				break;
			case 3 :
				this.cellList.add(Ennemy.randomEnnemy());
				break;
			case 4 : 
				this.cellList.add(Weapon.randomWeapon());
				break;
			case 5 :
			case 6 :
				this.cellList.add(Potion.randomPotion());
				break;
			}
		}	
	}
	
	// Methods
	
	public Cell currentCell(int index) {
		if (index >=0 && index < this.cellList.size()) {
			return this.cellList.get(index);
		}
		else return null;
	}
	
	public void removeCell(int index) {
		if (index >=0 && index < this.cellList.size()) {
			this.cellList.set(index, new EmptyCell());
		}
	}
	
	public String toString() {
		String res = "[";
		for (int i = 0; i < BOARD_SIZE; i++) {
			res += "Case " + i + " : " + this.cellList.get(i) + "]\r[";
		}
		return res;
	}
}
