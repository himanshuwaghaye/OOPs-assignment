/*
 * Q1. Write Data to a File Using Byte Stream
 * Write a Java program to accept a string from the user and write it into a file
 * named data.txt using byte-oriented stream.
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q01_ByteStreamWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        try (FileOutputStream fos = new FileOutputStream("data.txt")) {
            fos.write(text.getBytes());
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
