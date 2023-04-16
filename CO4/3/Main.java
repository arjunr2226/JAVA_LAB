import java.util.Scanner;

class  InvalidUsernameOrPasswordException extends Exception
{
  public InvalidUsernameOrPasswordException(String s)
  {
    super(s);
  }
}

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    try
    {
      System.out.println("ENTER USERNAME AND PASSWORD: ");
      String userName = sc.nextLine();
      String password = sc.nextLine();
      if(!userName.equals("admin") | !password.equals("admin"))
        throw new InvalidUsernameOrPasswordException("ENTER CORRECT USERNAME AND PASSWORD!");
      else
        System.out.println("LOGIN SUCCESSFULL!");
    } catch(InvalidUsernameOrPasswordException e)
    {
      System.out.println(e);
    }
  }
}