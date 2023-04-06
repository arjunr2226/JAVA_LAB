import java.util.Scanner;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str;
    int ch, indexBeg, indexEnd;
    System.out.print("ENTER STRING: ");
    str = sc.next();
    do{
      System.out.print("ENTER 1:UPPER&LOWER 2: CONCATINATION 3: REPLACE 4: LENGTH 5: SPLIT 6: SUBSTRING\nCHOICE: ");
      ch = sc.nextInt();
      switch(ch)
      {
        case 1:
          System.out.println("UPPERCASE: " + str.toUpperCase());
          System.out.println("LOWERCASE: " + str.toLowerCase());
          break;
        case 2:
          System.out.print("ENTER STRING TO CONCATINATE: ");
          String con = sc.next();
          System.out.println("CONCATINATION: " + str.concat(con));
          break;
        case 3:
          System.out.print("ENTER THE TARGET AND REPLACEMENT CHARACTER: ");
          char target = sc.next().charAt(0);
          char rp = sc.next().charAt(0);
          System.out.println("AFTER REPLACE: " + str.replace(target, rp));
          break;
        case 4:
          System.out.println("LENGTH: " + str.length());
          break;
        case 5:
          String[] str1 = str.split("r");
          System.out.println("AFTER SPLITTING WITH 'r'");
          for(String s: str1)
            System.out.println(s);
          break;
        case 6:
          System.out.println("ENTER BEGIN AND END INDEX: ");
          indexBeg = sc.nextInt();
          indexEnd = sc.nextInt();
          System.out.println(str.substring(indexBeg,indexEnd));
          break;
      }
    }while(ch != 0);
    sc.close();
  }
}
