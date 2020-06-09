package Warriors.Model.Ennemies;

import Warriors.Model.Board.Cell;
import Warriors.Model.Player.Character;

public abstract class Ennemy implements Cell {

	// Attributes

	private String name;
	private int strength;
	private int health;
	private static Ennemy randomEnnemy;
	private int currentEnnemyHealth;
	private int damageReceived;

	// Constructor

	public Ennemy(String name, int strength, int health) {
		this.name = name;
		this.strength = strength;
		this.health = health;
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

	// Methods

	/** This function chooses randomly a foe */

	public static Ennemy randomEnnemy() {
		int dice = 1 + (int) (Math.random() * ((6 - 1) + 1));
		switch (dice) {
		case 1:
		case 2:
		case 3:
		case 4:
			randomEnnemy = new Goblin();
			break;
		case 5:
			randomEnnemy = new Warlock();
			break;
		case 6:
			randomEnnemy = new Dragon();
			break;
		}
		return randomEnnemy;
	}
	
	public int receiveDamage(Character player) {
		currentEnnemyHealth = this.health;
		if (currentEnnemyHealth != 0) {
			damageReceived = player.getStrength();
			currentEnnemyHealth -= damageReceived;
		}
		else {
			System.out.println("Le " + this.name + "est mort ! \n");
		}
		return currentEnnemyHealth;
	}
	
	private void hitPlayer(Character player) {
		int currentPlayerHealth = player.getHealth();
		if (currentPlayerHealth != 0) {
			currentPlayerHealth -= this.strength;
			player.setHealth(currentPlayerHealth);
		}
	}

	@Override
	public void interactWithPlayer(Character player) {
		System.out.println("Oh non ! Un " + this.name + " !");
		receiveDamage(player);
		System.out.println("Le " + this.name + " reçoit " + damageReceived + " points de dégâts ! Il lui reste : " + currentEnnemyHealth + " points de vie.");
		hitPlayer(player);
		System.out.println("Tu perds " + this.strength + " points de vie.");
		System.out.println("Il te reste " + player.getHealth() + " points de vie. \n");
	}

	@Override
	public String toString() {
		return "Un " + name + " | Force : " + strength + " PV : " + health;
	}

}
