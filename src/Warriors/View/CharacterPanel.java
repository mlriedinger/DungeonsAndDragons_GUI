package Warriors.View;

import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class CharacterPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Image wizardImg;
	private final int LEFT_MARGIN = 20;

	public void paintComponent(Graphics g) {
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		try {
			wizardImg = ImageIO.read(new File("/Users/marielaureriedinger/Documents/GitHub/DungeonsAndDragons_GUI/images/magicienUI.png"));
			g.drawImage(wizardImg, 150, -50, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Font font = new Font("Courier", Font.BOLD, 20);
		g.setFont(font);
		g.drawString("Magicien", LEFT_MARGIN, this.getHeight()-105);
		g.drawString("Vie : 3", LEFT_MARGIN, this.getHeight()-80);
		g.drawString("Force : 8", LEFT_MARGIN, this.getHeight()-55);
	}
	
	

}
