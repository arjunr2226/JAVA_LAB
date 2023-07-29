import java.awt.*;
import java.applet.Applet;
public class Main extends Applet {
	public void paint(Graphics g) {
    	g.setColor(Color.black);
    	g.fillRect(100, 150, 200, 200);
    	g.setColor(Color.white);
    	g.fillOval(100, 150, 200, 200);
    	g.setColor(Color.black);
    	g.drawLine(100, 150, 300, 350);
	}
}
