import java.awt.*;
import java.awt.event.*;

class MyCalculator extends Frame implements ActionListener {

	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button b1, b2, b3, b4;
	
	public MyCalculator() {
		setTitle("Calculator");
		setSize(500, 500);
		setLocation(700, 300);
		setLayout(null);
		setVisible(true);
		
		l1 = new Label("Enter Number 1: ");
		l1.setBounds(10, 50, 120, 30);
		t1 = new TextField();
		t1.setBounds(130, 50, 100, 30);
		
		
		l2 = new Label("Enter Number 2: ");
		l2.setBounds(10, 100, 100, 30);
		t2 = new TextField();
		t2.setBounds(130, 100, 100, 30);
		
		l3 = new Label("Result: ");
		l3.setBounds(10, 150, 100, 30);
		t3 = new TextField();
		t3.setBounds(130, 150, 100, 30);
		
		b1 = new Button("ADD");
		b1.setBounds(30, 200, 50, 30);
		b1.addActionListener(this);
		b2 = new Button("SUB");
		b2.setBounds(90, 200, 50, 30);
		b2.addActionListener(this);
		b3 = new Button("DIV");
		b3.setBounds(150, 200, 50, 30);
		b3.addActionListener(this);
		b4 = new Button("REM");
		b4.setBounds(210, 200, 50, 30);
		b4.addActionListener(this);
		
		
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		float n1 = Float.parseFloat(t1.getText());
		float n2 = Float.parseFloat(t2.getText());
		
		if(e.getSource()==b1) {
			t3.setText(String.valueOf(n1+n2));
		} else if(e.getSource()==b2) {
			t3.setText(String.valueOf(n1-n2));
		} else if(e.getSource()==b3) {
			t3.setText(String.valueOf(n1/n2));
		} else {
			t3.setText(String.valueOf(n1%n2));
		}
		
	}
}

public class Main {
	public static void main(String[] args) {
		new MyCalculator();
	}
}