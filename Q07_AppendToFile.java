/*
 * Q7. Append Text to an Existing File
 * Write a Java program to accept a sentence from the user and append it to an
 * existing file named notes.txt.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q07_AppendToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        try (FileWriter fw = new FileWriter("notes.txt", true)) { // true = append mode
            fw.write(System.lineSeparator() + sentence);
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
