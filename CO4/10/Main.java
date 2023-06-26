package ques10;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		int ch, el;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\nENTER\n1.INSERT_ELEMENT\n"
					+ "2.DELETE_LAST_ELEMENT\n"
					+ "3.DELETE_ELEMENT\n"
					+ "4.SIZE\n"
					+ "5.SEARCH\n"
					+ "6.REMOVE_ALL\n"
					+ "7.DISPLAY\n"
					+ "CHOICE: ");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					System.out.print("\nENTER ELEMENT TO INSERT AT FIRST: ");
					el = sc.nextInt();
					array.add(el);
					break;
				case 2:
					array.remove((array.size() - 1));
					break;
				case 3:
					System.out.println("\nENTER INDEX: \n");
					el = sc.nextInt();
					array.remove(el);
					break;
				case 4:
					System.out.println("\nSIZE : " + array.size());
					break;
				case 5:
					System.out.println("\nENTER ELEMENT TO SEARCH: \n");
					el = sc.nextInt();
					if(array.contains(el))
						System.out.println("\nFOUND\n");
					else
						System.out.println("\nNOT FOUND\n");
					break;
				case 6:
					array.clear();
					System.out.println("\n" + array);
					break;
				case 7:
					System.out.println("\n" + array);
					break;
				case 0:
					break;
				default:
					System.out.println("!!!Exiting!!!");	
			}
			
		}while(ch != 0);
		
		sc.close();

	}

}
