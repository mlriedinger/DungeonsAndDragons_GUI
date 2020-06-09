package Warriors.Model.Weapons;

import Warriors.Model.Player.Character;
import Warriors.Model.Player.Warrior;

public class Sword extends Weapon {

	// Constants

	private final static String NAME = "Epée";
	private final static int DAMAGE = 5;

	// Constructor

	public Sword() {
		super(NAME, DAMAGE);
	}

	// Methods

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void interactWithPlayer(Character player) {
		System.out.println("Une arme !");
		if (player instanceof Warrior) {
			player.addWeapon(this);
			System.out.println("Ta force est désormais de : " + player.getStrength() + "\n");
		}
		else System.out.println("Cette arme n'est pas pour les magiciens. \n");
	}

}
