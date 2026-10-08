/*
 * Q14. Serialize Employee Object
 * Create an Employee class containing employee ID, name and salary. Write a Java
 * program to serialize an Employee object and store it in a file named employee.dat.
 * (Employee class is in Employee.java)
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Q14_SerializeEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee ID: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Salary: ");
        double salary = Double.parseDouble(sc.nextLine().trim());

        Employee e = new Employee(id, name, salary);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"))) {
            oos.writeObject(e);
            System.out.println("Employee object serialized successfully.");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
