package Warriors.Model.Ennemies;

public class Goblin extends Ennemy {

	// Constants

	private final static String NAME = "Gobelin";
	private final static int HEALTH = 6;
	private final static int STRENGTH = 1;
	
	// Constructor
	
	public Goblin() {
		super(NAME, STRENGTH, HEALTH);
	}

}
