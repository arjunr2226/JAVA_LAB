import java.util.Scanner;

class CPU
{
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
        System.out.println(
        "\nPrice: " +cpuObj.price + 
        "\nnoCores: " +processorObj.noCores+  
        "\nManufacture: " +processorObj.manufacture+
        "\nMemory: " +memory+
        "\nRAM Manufacture: "+manufacture);
       }
    }
  }
}

public class Main
{
  public static void main(String args[])
  {
    CPU.Processor.RAM o3 = new CPU.Processor.RAM();
    o3.show();
  }
}