package p01_pathsandfiles;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingAFile {
	
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("data/colors.txt");
		
		String content = readFile(path);
		System.out.println(content);
		
	}

	private static String readFile(Path path) throws IOException {
		byte[] bytes = Files.readAllBytes(path);
		return new String(bytes);
	}

}
