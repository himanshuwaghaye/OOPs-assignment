/*
 * Q10. Create a New File
 * Write a Java program to accept a filename from the user and create a new file
 * with that name.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q10_CreateFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        try {
            File file = new File(name);
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
