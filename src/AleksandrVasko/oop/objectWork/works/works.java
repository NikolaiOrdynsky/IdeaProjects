package AleksandrVasko.oop.objectWork.works;


import java.util.Scanner;

/**
 * The type Works.
 */
public class works {
    /**
     * The Id.
     */
    int id;
    /**
     * The Salary.
     */
    double salary;
    /**
     * The Age.
     */
    int age;
    /**
     * The Department.
     */
    String department;
    /**
     * The Surname.
     */
    String surname;

    /**
     * Instantiates a new Works.
     *
     * @param id1         the id 1
     * @param salary2     the salary 2
     * @param age1        the age 1
     * @param department1 the department 1
     * @param surname1    the surname 1
     */
    works(int id1, double salary2, int age1, String department1, String surname1) {
                id = id1;
                salary = salary2;
                age = age1;
                department = department1;
                surname = surname1;
            }

    /**
     * Info.
     */
    void info() {
        Scanner console = new Scanner(System.in);
        System.out.println("работник. " + surname);
        System.out.println("id. " + id);
        System.out.println("зп работника. " + salary);
        System.out.println("отдел. " + department);
        System.out.println("возраст. " + age);
        System.out.println("зарплату работника изменить? ");
        String i = console.nextLine();
        if (i.equalsIgnoreCase("да")){
            double z = console.nextDouble();
            upToSalary(z);
        }


    }

    /**
     * Up to salary.
     *
     * @param x the x
     */
    void upToSalary(double x) {

                System.out.println("новая зп работника " + salary * x);
                System.out.println(" ");

            }



        }


