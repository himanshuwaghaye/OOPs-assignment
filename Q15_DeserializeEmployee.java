/*
 * Q15. De-serialize Employee Object
 * Write a Java program to read an Employee object from employee.dat using
 * de-serialization and display all employee details.
 * (Run Q14 first to create employee.dat)
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q15_DeserializeEmployee {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"))) {
            Employee e = (Employee) ois.readObject();
            System.out.println("Employee Details:");
            System.out.println("Employee ID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Salary: " + (long) e.salary);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
