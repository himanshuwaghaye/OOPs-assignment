/*
 * Q4. Write Characters to a File
 * Write a Java program to accept a sentence from the user and write it into
 * message.txt using a character-oriented stream.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q04_CharStreamWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        try (FileWriter fw = new FileWriter("message.txt")) {
            fw.write(sentence);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
