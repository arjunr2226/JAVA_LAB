import java.util.Scanner;

class CPU
{
  int price;
  CPU.Processor.RAM objRAM = new CPU.Processor.RAM(); 
  CPU.Processor processorObj = new Processor();
  void setValues(Scanner sc)
  {
    System.out.print("Enter Price of CPU: ");
    this.price = sc.nextInt();

    processorObj.setValues(sc);
  }

  void show()
       {
        System.out.println("\n-------------------------");
        System.out.println("Details:");
        System.out.println("-------------------------");
        System.out.println(
        "Price: " +price + 
        "\nnoCores: " +processorObj.noCores+  
        "\nManufacture: " +processorObj.manufacture+
        "\nMemory: " +objRAM.memory+
        "\nRAM Manufacture: "+objRAM.manufacture);
        System.out.println("-------------------------");
       }

  class Processor
  {
    int noCores = 5;
    String manufacture = "DELL";

    public void setValues(Scanner sc)
    {
        System.out.print("Enter noCores: ");
        noCores = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Manufacturer: ");
        manufacture = sc.nextLine();
        System.out.print("Enter RAM Memory: ");
        objRAM.memory = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter RAM Manufacturer: ");
        objRAM.manufacture = sc.nextLine();
    }
    static class RAM
    {
       int memory = 8;
       String manufacture = "crucial";
       
    }
  }
}

public class Main
{
  public static void main(String args[])
  {
    CPU obj = new CPU();
    Scanner sc = new Scanner(System.in);
    obj.setValues(sc);
    obj.show();
  }
}
