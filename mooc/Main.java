public class Main
{
  public static void main(String[] args)
  {
    int[] x={222, 210, 012};
    for(int i=0;i<x.length; i++)
      System.out.print(x[i] + "");
  }

}

import java.util.Calendar;

public class Main
{
    public static void main(String args[])
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(cal.YEAR);
        System.out.println(year);
    }
}