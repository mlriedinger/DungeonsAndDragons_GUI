package Warriors.Controller;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class QuitAction extends AbstractAction {

	public QuitAction(String text) {
		super(text);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
