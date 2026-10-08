/*
 * Q2. Read Data from a File Using Byte Stream
 * Write a Java program to read and display the contents of a file named data.txt
 * using a byte-oriented stream.
 */
import java.io.FileInputStream;
import java.io.IOException;

public class Q02_ByteStreamRead {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.txt")) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
