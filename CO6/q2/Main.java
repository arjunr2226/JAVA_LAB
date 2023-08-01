import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Hello World");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			while((line=reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
