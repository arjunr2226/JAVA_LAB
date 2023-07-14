import java.util.LinkedList;
import java.util.Scanner;


public class Main {
  public static void main(String args[])
  {
    LinkedList<Integer> ll = new LinkedList<>();
    int ch, el;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.print("\nENTER\n1.ADD\n2.REMOVE\n3.REPLACE\n4.ADD_AT_INDEX\n5.SEARCH\n6.DISPLAY\n7.CLEAR\nCHOICE: ");
      ch = sc.nextInt();

      switch(ch)
      {
        case 1:
          System.out.print("ENTER NUMBER TO INSERT: ");
          el = sc.nextInt();
          ll.add(el);
          break;
        case 2:
          System.out.print("ENTER WHICH VALUE: ");
          el = sc.nextInt();
          ll.remove(el);
          break;
        case 3:
          System.out.print("WHICH INDEX TO REPLACE: ");
          int key = sc.nextInt();
          ll.set(key, 1000);
          System.out.println(ll);
          break;
        case 4:
          System.out.print("ENTER INDEX TO INSERT: ");
          int in = sc.nextInt();
          System.out.print("ENTER NUMBER TO INSERT: ");
          el = sc.nextInt();
          ll.add(in, el);
          break;
        case 5:
          System.out.print("\nENTER ELEMENT TO SEARCH: ");
          key = sc.nextInt();
          if(ll.contains(key))
            System.out.println("FOUND");
          else
            System.out.println("NOT FOUND");
          break;
        case 6:
          System.out.println("\n" + ll);
          break;
        case 8:
          ll.clear();
          break;
        case 0:
          break;
      }
    }while(ch != 0);

    sc.close();
  }
}
