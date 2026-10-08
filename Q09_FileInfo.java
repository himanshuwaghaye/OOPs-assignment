/*
 * Q9. Display File Information
 * Write a Java program to accept a filename and display whether the file exists
 * and its file size.
 */
import java.io.File;
import java.util.Scanner;

public class Q09_FileInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        File file = new File(name);
        if (file.exists()) {
            System.out.println("File exists.");
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
