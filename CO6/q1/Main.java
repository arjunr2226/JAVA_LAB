import java.io.*;

class myFile
{
  public void searchFiles(File fileObj,String searchName)
  {
    File[] f = fileObj.listFiles();

    for(File el: f)
    {
      if(el.getName().equals(searchName))
      {
        System.out.println("Found");
      }
    }
  }
}

public class Main
{
  
  public static void main(String[] args) throws Exception{

    myFile obj = new myFile();
    String path = "C:\\Users\\ok\\Desktop\\javaFileTest";
    File f = new File(path);

    // if(f.isDirectory())
    // {
    //   File[] list = f.listFiles();
    //   for(File el: list)
    //   {
    //     System.out.println(el.getAbsolutePath());
    //   }
    // }
    obj.searchFiles(f, "1dir");
  }
}