/*
 * Q6. Count Characters in a File
 * Write a Java program to read a file named text.txt and count the total number
 * of characters in the file.
 * Note: Count spaces also as characters.
 */
import java.io.FileReader;
import java.io.IOException;

public class Q06_CountCharacters {
    public static void main(String[] args) {
        int count = 0;
        try (FileReader fr = new FileReader("text.txt")) {
            while (fr.read() != -1) {
                count++;
            }
            System.out.println("Number of characters: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
