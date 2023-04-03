import java.util.Scanner;

class Employee
{
  int empId;
  String name, address;
  int salary;
  public Employee(int empId, String name, String address, int salary) {
    this.empId = empId;
    this.name = name;
    this.address = address;
    this.salary = salary;
  }
  
}

class Teacher extends Employee
{
  String dept, sub;

  public Teacher(int empId, String name, String address,String dept, String sub, int salary) {
    super(empId, name, address, salary);
    this.dept = dept;
    this.sub = sub;
  }
  
  public void show()
  {
    System.out.println("EmpId: " + empId 
    + "\nName: " + name 
    + "\nAddress: " + address 
    + "\nDepartment: " + dept 
    + "\nSubject: " + sub 
    + "\nSalary: " + salary);
  }

}

public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("HOW MANY TEACHERS: ");
    int size = sc.nextInt();
    Teacher[] objArr = new Teacher[size];
    for(int i=0; i<size; i++)
    {
      System.out.println("ENTER EMPID, NAME, ADDRESS, DEPARTMENT, SUBJECT, SALARY: ");
      objArr[i] = new Teacher(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
    }
    for(int i=0; i<size; i++)
    {
      objArr[i].show();
    }
  }
}