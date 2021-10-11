package p04_streams;

import java.io.*;
import java.net.Socket;

public class StreamClasses {
    public static void main(String[] args) throws IOException {


    }
    private void aboutInputStreams() throws IOException {
        InputStream inputStream;
        inputStream = System.in;
        inputStream = new FileInputStream("file.txt");
        inputStream = new Socket().getInputStream();
    }
    private void aboutOutputStreams() throws IOException {
        OutputStream outputStream;
        outputStream = System.out;
        outputStream = new FileOutputStream("out.txt");
        outputStream = new Socket().getOutputStream();
    }
}
