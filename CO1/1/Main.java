import java.util.Scanner;

class Product 
{
  private int pcode;
  private String pname;
  private int price;
  
  public void setValues(Scanner sc)
  {
    System.out.print("Enter Pcode: ");
    pcode = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Pname: ");
    pname = sc.nextLine();
    System.out.print("Enter Price: ");
    price = sc.nextInt();
  }

  public int getPcode()
  {
    return pcode;
  }
  
  public String getPname()
  {
    return pname;
  }
  
  public int getPrice()
  {
    return price;
  }

  public static void compare(Product obj1, Product obj2, Product obj3)
  {
    if(obj1.price < obj2.price && obj1.price < obj3.price)
    {
      System.out.print("Smallest : " + obj1.price);
    }
    else if(obj2.price < obj1.price && obj2.price < obj3.price)
    {
      System.out.print("Smallest : " + obj2.price);
    }
    else
    {
      System.out.print("Smallest : " + obj3.price);
    }
  }
}

public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    Product obj1 = new Product();
    Product obj2 = new Product();
    Product obj3 = new Product();

    obj1.setValues(sc);
    obj2.setValues(sc);
    obj3.setValues(sc);

    Product.compare(obj1, obj2, obj3);
  }
}