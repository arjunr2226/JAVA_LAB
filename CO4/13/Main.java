import java.util.*;

public class Main {
  public static void main(String[] args) {
    Queue<Integer> queue = new PriorityQueue<>();
    Scanner sc = new Scanner(System.in);
    int ch, el;

    do {
      System.out.print("ENTER\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY\nCHOICE: ");
      ch = sc.nextInt();

      switch(ch)
      {
        case 1:
          System.out.print("\nENTER NUMBER TO INSERT: ");
          el = sc.nextInt();
          queue.offer(el);
          break;
        case 2:
          queue.poll();
          System.out.println("\nDELETED SUCCESSFULLY\n");
          break;
        case 3:
          System.out.println("\nTOP ELEMENT: " + queue.peek());
          break;
        case 4:
          System.out.println("\n" + queue);
          break;
        case 0:
          break;
      }
    }while(ch != 0);
    
    sc.close();
  }
}
