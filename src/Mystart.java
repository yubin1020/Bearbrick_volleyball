import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

class Mystart extends JPanel {
	private static final int EXIT_ON_CLOSE = 0;
	Image Start_img = Toolkit.getDefaultToolkit().getImage("mainBackground.png");
	Image i_start = Toolkit.getDefaultToolkit().getImage("gameStart.png");
	Image i_end = Toolkit.getDefaultToolkit().getImage("gameEnd.png");
	public static boolean start = true;
	public static boolean end = false;

	public void paintComponent(Graphics g) {
		g.drawImage(Start_img, 0, 0, 933, 670, this);
		draw_start(g);
		draw_end(g);
	}
	
	void draw_start(Graphics g) {
		if(start == false) {
			g.drawImage(i_start, 240, 300, 190, 40, this);
		}
		else {
			g.drawImage(i_start, 230, 290, 210, 60, this);
		}
	}
	
	void draw_end(Graphics g) {
		if(end == false) {
			g.drawImage(i_end, 500, 300, 190, 40, this);
		}
		else {
			g.drawImage(i_end, 510, 290, 210, 60, this);
		}
	}
}
		
