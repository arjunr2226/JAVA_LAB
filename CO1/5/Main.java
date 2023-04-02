import java.util.Scanner;

class CPU
{
<<<<<<< HEAD
   int price = 12;

  class Processor
  {
     int noCores = 5;
     String manufacture = "DELL";

    static class RAM
    {
       int memory = 8;
       String manufacture = "crucial";
       void show()
       {
        CPU cpuObj = new CPU();
        CPU.Processor processorObj = cpuObj.new Processor();
        System.out.println("Price: " + cpuObj.price);
        System.out.println("Number of Cores: " + processorObj.noCores);
        System.out.println("Processor Manufacture: " + processorObj.manufacture);
        System.out.println("RAM Memory: " + memory);
        System.out.println("RAM Manufacture: " + manufacture);
       }
    }
  }
=======
   int price;

  class Processor
  {
    int noCores = 5;
    String manufacture = "DELL";
    
    public void setValues(Scanner sc)
    {
        System.out.print("Enter Price: ");
        price = sc.nextInt();
        System.out.print("Enter noCores: ");
        noCores = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Manufacturer: ");
        manufacture = sc.nextLine();
    }
  }
  static class RAM
    {
       int memory = 8;
       String manufacture = "crucial";
       void setValues(Scanner sc,  Processor processorObj)
       {
        processorObj.setValues(sc);
        System.out.print("Enter RAM Memory: ");
        memory = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter RAM Manufacturer: ");
        manufacture = sc.nextLine();
       }
       void show()
       {
        Scanner sc = new Scanner(System.in);
        CPU cpuObj = new CPU();
        CPU.Processor processorObj = cpuObj.new Processor();
        setValues(sc, processorObj);
        System.out.println("\nDetails: \n");
        System.out.println(
        "\nPrice: " +cpuObj.price + 
        "\nnoCores: " +processorObj.noCores+  
        "\nManufacture: " +processorObj.manufacture+
        "\nMemory: " +memory+
        "\nRAM Manufacture: "+manufacture);
       }
    }
>>>>>>> ac484d427247f220a87dd75d65325d08eb518dc6
}

public class Main
{
  public static void main(String args[])
  {
<<<<<<< HEAD
    CPU.Processor.RAM o3 = new CPU.Processor.RAM();
    o3.show();
  }
}
=======
    CPU.RAM o3 = new CPU.RAM();
    o3.show();
  }
}
>>>>>>> ac484d427247f220a87dd75d65325d08eb518dc6
