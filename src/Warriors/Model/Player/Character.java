package Warriors.Model.Player;

import Warriors.Model.Weapons.*;

public abstract class Character {

	// Attributes

	private String name;
	private int strength;
	private int health;
	private int maxHealth;
	private int maxStrength;
	private Weapon weapon;

	// Constructors

	public Character() {
		this.name = "Player 1";
		this.strength = 5;
		this.health = 5;
		this.weapon = new BareHands();
	}

	public Character(String name) {
		this.name = name;
		this.strength = 5;
		this.health = 5;
		this.weapon = new BareHands();
	}

	public Character(String name, int strength, int health) {
		this.name = name;
		this.strength = strength;
		this.health = health;
		this.weapon = new BareHands();
	}

	// Setters

	public void setName(String name) {
		this.name = name;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	// Getters

	public String getName() {
		return name;
	}

	public int getStrength() {
		return strength;
	}

	public int getHealth() {
		return health;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getMaxStrength() {
		return maxStrength;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	// Methods

	@Override
	public String toString() {
		return name + " " + "| Strength : " + strength + " Health : " + health;
	}

	public void addWeapon(Weapon weapon) {
		if (this.weapon.getDamage() == 0 || this.weapon.getDamage() < weapon.getDamage()) {
			this.weapon = weapon;
			int currentPlayerStrength = this.getStrength() + weapon.getDamage();
			this.setStrength(currentPlayerStrength);
			System.out.println(weapon);
		} else
			System.out.println("Tu as déjà un meilleur équipement. \n");
	}

}
