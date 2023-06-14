import java.util.*;

public class Main {
  public static void main(String[] args) {
    HashMap<Integer, String> hm = new HashMap<>();
    
    Scanner sc = new Scanner(System.in);
    int key, ch;
    String el;

    do {
      System.out.print("ENTER\n1.INSERT\n2.REPLACE\n3.REMOVE\n4.DISPLAY\nCHOICE: ");
      ch = sc.nextInt();

      switch(ch)
      {
        case 1:
          System.out.println("\nENTER KEY: ");
          key = sc.nextInt();
          System.out.println("\nENTER VALUE: ");
          el = sc.next();
          hm.put(key, el);
          break;
        case 2:
          System.out.println("\nENTER KEY: ");
          key = sc.nextInt();
          System.out.println("\nENTER REPLACE VALUE: ");
          el = sc.next();
          hm.replace(key, el);
          break;
        case 3:
          System.out.println("\nENTER KEY TO REMOVE: ");
          key = sc.nextInt();
          hm.remove(key);
          break;
        case 4:
          for(Map.Entry<Integer, String> e: hm.entrySet())
          {
            System.out.println(e.getValue() + e.getKey());
          }
          break;
        case 0:
          break;
      }
    }while(ch != 0);
    
    sc.close();
  }  
}