package AleksandrVasko.oop.objectWork.works;


import java.util.Scanner;

public class works {
            int id;
            double salary;
            int age;
            String department;
            String surname;

            works(int id1, double salary2, int age1, String department1, String surname1) {
                id = id1;
                salary = salary2;
                age = age1;
                department = department1;
                surname = surname1;
            }
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
            void upToSalary(double x) {

                System.out.println("новая зп работника " + salary * x);
                System.out.println(" ");

            }



        }


