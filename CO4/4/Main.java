import java.util.Scanner;

class NegativeNumberException extends Exception
{
  public NegativeNumberException(String str)
  {
    super(str);
  }
}

public class Main
{
  public static void main(String[] args)
  {
    int sum=0, n, num;
    Scanner sc = new Scanner(System.in);
    System.out.print("HOW MANY NUMBERS: ");
    n = sc.nextInt();

    System.out.println("ENTER THE NUMBERS: ");
    try {
    for(int i=0; i<n; i++)
    {
        num = sc.nextInt();
        if(num < 0)
          throw new NegativeNumberException("Please Enter Positive Number");
        else
          sum += num;
    }
    }catch(NegativeNumberException e){
      System.out.println(e);
    }
    finally{
      System.out.println("AVERAGE: " + (sum/n));
    }
    sc.close();
  }
}