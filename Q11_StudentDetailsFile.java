/*
 * Q11. Write and Read Student Details from a File
 * Write a Java program to accept a student's name and roll number, write the
 * details into a file named student.txt, and then read and display the stored
 * details.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q11_StudentDetailsFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll Number: ");
        String roll = sc.nextLine();

        try (FileWriter fw = new FileWriter("student.txt")) {
            fw.write("Name: " + name + System.lineSeparator());
            fw.write("Roll Number: " + roll + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("Student Details:");
        try (BufferedReader br = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
