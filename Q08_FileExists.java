/*
 * Q8. Check Whether a File Exists
 * Write a Java program to accept a filename and check whether the file exists
 * using the File handling operations in Java.
 */
import java.io.File;
import java.util.Scanner;

public class Q08_FileExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        File file = new File(name);
        System.out.println(file.exists() ? "File exists." : "File does not exist.");
    }
}
