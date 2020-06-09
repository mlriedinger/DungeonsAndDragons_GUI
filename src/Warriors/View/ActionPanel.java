package Warriors.View;

import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;


public class ActionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Image diceImg;
	
	public void paintComponent(Graphics g) {
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		try {
			diceImg = ImageIO.read(new File("/Users/marielaureriedinger/Documents/GitHub/DungeonsAndDragons_GUI/images/dice.png"));
			g.drawImage(diceImg, 20, 50, this.getWidth()/4, this.getHeight()/3, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Font font = new Font("Courier", Font.BOLD, 18);
		g.setFont(font);
		g.setColor(Color.black);
		g.drawString("Ceci est un test", 150, 105);
	}

}
