import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame implements ActionListener{

	Label l1, l2, l3, l4;
	TextField t1, t2, t3;
	Button b;
	
	public MyApp() {
		super("Maximum of Three numbers");
		setSize(1000, 600);
		setLayout(null);
		setVisible(true);
		
		
		l1 = new Label("Enter First Number: ");
		l1.setBounds(10, 50, 120, 30);
		
		t1 = new TextField();
		t1.setBounds(160, 50, 150, 30);
		
		l2 = new Label("Enter Second Number: ");
		l2.setBounds(10, 100, 130, 30);
		
		t2 = new TextField();
		t2.setBounds(160, 100, 150, 30);
		
		l3 = new Label("Enter Third Number: ");
		l3.setBounds(10, 150, 120, 30);
		
		t3 = new TextField();
		t3.setBounds(160, 150, 150, 30);
		
		b = new Button("Calculate");
		b.setBounds(160, 200, 150, 30);
		b.addActionListener(this);
		
		l4 = new Label("MAX: ");
		l4.setBounds(10, 250, 120, 30);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(t3);
		add(b);
		
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
		
		if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty()) {
			l4.setText("Enter number Please!");
		}
		else
		{
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			int n3 = Integer.parseInt(s3);
			
			int max = Math.max(Math.max(n1, n2), n3);
			
			l4.setText("MAX: "+max);
		}
	}
	
}

public class Main {
	public static void main(String[] args) {
		new MyApp();
	}
}
