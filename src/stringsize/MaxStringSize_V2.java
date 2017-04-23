package stringsize;

import java.util.Scanner;

public class MaxStringSize_V2 {

	public static void main(String[] args) {

		System.out.println("Press enter to start");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.close();

		String seed = "ab";
		String add = seed;
		String x = "";
		int pass = 1;
		// to compile; putting true in loop head is
		// detected by compiler
		boolean runforever = true;
		while (runforever) {
			try {
				for (int i = 2; runforever; i++) {
					add = add + add;
					x =  add+x;
					int length = x.length();
					System.out.println("Pass " + pass + " i: " + i + " length: " + length + "("+length/1000000+" Mb)");
				}
			} catch (java.lang.OutOfMemoryError e) {
				System.out.println("Caught OutOfMemoryError");
				pass++;
				add = seed;
			}
		}
		System.out.println("Length: " + x.length());
		System.out.println("MaxInt: " + Integer.MAX_VALUE);
		
	}

}
