/* Shared Serializable Employee class used by Q14 and Q15. */
import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
