package Warriors.View;

import java.awt.*;
import javax.swing.*;

public class BoardPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private final int[][] LEVEL =  {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

	public void paintComponent(Graphics g) {
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		g.setColor(Color.gray);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 12; j++) {
				if (LEVEL[i][j] == 1) {
					g.fill3DRect(50 + j * 62, 80 + i * 52, 60, 50, true);
				}
			}
		}
	}

}
