package stringsize;

import java.util.Scanner;

public class MaxStringSize_V1 {

	public static void main(String[] args) {
		System.out.println("Press enter to start");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String start = "ab";
		String x = start;
		boolean flag = true;
		try {
			for (int i = 2; flag; i++) {
				x = x + x;
				System.out.println("Step "+i+ " length: "+ x.length());
			}
		} catch (java.lang.OutOfMemoryError e) {
			
		}
		
		System.out.println("Final length: "+x.length());
		 line = scanner.nextLine();
		
	}

}
