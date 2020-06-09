package Warriors.Model.Weapons;

import Warriors.Model.Player.Character;
import Warriors.Model.Player.Wizard;

public class Fireball extends Weapon {

	// Constants

	private final static String NAME = "Boule de feu";
	private final static int DAMAGE = 7;

	// Constructor

	public Fireball() {
		super(NAME, DAMAGE);
	}
	
	// Methods
	
	@Override
	public String toString() {
		return super.toString(); 
	}
	
	@Override
	public void interactWithPlayer(Character player) {
		System.out.println("Nouveau sort disponible !");
		if (player instanceof Wizard) {
			player.addWeapon(this);
			System.out.println("Ta force est désormais de : " + player.getStrength() + "\n");
		}
		else System.out.println("Pas de bol, la magie c'est pas pour les guerriers. \n");
	}
}
