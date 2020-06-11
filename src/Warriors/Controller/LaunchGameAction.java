package Warriors.Controller;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import Warriors.View.GUI;

public class LaunchGameAction extends AbstractAction {

	private static final long serialVersionUID = 1L;
	private GUI window;
	
	public LaunchGameAction(GUI window, String text) {
		super(text);
		this.window = window;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		/** Asks user for a player name */

		String name = (String)JOptionPane.showInputDialog(window, "Entre un nom pour ton personnage ...", "Bienvenue !", JOptionPane.QUESTION_MESSAGE);
		
		/** Asks user for a type of character */
		
		JOptionPane d = new JOptionPane(); 
		// les textes figurant // sur les boutons 
		String lesTextes[]={ "bonjour", "au revoir", "bonne nuit", "bonne année"}; 
		// indice du bouton qui a été cliqué ou CLOSED_OPTION 
		int retour = d.showOptionDialog(window, "le message", "le titre", JOptionPane.QUESTION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, lesTextes, lesTextes[0]); 
		if( retour!=JOptionPane.CLOSED_OPTION) {
			;}// un bouton cliqué
		
		
	}

}
