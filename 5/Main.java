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
        System.out.println(cpuObj.price);
       }
    }
  }
}

public class Main
{
  public static void main(String args[])
  {
    CPU o1 = new CPU();
    CPU.Processor o2 = o1.new Processor();
    CPU.Processor.RAM o3 = new CPU.Processor.RAM();
    o3.show();
  }
}