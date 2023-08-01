import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame implements KeyListener {
	
	public MyApp() {
		setSize(600, 300);
		setLayout(null);
		setVisible(true);
		setLocation(600, 600);
		
		addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Key Typed: "+ e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		new MyApp();
	}
}
