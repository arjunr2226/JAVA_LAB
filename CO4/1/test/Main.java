package test;
import graphics.*;

public class Main {
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle(1, 2);
		rect.area();
		
		Triangle tri = new Triangle(1, 2);
		tri.area();
		
		Square sqr = new Square(2);
		sqr.area();
		
		Circle circ = new Circle(2);
		circ.area();
	}
}