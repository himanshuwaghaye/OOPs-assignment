/*
 * Q12. Serialize Student Object
 * Create a Student class containing name and roll number. Write a Java program
 * to create a Student object and store the object in a file using serialization.
 * (Student class is in Student.java)
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Q12_SerializeStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll Number: ");
        int roll = Integer.parseInt(sc.nextLine().trim());

        Student s = new Student(name, roll);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s);
            System.out.println("Student object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
