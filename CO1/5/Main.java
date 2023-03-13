import java.util.Scanner;

class CPU
{
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
}

public class Main
{
  public static void main(String args[])
  {
    CPU.Processor.RAM o3 = new CPU.Processor.RAM();
    o3.show();
  }
}
