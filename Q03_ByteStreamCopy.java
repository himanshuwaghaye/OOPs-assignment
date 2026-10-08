/*
 * Q3. Copy One File to Another Using Byte Stream
 * Write a Java program to copy the contents of source.txt into destination.txt
 * using byte-oriented streams.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q03_ByteStreamCopy {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("source.txt");
             FileOutputStream out = new FileOutputStream("destination.txt")) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
