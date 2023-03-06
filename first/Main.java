class Product
{
	int pcode;
	String pname;
	int price;
}

class Main
{
	public static void main(String args[])
	{
		Product obj1 = new Product();
		Product obj2 = new Product();
		Product obj3 = new Product();
		obj1.pcode = 1;
		obj2.pcode = 2;
		obj3.pcode = 3;
		obj1.pname = "Dove";
		obj2.pname = "Pears";
		obj3.pname = "lifebuoy";
		obj1.price = 65;
		obj2.price = 58;
		obj3.price = 25;
		if(obj1.price < obj2.price && obj1.price < obj3.price)
		{
			System.out.println("Lowest : " + obj1.price + " Name: " + obj1.pname );
		}
		else if(obj2.price < obj3.price)
		{
			System.out.println("Lowest : " + obj2.price + " Name: " + obj2.pname );
		}
		else
		{
			System.out.println("Lowest : " + obj3.price + " Name: " + obj3.pname );
		}
	}
}