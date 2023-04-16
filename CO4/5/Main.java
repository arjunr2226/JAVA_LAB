class Multiplication extends Thread
{
  private int n;

  public Multiplication(int n)
  {
    this.n = n;
  }

  public void run()
  {
    int prod=5;
    for(int i=1; i<=n; i++)
    {
      if((prod*i) %5 == 0)
        System.out.println(prod + "X" +i+ "=" + (prod*i));
      try{
        Thread.sleep(10);
      }
      catch(InterruptedException e)
      {
        System.out.println(e);
      }
    }
  }
}

class Prime extends Thread
{
  private int n;

  public Prime(int n)
  {
    this.n = n;
  }

  public void run()
  {
    boolean flag = false;
    for(int i=2; i<=n; i++)
    {
      for(int j=2; j<=(i/2); j++)
      {
        flag=false;
        if(i%j == 0)
        {
          flag = true;
          break;
        }
      }
      if(!flag)
        System.out.println(i);
        try{
          Thread.sleep(10);
        }
        catch(InterruptedException e)
        {
          System.out.println(e);
        }
    }
  }
}

public class Main
{
  public static void main(String[] args)
  {
    Thread mu = new Multiplication(100);
    Thread pr = new Prime(100);
    mu.start();
    pr.start();
  }
}