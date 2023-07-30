package q4;

import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame implements ActionListener{
	
	Label l1, l2, l3, l4, l5, l6;
	TextField t1, t2, t3, t4, t5;
	Button b;
	
	public MyApp() {
		super("Percentage Calculator");
		setSize(1000, 600);
		setLayout(null);
		setVisible(true);
		
		l1 = new Label("Enter Mark 1: ");
		l1.setBounds(10, 50, 100, 30);
		t1 = new TextField();
		t1.setBounds(120, 50, 100, 30);
		
		l2 = new Label("Enter Mark 2: ");
		l2.setBounds(10, 100, 100, 30);
		t2 = new TextField();
		t2.setBounds(120, 100, 100, 30);
		
		l3 = new Label("Enter Mark 3: ");
		l3.setBounds(10, 150, 100, 30);
		t3 = new TextField();
		t3.setBounds(120, 150, 100, 30);
		
		l4 = new Label("Enter Mark 4: ");
		l4.setBounds(10, 200, 100, 30);
		t4 = new TextField();
		t4.setBounds(120, 200, 100, 30);
		
		l5 = new Label("Enter Mark 5: ");
		l5.setBounds(10, 250, 100, 30);
		t5 = new TextField();
		t5.setBounds(120, 250, 100, 30);
		
		b = new Button("Find Percentage");
		b.setBounds(120, 300, 100, 30);
		b.addActionListener(this);
		
		l6 = new Label("Percentage: ");
		l6.setBounds(10, 350, 100, 30);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(b);
		add(l6);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = t1.getText();
		String s2 = t2.getText();
		String s3 = t3.getText();
		String s4 = t4.getText();
		String s5 = t5.getText();
		
		if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty()) {
			l6.setText("Enter number Please!");
		}
		else {
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			int n3 = Integer.parseInt(s3);
			int n4 = Integer.parseInt(s4);
			int n5 = Integer.parseInt(s5);
			
			int total = n1+n2+n3+n4+n5;
			float prcnt = (total/500.0f)*100;
			
			l6.setText("Percentage: "+String.valueOf(prcnt));
		}
	}
	
}

public class Main {
	public static void main(String[] args) {
		new MyApp();
	}
}
