import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE ARRAY SIZE: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("ENTER THE ARRAY ELEMENTS:");
        for(int i=0; i<array.length; i++)
            array[i] = sc.nextInt();

        System.out.print("ENTER THE KEY TO SEARCH: ");
        int key = sc.nextInt();
        for(int i=0; i<array.length; i++)
            if(array[i] == key)
            {
                flag = true;
                System.out.println("FOUND!");
                break;
            }
        if(!flag)
            System.out.println("NOT FOUND!");
        sc.close();
    }
}