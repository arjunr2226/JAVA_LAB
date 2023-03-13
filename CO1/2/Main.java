import java.util.Scanner;

class Matrix
{

    public int[][] createMatrix(Scanner sc, int r, int c)
    {
        int m[][] = new int[r][c];
        System.out.println("ENTER ELEMENT FOR FIRST MATRIX: ");
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[i].length; j++)
            {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    public int[][] addMatrix(int m1[][], int m2[][], int r, int c, Scanner sc)
    {
        int res[][] = new int[r][c];
        System.out.println(res.length);
        for(int i=0; i<res.length; i++)
        {
            for(int j=0; j<res.length; j++)
            {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return res;
    }

    public void printMatrix(int m[][])
    {
        for(int ro[] : m)
        {
            for(int co : ro)
            {
                System.out.print(co + " ");
            }
            System.out.println("");
        }
    }
}

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int r, c;
        System.out.println("ROW SIZE: ");
        r = sc.nextInt();
        System.out.println("COLUMN SIZE: ");
        c = sc.nextInt();
        int m1[][] = new int[r][c];
        int m2[][] = new int[r][c];
        int res[][] = new int[r][c];
        
        Matrix obj = new Matrix();

        m1 =  obj.createMatrix(sc, r, c);
        m2 =  obj.createMatrix(sc, r, c);
        res =  obj.addMatrix(m1, m2, r, c, sc);
        obj.printMatrix(res);

    }
}