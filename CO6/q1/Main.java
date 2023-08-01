import java.io.File;

public class Main {
	public static void main(String[] args) {
		File dir = new File("C:\\Users\\ok\\Desktop\\Aptitude");
		listDir(dir);
		boolean res = searchFile(dir, "tata.pptx");
		if(res) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
	}
	
	public static void listDir(File dir) {
		File elements[] = dir.listFiles();
//		int countFile=0, countDir=0;
		for(File element : elements) {
			if(element.isFile()) {
				System.out.println(element.getName());
//				countFile += 1;
			} 
			else if(element.isDirectory()) {
				listDir(element.getAbsoluteFile());
//				countDir += 1;
			}
		}
//		System.out.println("Files: "+countFile + " Directories: " + countDir);
	}
	
	public static boolean searchFile(File dir, String name) {
		File[] elements = dir.listFiles();
		for(File element: elements) {
			if(element.isFile() && element.getName().equals(name)) {
				return true;
			}
			else if(element.isDirectory()) {
				searchFile(element.getAbsoluteFile(), name);
			}
		}
		return false;
	}
}