package stringsize;

import java.util.Scanner;

public class MaxStringSize_V4 {
	public static final String SEED = "ab";

	public enum State {
		INCREASING, DECREASING;
	};

	public MaxStringSize_V4() {

	}

	public static void main(String[] args) {

		System.out.println("Press enter to start");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.close();
		new MaxStringSize_V4().run();

	}

	private void run() {
		String add = SEED;
		String x = "";
		int pass = 1;
		State state = State.INCREASING;
		// to compile; putting true in loop head is
		// detected by compiler
		boolean runforever = true;

		while (runforever) {
			try {
				for (int i = 2; runforever; i++) {
					x = add + x;
					int length = x.length();
					System.out.println("Pass " + pass + " i: " + i + " length: " + length + "(" + length / 1000000
							+ " Mb) " + add.length() + " added");
					if (state == State.INCREASING)
						add = add + add;
				}
			} catch (java.lang.OutOfMemoryError e) {
				if (add.length() < 2)
					runforever = false;
				else {
					System.out.println("Caught OutOfMemoryError");
					state = State.DECREASING;
					pass++;
					add = add.substring(0, (add.length() / 2));
				}
			}
		}

		System.out.println("Length: " + x.length());
		System.out.println("MaxInt: " + Integer.MAX_VALUE);

	}


}
