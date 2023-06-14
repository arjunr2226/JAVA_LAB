import java.util.*;

public class Main {
  public static void main(String[] args) {
    HashMap<Integer, String> hm = new HashMap<>();
    TreeMap<Integer, String> tm = new TreeMap<>();
    Scanner sc = new Scanner(System.in);
    int key;
    String el;

    System.out.print("ENTER SIZE: ");
    int n = sc.nextInt();
    for(int i=0; i<n; i++)
    {
      System.out.print("\nENTER KEY: ");
      key = sc.nextInt();
      System.out.print("\nENTER VALUE: ");
      el = sc.next();
      hm.put(key, el);
    }
    System.out.println(hm);

    tm.putAll(hm);

    System.out.print("\nTREEMAP\n");
    System.out.println(tm);

    sc.close();
  }
}