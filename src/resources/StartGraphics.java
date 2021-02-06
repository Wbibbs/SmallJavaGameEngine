package resources;

//Found from Java2s, modified for our purposes

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//Implement a tick-based system that updates the entire screen, then paints it when available
public class StartGraphics extends JPanel {

	static int length = 640;//X value of window
	static int width = 480;//Y value of window
	public void paint(Graphics g) {
		//Dimension d = this.getPreferredSize();
		int fontSize = 15;

		g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));

		g.setColor(Color.black);

		for (int i = 0; i < length - 20; i += 25)//Change length and  width values so the printed values don't go out of the window
		{
			for (int n = 0; n < width - 30; n+= 25)
			{
				g.drawString("*", i, n);
			}

			System.out.println();
		}
		g.drawString("^", 0, 0);
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException {
		JFrame frame = new JFrame("FireFly");
		//Image a = ImageIO.read(new File("\\graphics\\icon.png\\"));//Cannot read for some reason
		//frame.setIconImage(a);
		frame.getContentPane().add(new StartGraphics());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(length, width);
		frame.setVisible(true);
	}
}