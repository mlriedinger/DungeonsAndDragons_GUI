package Warriors.Model.Player;

public class Warrior extends Character {

	// Constants

	private final static int HEALTH = 5;
	private final static int HEALTH_MAX = 10;
	private final static int STRENGTH = 5;
	private final static int STRENGTH_MAX = 10;

	// Constructors

	// Constructor 1 qui appelle le constructor 2
	public Warrior() {
		this("Player 1");
	}

	// Constructor 2 qui appelle le constructor 3
	public Warrior(String name) {
		this(name, STRENGTH, HEALTH);
	}

	// Constructor 3 qui appelle le constructor de la classe Personnage
	public Warrior(String name, int strength, int health) {
		super(name, strength, health);
	}

	// Getters
	
	@Override
	public int getMaxHealth() {
		return HEALTH_MAX;
	}
	
	@Override
	public int getMaxStrength() {
		return STRENGTH_MAX;
	}
	
	// Methods

	@Override
	public String toString() {
		return "Warrior : " + super.toString();
	}
}
