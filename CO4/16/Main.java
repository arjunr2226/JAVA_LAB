import java.util.*;

public class Main {
  public static void main(String[] args) {
    HashSet<Integer> hs1 = new HashSet<>();
    HashSet<Integer> hs2 = new HashSet<>();
    int n, el;
    Scanner sc = new Scanner(System.in);
    System.out.print("\nHOW MANY ELEMENT HashSet1:");
    n = sc.nextInt();
    for(int i=0; i<n; i++)
    {
      el = sc.nextInt();
      hs1.add(el);
    }
          
    System.out.print("\nHOW MANY ELEMENT HashSet2:");
    n = sc.nextInt();
    for(int i=0; i<n; i++)
    {
      el = sc.nextInt();
      hs2.add(el);
    }

    // System.out.println("WHETHER EQUAL? " + hs1.equals(hs2));    

    boolean flag = false;
    for(Integer ele : hs1)
    {
      if(!hs2.contains(ele))
      {
        System.out.println("Not equal");
        flag = true;
        break;
      }
    }
    
    if(!flag)
      System.out.println("Both Equal!");
    sc.close();
  }
}