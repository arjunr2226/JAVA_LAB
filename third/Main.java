package third;

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

        System.out.println( r + " + " + "i" + i);
    }
}

public class Main {
    public static void main(String args[])
    {
        Complex obj = new Complex();
        Complex obj1 = new Complex(2, 3);
        Complex obj2 = new Complex(2, 3);

        obj.add(obj1, obj2);
        
    }
}
