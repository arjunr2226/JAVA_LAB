import java.util.Arrays;
import java.util.Scanner;

class Array
{
    int n;
    public String[] createString(Scanner sc)
    {
        System.out.print("ENTER THE SIZE: ");
        n = sc.nextInt();
        String[] str = new String[n];
        System.out.print("ENTER THE STRINGS: ");
        for(int i=0; i<n; i++)
            str[i] = sc.next();
        return str;
    }

    public void sort(String[] strArr)
    {
        // System.out.println("Before Sorting: " + str);
        System.out.println("Before Sorting: ");
        for(int i=0; i<n; i++)
            System.out.print(strArr[i] + "\t");
        // char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        System.out.println("\n\nAfter Sorting: ");
        for(int i=0; i<n; i++)
            System.out.print(strArr[i] + "\t");
    }
}

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Array strObj = new Array();
        String[] str = strObj.createString(sc); 
        strObj.sort(str);
    }
}