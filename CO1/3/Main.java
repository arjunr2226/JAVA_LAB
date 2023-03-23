import java.util.Scanner;

class Complex
{
    private int real;
    private int img;

    public Complex()
    {
        
    }

    public Complex(int real, int img)
    {
        this.real = real;
        this.img = img;
    }

    public int getReal()
    {
        return this.real;
    }
    
    public int getImg()
    {
        return this.img;
    }

    public void add(Complex obj1, Complex obj2)
    {
        int r = obj1.real + obj2.real;
        int i = obj1.img + obj2.img;

        System.out.println( r + " + " + i + "i" );
    }
}

public class Main {
    public static void main(String args[])
    {
        int r1, r2, i1, i2;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER REAL PART 1: ");
        r1 = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER REAL PART 2: ");
        r2 = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER IMG PART 1: ");
        i1 = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER IMG PART 2: ");
        i2 = sc.nextInt();
        sc.nextLine();
        Complex obj = new Complex();
        Complex obj1 = new Complex(r1, i1);
        Complex obj2 = new Complex(r2, i2);

        obj.add(obj1, obj2);
        sc.close();
    }
}
