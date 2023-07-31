import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends Applet implements ItemListener {
	int n;
	Choice ch;
		
	public Main()
	{
		ch = new Choice();
		ch.addItem("Select Shape");
		ch.addItem("Rectangle");
		ch.addItem("Triangle");
		ch.addItem("Square");
		ch.addItem("Circle");
		ch.addItemListener(this);
		add(ch);
	}
	
	public void paint(Graphics g) {
		if(n==0) {}
		else if(n==1) 
		{
			g.drawRect(20, 30, 100, 50);
		} 
		else if(n==2) 
		{
			int[] x = {20, 50, 80};
			int[] y = {90, 50, 90};
			g.drawPolygon(x, y, 3);
		}
		else if(n==3)
		{
			g.drawRect(20, 40, 50, 50);
		}
		else if(n==4)
		{
			g.drawOval(20, 40, 100, 100);;
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		n = ch.getSelectedIndex();
		repaint();
		
	}

}
