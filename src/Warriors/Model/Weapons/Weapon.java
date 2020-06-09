package Warriors.Model.Weapons;

import Warriors.Model.Board.Cell;

public abstract class Weapon implements Cell {

	// Attributes

	private String name;
	private int damage;
	private static Weapon randomWeapon;

	// Constructor

	public Weapon(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	// Getters

	public String getName() {
		return name;
	}

	public int getDamage() {
		return damage;
	}

	// Methods

	/** This function chooses randomly a weapon */

	public static Weapon randomWeapon() {
		int dice = 1 + (int) (Math.random() * ((6 - 1) + 1));
		switch (dice) {
		case 1:
		case 3:
			randomWeapon = new Hammer();
			break;
		case 2:
		case 5:
			randomWeapon = new Lightning();
			break;
		case 4:
			randomWeapon = new Fireball();
			break;
		case 6:
			randomWeapon = new Sword();
			break;
		}
		return randomWeapon;
	}

	@Override
	public String toString() {
		return "Arme actuellement équipée : " + name + " " + "| Dégâts : +" + damage;
	}

}
