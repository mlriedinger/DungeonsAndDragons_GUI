package Warriors.Model.Weapons;

import Warriors.Model.Player.Character;
import Warriors.Model.Player.Warrior;

public class Hammer extends Weapon {

	// Constants

	private final static String NAME = "Massue";
	private final static int DAMAGE = 3;

	// Constructor

	public Hammer() {
		super(NAME, DAMAGE);
	}

	// Methods

	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void interactWithPlayer(Character player) {
		System.out.println("Nouvelle arme disponible !");
		if (player instanceof Warrior) {
			player.addWeapon(this);
			System.out.println("Ta force est désormais de : " + player.getStrength() + "\n");
		}
		else System.out.println("Dommage, cette arme n'est pas pour les magiciens. \n");
	}
}
