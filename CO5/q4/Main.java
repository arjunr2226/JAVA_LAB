import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends Applet implements MouseListener
{
	private Color doorColor;
	
	public void init() {
		doorColor = Color.BLUE;
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		setBackground(Color.WHITE);
		
		g.setColor(Color.GREEN);
		g.fillRect(100, 200, 200,  200);
		
		int[] xPoints = {100, 200, 300};
		int[] yPoints = {200, 100, 200};
		
		g.setColor(Color.RED);
		g.fillPolygon(xPoints, yPoints, 3);
		
		g.setColor(doorColor);
		g.fillRect(160, 300, 80, 100);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getX() >= 160 && e.getX() <= 240 && e.getY() >=300 && e.getY() <=400) {
			if(doorColor.equals(Color.BLUE)) {
				doorColor = Color.RED;
			} else {
				doorColor = Color.BLUE;
			}
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
}
