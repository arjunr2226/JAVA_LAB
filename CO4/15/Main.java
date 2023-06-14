import java.util.*;

public class Main {
  public static void main(String[] args) {
    Set<Integer> hs = new LinkedHashSet<>();
    Set<Integer> hs1 = new LinkedHashSet<>();

    Scanner sc = new Scanner(System.in);
    int ch, el, n;

    do {
      System.out.print("ENTER\n1.INSERT_1\n2.INSERT_2\n3.REMOVE\n4.UNION\n5.INTERSECTION\n6.SUBSET\n7.SIZE\nCHOICE: ");
      ch = sc.nextInt();

      switch(ch)
      {
        case 1:
          System.out.print("\nHOW MANY ELEMENT HashSet1:");
          n = sc.nextInt();
          for(int i=0; i<n; i++)
          {
            el = sc.nextInt();
            hs.add(el);
          }
          break;
        case 2:
          System.out.print("\nHOW MANY ELEMENT HashSet2:");
          n = sc.nextInt();
          for(int i=0; i<n; i++)
          {
            el = sc.nextInt();
            hs1.add(el);
          }
          break;
        case 3:
          System.out.println("\nENTER ELEMENT TO DELETE: ");
          el = sc.nextInt();
          hs.remove(el);
          break;
        case 4:
          //Union
          hs.addAll(hs1);
          System.out.println("Union " + hs);
          break;
        case 5:
          //Intersection
          hs.retainAll(hs1);
          System.out.println("Intersection " + hs);
          break;
        case 6:
          //Subset
          System.out.println(hs1.containsAll(hs));
          break;
        case 7:
          //Size
          System.out.println("HASHSET 1" + hs.size());
          System.out.println("HASHSET 2" + hs1.size());
          break;
        case 0:
          break;
      }
    }while(ch != 0);
    
    sc.close();
  }
}
