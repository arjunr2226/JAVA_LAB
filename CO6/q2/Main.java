import java.io.*;

public class Main
{
  public static void main(String[] args) throws Exception{
    FileOutputStream fos = new FileOutputStream("C:\\Users\\ok\\Desktop\\javaFileTest\\text1.txt");
    String text = "Hello World";
    fos.write(text.getBytes());

    FileInputStream fis = new FileInputStream("C:\\Users\\ok\\Desktop\\javaFileTest\\text1.txt");
    byte[] b = new byte[fis.available()];
    fis.read(b);
    String s = new String(b);
    System.out.println(s);
  }
}