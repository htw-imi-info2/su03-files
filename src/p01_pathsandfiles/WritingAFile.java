package p01_pathsandfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;

public class WritingAFile {
    public static void main(String[] args) throws IOException {
        // this is rather brittle, try it out yourself...
        Path path = Paths.get("tmp/output.txt");
        Files.write(path,"hallo".getBytes(), StandardOpenOption.CREATE_NEW);
    }
}
