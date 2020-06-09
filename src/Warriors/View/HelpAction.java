package Warriors.View;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class HelpAction extends AbstractAction {
	
	private GUI window;
	
	public HelpAction(GUI window, String text) {
		super(text);
		this.window = window;
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(window, "Déroulement du jeu\n" + 
				"\n Ce jeu se déroule en mode tour par tour. À chaque tour, le joueur va lancer un dé virtuel à 6 faces afin de connaître le nombre de cases duquel il avance :\n" + 
				"\n Si la nouvelle case atteinte est vide : on passe au tour suivant.\n" + 
				"\n Si la nouvelle case contient un équipement, l’équipement est rajouté au personnage si et seulement si  :\n" + 
				"\t \t ● Le personnage est compatible avec cet équipement \n" + 
				"\t \t ● L’équipement actuel est moins avantageux que le nouveau.\n" + 
				"\n Si la nouvelle case contient une potion : le personnage récupère le nombre de points de vie dé ni par le type de potion.\n" + 
				"\n Si la nouvelle case atteinte contient un ennemi, le combat s’engage.\n" + 
				"\n \n Règle des combats\n" + 
				"\n Le personnage frappe l’ennemi avec la force définie par son équipement (arme ou sorts) et le niveau de vie de l’ennemi diminue en conséquence.\n" + 
				"\n Si le niveau de vie de l’ennemi atteint 0, il meurt.\n" + 
				"Sinon l’ennemi réplique et le niveau de vie du personnage diminue en fonction\n" + 
				"de la force de frappe de l’ennemi. Ce dernier s’enfuit lorsqu’il vous a frappé");
	}

}
