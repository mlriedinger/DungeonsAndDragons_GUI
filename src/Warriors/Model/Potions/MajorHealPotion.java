package Warriors.Model.Potions;

import Warriors.Model.Player.Character;

public class MajorHealPotion extends Potion {

	// Attributes

	private final static String NAME = "potion de soin majeure";
	private final static int HEALBONUS = 5;

	// Constructor

	public MajorHealPotion() {
		super(NAME, HEALBONUS);
	}

	@Override
	public void interactWithPlayer(Character player) {
		System.out.println("Une " + MajorHealPotion.NAME + " !");
		if (player.getHealth() < player.getMaxHealth()) {
			int currentHealth = player.getHealth() + MajorHealPotion.HEALBONUS;
			player.setHealth(currentHealth);
			System.out.println("Tu gagnes " + MajorHealPotion.HEALBONUS + " points de vie !");
			System.out.println("Tu as " + player.getHealth() + " points de vie. \n");
		}
		else System.out.println("Tes points de vie sont déjà au maximum. \n");
	}
}
