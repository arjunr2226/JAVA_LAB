import java.util.Arrays;
import java.util.Scanner;

class Array
{
    public String createString(Scanner sc)
    {
        System.out.print("ENTER THE STRING: ");
        String str = sc.nextLine();
        return str;
    }

    public void sort(String str)
    {
        // System.out.println("Before Sorting: " + str);
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        System.out.println("After Sorting: " + new String(strArr));
    }
}

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Array strObj = new Array();
        String str = strObj.createString(sc); 
        strObj.sort(str);
    }
}