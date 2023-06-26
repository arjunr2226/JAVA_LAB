package graphics;

public class Square implements graphics {
	float a;
	
	public Square(float a) {
		this.a = a;
	}

	public void area()
	{
		System.out.println("SQUARE AREA IS " + (a*a));
	}
}
