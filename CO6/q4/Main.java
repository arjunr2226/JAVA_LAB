import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("data.txt");
            FileOutputStream fodd = new FileOutputStream("dataodd.txt");
            FileOutputStream feven = new FileOutputStream("dataeven.txt");

            int i;
            while ((i = fin.read()) != -1) {
                if (i % 2 == 0)
                    feven.write(i);
                else
                    fodd.write(i);
            }

            fodd.close();
            fin.close();
            feven.close();
            System.out.println("Numbers separated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while separating the numbers: " + e.getMessage());
        }
    }
}
