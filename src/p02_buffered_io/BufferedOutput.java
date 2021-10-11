package p02_buffered_io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedOutput {
    public static void main(String[] args) throws IOException {
        Path directory = Paths.get("tmp");
        if (!Files.exists(directory))
            Files.createDirectory(directory);

        Path file = Paths.get("tmp/output2.txt");
        Charset charset = Charset.forName("UTF-8");
        String s = "Hallo Welt!\n(written with BufferedOutput\n";
        try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
            writer.write(s, 0, s.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
