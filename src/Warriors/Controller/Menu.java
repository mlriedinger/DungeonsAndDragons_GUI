package Warriors.Controller;

import java.util.Scanner;

public class Menu {
	
	// Attributes
	
	private Scanner sc;
	private String playerAnswer;

	// Constructor
	
	public Menu() {
		sc = new Scanner(System.in);
	}

	// Methods

	/** Main menu **/
	public String displayMainMenu() {
		
		System.out.println("\n" + "[[ -- MENU PRINCIPAL -- ]] \n");
		System.out.println("C : Créer un personnage \n" + "Q : quitter");
		playerAnswer = sc.nextLine();
		return playerAnswer;
	}

	public String displaySubMenu() {
		System.out.println("\n" + "Quel personnage veux-tu créer ? \n" 
				+ "1. Un guerrier bourrin \n"
				+ "2. Un magicien");
		playerAnswer = sc.nextLine();
		return playerAnswer;
	}

	public String displayMenuWithCharacter() {
		System.out.println("\n" + " [[ -- MENU PERSONNAGE -- ]] \n");
		System.out.println("A : affiche ton personnage \n" 
				+ "M : modifie ton personnage \n"
				+ "J : jouer \n"
				+ "R : retour au menu précédent \n"
				+ "Q : quitter");
		playerAnswer = sc.nextLine();
		return playerAnswer;
	}
	
	public String displayEndMenu() {
		System.out.println("\n" + "-- FIN DE PARTIE --");
		System.out.println("La partie est terminée ! \n");
		System.out.println("J : rejouer avec le même personnage \n" 
				+ "C : créer un nouveau personnage \n"
				+ "Q : quitter (snif..)");
		String playerAnswer = sc.nextLine();
		return playerAnswer;
	}

	public String askUserToRollDice() {
		System.out.println("D : Lances le dé.");
		String playerAnswer = sc.nextLine();
		return playerAnswer;
	}

	public String askUserForName() {
		System.out.println("Comment veux-tu l'appeler ?");
		String name = sc.nextLine();
		return name;
	}
}
