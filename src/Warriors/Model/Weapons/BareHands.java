package Warriors.Model.Weapons;

import Warriors.Model.Player.Character;

public class BareHands extends Weapon {

	// Constants

	private final static String NAME = "Mains nues";
	private final static int DAMAGE = 0;

	// Constructor

	public BareHands() {
		super(NAME, DAMAGE);
	}

	// Methods

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void interactWithPlayer(Character character) {
		
	}

}
