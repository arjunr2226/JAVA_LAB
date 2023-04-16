class Fibonacci implements Runnable
{
  private int n;

  public Fibonacci(int n)
  {
    this.n = n;
  }

  public void run()
  {
    int f;
    for(int i=1; i<=n; i++)
    {
      f=1;
      for(int j=1; j<=i; j++)
      {
        f *= j;
        try{
          Thread.sleep(10);
        }
        catch(InterruptedException e)
        {
          System.out.println(e);
        }
      }
      System.out.println(f);
    }

  }
}

class EvenNumber implements Runnable
{
  private int n;

  public EvenNumber(int n)
  {
    this.n = n;
  }

  public void run()
  {
    for(int i=1; i<=n; i++)
    {
      if(i%2 == 0)
        System.out.println(i);
    }
  }
}

public class Main
{
  public static void main(String[] args)
  {
    Runnable fib = new Fibonacci(10);
    Runnable even = new EvenNumber(100);
    Thread t1 = new Thread(fib);
    Thread t2 = new Thread(even);
    t1.start();
    t2.start();
  }
}