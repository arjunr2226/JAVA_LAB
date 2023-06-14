import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    deque.offerLast(0);
    System.out.println("Inserted at First " + deque);
    deque.offerFirst(1);
    System.out.println("Inserted at Last " + deque);
    deque.offerFirst(2);
    deque.offerFirst(3);
    deque.offerFirst(4);
  
    System.out.println(deque);
    deque.pollFirst();
    System.out.println("Deleted from First " + deque);
    deque.pollLast();
    System.out.println("Deleted from Last " + deque);
  }
}
