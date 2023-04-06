import java.util.Scanner;

class Shapes
{
  public float area(float l, float b)
  {
    return l*b;
  }
  public float area(float r)
  {
    return 3.14f*r*r;
  }
  public float area(float l, float b, float h)
  {
    return (l*b)+(b*h)+(l*h);
  }
}

public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Shapes obj = new Shapes();
    int ch;
    float l, b, r, h;
    do{
      System.out.print("ENTER 1: RECTANGLE, 2: CIRCLE, 3: CUBOID : ");
      ch = sc.nextInt();
      switch(ch)
      {
        case 0:
          break;
        case 1:
          System.out.println("ENTER LENGTH AND BREADTH: ");
          l = sc.nextFloat();
          b = sc.nextFloat();
          System.out.println("Area: " + obj.area(l, b));
          break;
        case 2:
          System.out.println("ENTER RADIUS: ");
          r = sc.nextFloat();
          System.out.println("Area: " + obj.area(r));
          break;
        case 3:
          System.out.println("ENTER LENGTH, BREADTH AND HEIGHT: ");
          l = sc.nextFloat();
          b = sc.nextFloat();
          h = sc.nextFloat();
          System.out.println("Area: " + obj.area(l, b, h));
          break;
        default:
          System.out.println("WRONG OPTION!");
      }
    }while(ch != 0);
  }
}