import java.io.*;

public class Main {

	public static void main(String[] args) {
		File dir = new File("path here");
		
		listDir(dir);
		boolean res = search(dir, "file.extension here");
	}
	
	public static void listDir(File dir) {
		File[] files = dir.listFiles();
		for(File file: files) {
			if(file.isFile()) {
				System.out.println(file.getName());
			} else if(file.isDirectory()){
				listDir(file);
			}
		}
	}
	
	public static boolean search(File dir, String name) {
		File[] files = dir.listFiles();
		for(File file: files) {
			if(file.isFile() && file.getName().equals(name)) {
				System.out.println("Found at: " + file.getAbsolutePath());
				return true;
			} else if(file.isDirectory()){
				search(file, name);
			}
		}
		return false;
	}

}
