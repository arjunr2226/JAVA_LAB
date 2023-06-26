package graphics;

public class Circle implements graphics {
	float r;
	
	public Circle(float r) {
		this.r = r;
	}

	public void area()
	{
		System.out.println("SQUARE AREA IS " + (3.14f*r*r));
	}
}
