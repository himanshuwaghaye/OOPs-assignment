/*
 * Q13. De-serialize Student Object
 * Create a Java program to read a serialized Student object from a file and
 * display the student's name and roll number using de-serialization.
 * (Run Q12 first to create student.ser)
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q13_DeserializeStudent {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s = (Student) ois.readObject();
            System.out.println("Student Details:");
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
