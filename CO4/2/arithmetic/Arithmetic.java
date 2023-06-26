package arithmetic;

public class Arithmetic implements Operations {
	public void add(int a, int b)
	{
		System.out.println("SUM IS " + (a+b));
	}
	
	public void sub(int a, int b)
	{
		System.out.println("SUBTRACTION IS " + (a-b));
	}
	
	public void mul(int a, int b)
	{
		System.out.println("MULTIPLICATION IS " + (a*b));
	}
	
	public void div(int a, int b)
	{
		System.out.println("QUOTIENT IS " + ((float)(a/b)));
	}
}
