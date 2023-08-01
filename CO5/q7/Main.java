import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame implements MouseListener, MouseMotionListener, WindowListener {
	
	public MyApp() {
		setSize(600, 300);
		setLayout(null);
		setVisible(true);
		setLocation(600, 600);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Window Closing");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window Deiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window Activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window Deactivated");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse Dragged");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Mouse Moved"+ e.getX()+","+e.getY());
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked"+ e.getX()+","+e.getY());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed"+ e.getX()+","+e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited");
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		new MyApp();
	}
}
