package resources.graphics;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MainDraw extends JComponent {

    public int x = 50;
    public int y = 50;
    Map map1 = new Map(10, 10);
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.drawRect(x, y, 50, 50); 
//        g.fillRect(x, y, 50, 50);
//        g.setColor(Color.BLACK);
        
		for (int i = 0; i < map1.getX(); i++) {
			for (int n = 0; n < map1.getY(); n++) {
				g.drawString(map1.getMap(i, n), (30 * i) + 10, (30 * n) + 15);
			}
		}
    }

    public void moveRight() {
        try {
        	map1.addEvent(map1.getPlayerX(), map1.getPlayerY(), "*");
            map1.setPlayerX(map1.getPlayerX() + 1);
            map1.addEvent(map1.getPlayerX(), map1.getPlayerY(), "v");
            repaint();
        } catch (Exception e) {
        	printError(e);
        }
    }

    public void moveLeft() {
        try {
        	map1.addEvent(map1.getPlayerX(), map1.getPlayerY(), "*")     ;
            map1.setPlayerX(map1.getPlayerX() - 1);
            map1.addEvent(map1.getPlayerX(), map1.getPlayerY(), "^");
            repaint();
        } catch (Exception e) {
        	printError(e);
        }
    }

    public void moveDown() {
        try {
        	map1.addEvent(map1.getPlayerX(), map1.getPlayerY(), "*");
            map1.setPlayerY(map1.getPlayerY() + 1);
            map1.addEvent(map1.getPlayerX(), map1.getPlayerY(), ">");
            repaint();
        } catch (Exception e) {
        	printError(e);
        }
    }

    public void moveUp() {
        try {
        	map1.addEvent(map1.getPlayerX(), map1.getPlayerY(), "*");
            map1.setPlayerY(map1.getPlayerY() - 1);
            map1.addEvent(map1.getPlayerX(), map1.getPlayerY(), "<");
            repaint();
        } catch (Exception e) {
        	printError(e);
        }
    }

	private void printError(Exception e) {
		
		
	}
}