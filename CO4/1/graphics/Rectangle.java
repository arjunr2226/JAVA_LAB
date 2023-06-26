package graphics;

public class Rectangle implements graphics {
	float l, b;
	
	public Rectangle(float l, float b) {
		this.l = l;
		this.b = b;
	}

	public void area()
	{
		System.out.println("RECTANGLE AREA IS " + (l*b));
	}
}
