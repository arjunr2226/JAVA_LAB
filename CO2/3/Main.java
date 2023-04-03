import java.util.Scanner;

<<<<<<< HEAD
public class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    }
}
=======
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str;
    System.out.println("ENTER STRING: ");
    str = sc.next();
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.concat("str"));
    System.out.println(str.replace("a", "A"));
    System.out.println(str.length());
    String[] str1 = str.split("r", -2);
    for(String s: str1)
      System.out.println(s);
    System.out.println(str.substring(1,5));
    sc.close();
  }
}
>>>>>>> 3bf4b549e67d9ccdc77e3e83562be5716057481e
