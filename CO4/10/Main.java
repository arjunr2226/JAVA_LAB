import java.util.*;

public class Main {
  public static void main(String args[])
  {
    ArrayList<Integer> list = new ArrayList<>();
    int ch, el;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.print("ENTER\n1.ADD\n2.REMOVE\n3.REPLACE\nCHOICE: ");
      ch = sc.nextInt();

      switch(ch)
      {
        //Add Element into ArrayList
        case 1:
          System.out.print("ENTER NUMBER TO INSERT: ");
          el = sc.nextInt();
          list.add(el);
          break;
        case 2:
          System.out.print("ENTER WHICH VALUE: ");
          el = sc.nextInt();
          ////////////////////////////////
          list.remove(Integer.valueOf(el));
          ////////////////////////////////
          break;
        case 3:
          System.out.print("WHICH INDEX TO REPLACE: ");
          int key = sc.nextInt();
          list.set(key, 1000);
          System.out.println(list);
          break;
          
        case 0:
          break;
      }
    }while(ch != 0);
    sc.close();
  }
}