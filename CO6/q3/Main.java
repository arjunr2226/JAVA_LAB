import java.io.*;
import java.nio.file.Files;

public class Main
{
  public static void main(String[] args) throws Exception{
    File f1 = new File("C:\\Users\\ok\\Desktop\\javaFileTest\\text1.txt");
    File f2 = new File("C:\\Users\\ok\\Desktop\\javaFileTest\\new.txt");
    Files.copy(f1.toPath(), f2.toPath());
  }
}