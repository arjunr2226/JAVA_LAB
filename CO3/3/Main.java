import java.util.Scanner;

class Person
{
  String name, gender, address;
  int age;
  public Person(String name, String gender, String address, int age) {
    this.name = name;
    this.gender = gender;
    this.address = address;
    this.age = age;
  }
  
}

class Employee extends Person
{
  int empId, salary;
  String companyName, qualification;
  public Employee(String name, String gender, String address, int age, int empId, int salary, String companyName, String qualification) {
    super(name, gender, address, age);
    this.empId = empId;
    this.salary = salary;
    this.companyName = companyName;
    this.qualification = qualification;
  }
  
}

class Teacher extends Employee
{
  String sub, dept;
  int teacherId;
  public Teacher(String name, String gender, String address, int age, int empId, int salary, String companyName, String qualification, String sub, String dept, int teacherId) {
    super(name, gender, address, age, empId, salary, companyName, qualification);
    this.sub = sub;
    this.dept = dept;
    this.teacherId = teacherId;
  }

  public void show()
  {
    System.out.println(
      "Name: " + name
      + "\nGender: " + gender
      + "\nAddress: " + address
      + "\nAge: " + age
      + "\nEmpId: " + empId
      + "\nSalary: " + salary
      + "\nCompany Name: " + companyName
      + "\nQualification: " + qualification
      + "\nSubject: " + sub
      + "\nDepartment: "+ dept
      + "\nteacherId: " + teacherId 
    );
  }
}

public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size;
    System.out.print("HOW MANY TEACHERS: ");
    size = sc.nextInt();
    Teacher[] objArr = new Teacher[size];
    for(int i=0; i<size; i++)
    {
      System.out.println("ENTER NAME, GENDER, ADDRESS, AGE, EMPID, SALARY, COMPANY_NAME, QUALIFICATION, SUBJECT, DEPARTMENT, TEACHER_ID: ");
      objArr[i] = new Teacher(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
    }
    for(int i=0; i<size; i++)
    {
      objArr[i].show();
      System.out.println("");
    }
  }
}