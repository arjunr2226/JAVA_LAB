import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			BufferedWriter writerOdd = new BufferedWriter(new FileWriter("odd.txt"));
			BufferedWriter writerEven = new BufferedWriter(new FileWriter("even.txt"));
			
			String line;
			while((line=reader.readLine()) != null) {
				Integer num = Integer.parseInt(line);
				if(num %2 ==0) {
					writerEven.write(String.valueOf(num) + "\n");
				}
				else {
					writerOdd.write(String.valueOf(num)+ "\n");
				}
			}
			
			writerOdd.close();
			writerEven.close();
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
