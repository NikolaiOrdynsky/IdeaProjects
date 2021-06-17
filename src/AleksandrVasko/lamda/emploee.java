package AleksandrVasko.lamda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.function.Predicate;

public class emploee {
    String name;
    String department;
    double salary;

    emploee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

}

class test5 {
    public void printEmploee(emploee e) {
        System.out.println(e.name + ", " + e.department + ", " + e.salary   + ".");
    }

    public void filtrEmploee(ArrayList<emploee> al, Predicate<emploee> p) {
        for (emploee em : al) {
            if (p.test(em)) {
                printEmploee(em);
            }
        }
    }
}

class test6 {
    public static void main(String[] args) {
        ArrayList<emploee> al = new ArrayList<>();
        al.add(new emploee("Nik", "IT", 90.000));
        al.add(new emploee("Anna", "HR", 80.000));
        al.add(new emploee("Sam", "IT", 95.000));
        test5 ts = new test5();
        ts.filtrEmploee(al, p -> p.department.equals("IT") && p.salary > 90.000);

    }
}

