package Warriors.Model.Player;

public class Wizard extends Character {

	// Constants

	private final static int HEALTH = 3;
	private final static int HEALTH_MAX = 6;
	private final static int STRENGTH = 8;
	private final static int STRENGTH_MAX = 15;

	// Constructor

	// Constructor 1 qui appelle le constructor 2
	public Wizard() {
		this("Player 1");
	}

	// Constructor 2 qui appelle le constructor 3
	public Wizard(String name) {
		this(name, STRENGTH, HEALTH);
	}

	// Constructor 3 qui appelle le constructor de la classe Personnage
	public Wizard(String name, int strength, int health) {
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
		return "Wizzard : " + super.toString();
	}
}
