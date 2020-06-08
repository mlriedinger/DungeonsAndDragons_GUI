package Warriors.View;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GUI extends JFrame {
	
	public GUI() {
		
		// Construction de la fenêtre
		this.setSize(1280, 720);
		this.setTitle("D&D Warriors Campus Num Chambéry");
		this.setLocation(10, 10);
		
		// Instructions à la fermeture de la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Création d'une barre de menu
		// Etape 1 : Création de la barre de menu
		JMenuBar menuBar = new JMenuBar();
		
		// Etape 2 : Création d'un menu Jeu dans la barre de menu
		JMenu menuGame = new JMenu("Jeu");
		
		// Etape 3 : Création des éléments du menu Jeu
		JMenuItem create = new JMenuItem("Créer un personnage");
		JMenuItem play = new JMenuItem("Lancer une partie");
		JMenuItem quit = new JMenuItem("Quitter la partie");
		
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
		
		menuBar.add(menuHelp);
		
		// Attachement de la barre de menu à la fenêtre
		this.setJMenuBar(menuBar);
		
		// Affichage de la fenêtre (toujours mettre à la fin !)
		this.setVisible(true);
	}

}
