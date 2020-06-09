package Warriors.Model.Ennemies;

public class Dragon extends Ennemy {

	// Constants

	private final static String NAME = "Dragon";
	private final static int HEALTH = 15;
	private final static int STRENGTH = 4;
	
	// Constructor

	public Dragon() {
		super(NAME, STRENGTH, HEALTH);
	}

}
