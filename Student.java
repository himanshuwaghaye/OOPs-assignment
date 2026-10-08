/* Shared Serializable Student class used by Q12 and Q13. */
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}
