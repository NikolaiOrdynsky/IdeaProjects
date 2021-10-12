package AleksandrVasko.StreamLamda.Lamda.Emploee;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * The type Emploee.
 */
public class emploee {
    /**
     * The Name.
     */
    String name;
    /**
     * The Department.
     */
    String department;
    /**
     * The Salary.
     */
    double salary;

    /**
     * Instantiates a new Emploee.
     *
     * @param name       the name
     * @param department the department
     * @param salary     the salary
     */
    emploee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

}

/**
 * The type Test 5.
 */
class test5 {
    /**
     * Print emploee.
     *
     * @param e the e
     */
    public void printEmploee(emploee e) {
        System.out.println(e.name + ", " + e.department + ", " + e.salary   + ".");
    }

    /**
     * Filtr emploee.
     *
     * @param al the al
     * @param p  the p
     */
    public void filtrEmploee(ArrayList<emploee> al, Predicate<emploee> p) {
        for (emploee em : al) {
            if (p.test(em)) {
                printEmploee(em);
            }
        }
    }
}

/**
 * The type Test 6.
 */
class test6 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ArrayList<emploee> al = new ArrayList<>();
        al.add(new emploee("Nik", "IT", 90.000));
        al.add(new emploee("Anna", "HR", 80.000));
        al.add(new emploee("Sam", "IT", 95.000));
        test5 ts = new test5();
        ts.filtrEmploee(al, p -> p.department.equals("IT") && p.salary > 90.000);

    }
}

