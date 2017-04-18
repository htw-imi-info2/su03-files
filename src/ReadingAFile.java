import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingAFile {

	public static void main(String[] args) throws IOException {

		String fileName;
		if (args.length > 0)
			fileName = args[0];
		else
			fileName = "data/colors.txt";

		Path path = Paths.get(fileName);
		//System.out.println(dayOfWeek(9));
		/*
		 * try { showPathInfo(path); } catch (IOException e) {
		 * System.out.println("File could not be found: "+fileName);
		 * //e.printStackTrace(); }
		 */
		String content = new String(Files.readAllBytes(path));
		System.out.println(content);
	}

	/**
	 * returns weekday for given number, valid numbers 1-Mo to 7-Sun
	 * 
	 * @param i
	 * @return @
	 */
	public static String dayOfWeek(int i) {
		String[] daysOfWeek = { "", "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So" };
		if (i < 1 || i > daysOfWeek.length - 1)
			throw new IllegalArgumentException("valid numbers are 1-Mo to 7-Sun");
		return daysOfWeek[i];

	}

	public static String dayOfWeek2(int i) {
		String[] daysOfWeek = { "", "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So" };
		try {
			return daysOfWeek[i];
		} catch (ArrayIndexOutOfBoundsException e) {
			//e.getStackTrace();
			throw new IllegalArgumentException("valid numbers are 1-Mo to 7-Sun");
		}

	}

	private static void showPathInfo(Path path) throws IOException {
		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
		System.out.format("toRealPath: %s%n", path.toRealPath());

	}

}
