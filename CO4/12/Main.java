import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    int ch, el;

    do {
      System.out.print("\nENTER\n1.PUSH\n2.POP_INDEX\n3.PEEK\n4.DISPLAY\nCHOICE: ");
      ch = sc.nextInt();

      switch(ch)
      {
        case 1:
          System.out.print("\nENTER NUMBER TO INSERT: ");
          el = sc.nextInt();
          stack.push(el);
          break;
        case 2:
          System.out.print("\nENTER INDEX TO DELETE: ");
          el = sc.nextInt();
          stack.remove(el);
        case 3:
          System.out.println("\nTOP ELEMENT: " + stack.peek());
          break;
        case 4:
          System.out.println("\n" + stack);
          break;
        case 0:
          break;
      }
    }while(ch != 0);
    
    sc.close();
  }
}
