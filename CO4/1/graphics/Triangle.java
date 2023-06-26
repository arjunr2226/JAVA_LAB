package graphics;

public class Triangle implements graphics {
	float b, h;
	
	public Triangle(float b, float h) {
		this.b = b;
		this.h = h;
	}

	public void area()
	{
		System.out.println("TRIANGLE AREA IS " + (0.5f*b*h));
	}
}
