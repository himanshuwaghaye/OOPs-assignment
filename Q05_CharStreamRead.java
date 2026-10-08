/*
 * Q5. Read a Text File Using Character Stream
 * Write a Java program to read and display the contents of message.txt using a
 * character-oriented stream.
 */
import java.io.FileReader;
import java.io.IOException;

public class Q05_CharStreamRead {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("message.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
