package Warriors.View;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private SpringLayout springLayout;
	private final int BUTTON_WIDTH = 150;
	private final int BUTTON_HEIGHT = 35;
	private final int BUTTON_SPACING = -5;
	private final int BUTTON_RIGHT_MARGIN = -120;
	private final int POSITIVE_BORDER = 20;
	private final int NEGATIVE_BORDER = -20;

	public GUI() {

		// Construction de la fenêtre
		this.setSize(1280, 720);
		this.setTitle("D&D Warriors Campus Num Chambéry");
		this.setLocation(10, 10);

		// Instructions à la fermeture de la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBuild();
		layoutBuild();

		// Affichage de la fenêtre (toujours mettre à la fin !)
		this.setVisible(true);
	}

	public void menuBuild() {
		// Création d'une barre de menu

		// Etape 1 : Création de la barre de menu
		JMenuBar menuBar = new JMenuBar();

		// Etape 2 : Création d'un menu Jeu dans la barre de menu
		JMenu menuGame = new JMenu("Jeu");

		// Etape 3 : Création des éléments du menu Jeu
		JMenuItem create = new JMenuItem("Créer un personnage");
		JMenuItem play = new JMenuItem("Lancer une partie");
		JMenuItem quit = new JMenuItem(new QuitAction("Quitter"));

		// Etape 4 : Ajout des élément au menu Jeu
		menuGame.add(create);
		menuGame.add(play);
		menuGame.add(quit);

		// Etape 5 : Ajout du menu Jeu à la barre de menu
		menuBar.add(menuGame);

		// Ajout des menus Configuration et Aide

		JMenu menuConfig = new JMenu("Configuration");
		JMenuItem displayCharacter = new JMenuItem("Afficher le personnage");
		JMenuItem modifyCharacter = new JMenuItem("Modifier le personnage");

		menuConfig.add(displayCharacter);
		menuConfig.add(modifyCharacter);

		menuBar.add(menuConfig);

		JMenu menuHelp = new JMenu("Aide");
		JMenuItem helpItem = new JMenuItem(new HelpAction(this, "Aide"));
		
		menuHelp.add(helpItem);

		menuBar.add(menuHelp);

		// Attachement de la barre de menu à la fenêtre
		this.setJMenuBar(menuBar);
	}

	public void layoutBuild() {
		this.springLayout = new SpringLayout();
		this.setLayout(springLayout);

		Container contentPane = this.getContentPane();
		contentPane.setBackground(Color.black);

		// Boutons

		JButton btnMoveForward = new JButton("Avancer");
		JButton btnRollDice = new JButton("Lance le dé");
		JButton btnQuitGame = new JButton("Quitter le jeu");

		btnMoveForward.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		btnRollDice.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
		btnQuitGame.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));

		contentPane.add(btnMoveForward);
		contentPane.add(btnRollDice);
		contentPane.add(btnQuitGame);

		springLayout.putConstraint(SpringLayout.SOUTH, btnQuitGame, NEGATIVE_BORDER, SpringLayout.SOUTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, btnQuitGame, BUTTON_RIGHT_MARGIN, SpringLayout.EAST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, btnRollDice, BUTTON_SPACING, SpringLayout.NORTH, btnQuitGame);
		springLayout.putConstraint(SpringLayout.EAST, btnRollDice, BUTTON_RIGHT_MARGIN, SpringLayout.EAST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, btnMoveForward, BUTTON_SPACING, SpringLayout.NORTH, btnRollDice);
		springLayout.putConstraint(SpringLayout.EAST, btnMoveForward, BUTTON_RIGHT_MARGIN, SpringLayout.EAST,
				contentPane);

		// Panels
		// Board panel
		JPanel boardPanel = new BoardPanel();
		boardPanel.setPreferredSize(new Dimension(this.getWidth() * 2 / 3, this.getHeight()));
		contentPane.add(boardPanel);

		springLayout.putConstraint(SpringLayout.NORTH, boardPanel, POSITIVE_BORDER, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, boardPanel, POSITIVE_BORDER, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, boardPanel, NEGATIVE_BORDER, SpringLayout.SOUTH, contentPane);

		// Character panel
		JPanel characterPanel = new CharacterPanel();
		characterPanel.setPreferredSize(new Dimension(this.getWidth() / 3, this.getHeight() / 3));
		contentPane.add(characterPanel);

		springLayout.putConstraint(SpringLayout.NORTH, characterPanel, POSITIVE_BORDER, SpringLayout.NORTH,
				contentPane);
		springLayout.putConstraint(SpringLayout.EAST, characterPanel, NEGATIVE_BORDER, SpringLayout.EAST, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, characterPanel, POSITIVE_BORDER, SpringLayout.EAST, boardPanel);

		// Action panel
		JPanel actionPanel = new ActionPanel();
		actionPanel.setPreferredSize(new Dimension(this.getWidth() / 3, this.getHeight() / 3));
		contentPane.add(actionPanel);

		springLayout.putConstraint(SpringLayout.NORTH, actionPanel,(this.getHeight() / 3 + 2 * POSITIVE_BORDER), SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, actionPanel, NEGATIVE_BORDER, SpringLayout.EAST, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, actionPanel, POSITIVE_BORDER, SpringLayout.EAST, boardPanel);
		
	}

}
