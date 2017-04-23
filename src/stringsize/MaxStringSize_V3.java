package stringsize;

import java.util.Scanner;

public class MaxStringSize_V3 {

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
		boolean didsomething = false;
		int divisor = 2;
		try {
			while (runforever) {
				try {
					for (int i = 2; runforever; i++) {
						x = add + x;
						didsomething = true;
						add = add + add;
						int length = x.length();
						System.out.println(
								"Pass " + pass + " i: " + i + " length: " + length + "(" + length / 1000000 + " Mb) "+add.length() + " added");
					}
				} catch (java.lang.OutOfMemoryError e) {
					if (!didsomething)
						throw e;
					didsomething = false;
					System.out.println("Caught OutOfMemoryError");
					pass++;
					divisor *= divisor;
					add = add.substring(0, (add.length() / divisor));
				}
			}
		} catch (java.lang.OutOfMemoryError e) {
		}

		System.out.println("Length: " + x.length());
		System.out.println("MaxInt: " + Integer.MAX_VALUE);

	}

}
