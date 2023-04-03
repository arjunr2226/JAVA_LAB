import java.util.Scanner;

class Employee
{
  private int eNo;
  private String eName;
  private int eSalary;
  public void get(Scanner sc)
  {
    System.out.println("ENTER eNo: ");
    eNo = sc.nextInt();
    sc.nextLine();
    System.out.println("ENTER eName: ");
    eName = sc.nextLine();
    System.out.println("ENTER eSalary: ");
    eSalary = sc.nextInt();
    
  }

  public void show()
  {
    System.out.println("");
    System.out.println("eNo: " + eNo + "\neName: " + eName + "\neSalry: " + eSalary);
  }
  
}

public class Main {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size;
    System.out.println("HOW MANY EMPLOYEE?");
    size = sc.nextInt();
    Employee[] arrObj = new Employee[size];
    for(int i=0; i< arrObj.length; i++)
    { 
      arrObj[i] = new Employee();
      arrObj[i].get(sc);
    }
    for(Employee e: arrObj)
    {
      e.show();
    }
  }
}
