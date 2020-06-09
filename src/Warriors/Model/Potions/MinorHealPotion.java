package Warriors.Model.Potions;

import Warriors.Model.Player.Character;

public class MinorHealPotion extends Potion {

	// Attributes

	private final static String NAME = "potion de soin mineure";
	private final static int HEALBONUS = 2;

	// Constructor

	public MinorHealPotion() {
		super(NAME, HEALBONUS);
	}

	@Override
	public void interactWithPlayer(Character player) {
		System.out.println("Une " + MinorHealPotion.NAME + " !");
		if (player.getHealth() < player.getMaxHealth()) {
			int currentHealth = player.getHealth() + MinorHealPotion.HEALBONUS;
			player.setHealth(currentHealth);
			System.out.println("Tu gagnes " + MinorHealPotion.HEALBONUS + " points de vie !");
			System.out.println("Tu as " + player.getHealth() + " points de vie. \n");
		}
		else System.out.println("Tes points de vie sont déjà au maximum. \n");
	}
}
