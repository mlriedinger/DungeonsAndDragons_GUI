package Warriors.Model;

import Warriors.Controller.Menu;
import Warriors.Model.Board.Board;
import Warriors.Model.Board.Cell;
import Warriors.Model.Player.*;
import Warriors.Model.Player.Character;
import Warriors.Model.Ennemies.Ennemy;

public class Game {

	// Constants

	private final int NO_CHARACTER = 0;
	private final int WITH_CHARACTER = 1;
	private final int START_GAME = 2;
	private final int FIGHTING = 3;
	private final int CHARACTER_DEAD = 4;
	private final int END_GAME = 5;
	private final int QUIT_GAME = 6;
	private final int BOARD_SIZE = 64;

	// Attributes

	private Character character;
	private Menu menu;
	private int stateOfGame;
	private int dice;
	private int playerPosition;
	private Board board;

	// Constructor

	public Game() {
		this.character = null;
		this.menu = new Menu();
		this.stateOfGame = NO_CHARACTER;
		this.playerPosition = 1;
		this.board = new Board();
	}

	// Methods

	/** This function launches the main menu of the game **/

	public void launchMenu() {
		do {
			String playerAnswer = menu.displayMainMenu();
			switch (playerAnswer) {
			case "C":
				createCharacter();
				break;
			case "Q":
				System.out.println("Oh, tu pars déjà ?");
				stateOfGame = QUIT_GAME;
				break;
			default:
				System.out.println("Relis les instructions petit malin...");
				break;
			}
		} while (stateOfGame == NO_CHARACTER);
	}

	/**
	 * This function asks the player what type of character he/she wants to play
	 * with and its name
	 **/

	public void createCharacter() {
		String playerAnswer = menu.displaySubMenu();
		String name = menu.askUserForName();
		switch (playerAnswer) {
		case "1":
			this.character = new Warrior(name);
			System.out.println("Tu as choisi un guerrier bourrin.");
			break;

		case "2":
			this.character = new Wizard(name);
			System.out.println("Tu as choisi un magicien.");
			break;
		}
		stateOfGame = WITH_CHARACTER;
		launchMenuWithCharacter();
	}

	/**
	 * This function launches a new menu once a character is created, so that the
	 * player may have more options such as display the current character or modify
	 * its name
	 */

	public void launchMenuWithCharacter() {
		do {
			String playerAnswer = menu.displayMenuWithCharacter();
			switch (playerAnswer) {
			case "A":
				System.out.println(character.toString());
				break;
			case "M":
				modifyCharacter();
				break;
			case "J":
				stateOfGame = START_GAME;
				playGame();
				break;
			case "R":
				stateOfGame = NO_CHARACTER;
				launchMenu();
				break;
			case "Q":
				System.out.println("Tu nous quittes ?");
				stateOfGame = QUIT_GAME;
				break;
			}
		} while (stateOfGame == WITH_CHARACTER);
	}

	/**
	 * This function launches a menu at the end of the game, so that the player may
	 * choose to play again with the same character, or with a new character or to
	 * quit the game
	 */

	public void launchEndMenu() {
		do {
			String playerAnswer = menu.displayEndMenu();
			switch (playerAnswer) {
			case "J":
				System.out.println("C'est reparti !");
				stateOfGame = WITH_CHARACTER;
				launchMenuWithCharacter();
			case "C":
				System.out.println("C'est reparti !");
				stateOfGame = NO_CHARACTER;
				launchMenu();
			case "Q":
				System.out.println("Tu nous quittes ?");
				stateOfGame = QUIT_GAME;
				break;
			}
		} while (stateOfGame == END_GAME || stateOfGame == CHARACTER_DEAD);
	}

	/** This function asks the player for a new character name **/

	public void modifyCharacter() {
		String name = menu.askUserForName();
		character.setName(name);
		System.out.println("Le nouveau nom de ton personnage est : " + character.toString());
	}

	/**
	 * This function runs the game The player rolls the dice and the character moves
	 * accordingly on the board
	 **/

	public void playGame() {
		stateOfGame = START_GAME;
		while (playerPosition < BOARD_SIZE) {
			// menu.askUserToRollDice();
			rollDice();
			playerPosition(dice);
			moveToCell(playerPosition, character);
		}
		stateOfGame = END_GAME;
		launchEndMenu();
	}

	/** This function returns a random number between 1 and 6 */

	public int rollDice() {
		dice = 1 + (int) (Math.random() * ((6 - 1) + 1));
		System.out.println("Lancé de dé ... tu obtiens " + dice + "\n");
		return dice;
	}

	/**
	 * This function makes the character move on the board as long as it has not
	 * reached the end of the board
	 */

	public int playerPosition(int dice) {
		if ((playerPosition + dice) < BOARD_SIZE) {
			playerPosition += dice;
			System.out.println("Tu avances jusqu'à la case " + playerPosition);
		} else {
			playerPosition = BOARD_SIZE;
			System.out.println("Tu es sur la case " + playerPosition);
		}
		return playerPosition;
	}

	private void moveToCell(int index, Character character) {
		try {
			Cell currentCell = board.currentCell(index);
			if (currentCell instanceof Ennemy) {
				stateOfGame = FIGHTING;
			}
			currentCell.interactWithPlayer(character);
			if (character.getHealth() == 0) {
				stateOfGame = CHARACTER_DEAD;
			}

		} catch (NullPointerException e) {
			System.out.println("");
		}
	}

}
