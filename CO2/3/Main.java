public class Main
{
  public static void main(String args[])
  {
    String str = "arjun";
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.concat("str"));
    System.out.println(str.replace("a", "A"));
    System.out.println(str.length());
    String[] str1 = str.split("r", -2);
    for(String s: str1)
      System.out.println(s);

    System.out.println(str.substring(1,5));
  }
}