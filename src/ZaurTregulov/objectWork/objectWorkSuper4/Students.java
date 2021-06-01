package ZaurTregulov.objectWork.objectWorkSuper4;
import java.util.Scanner;
public class Students {


    public static void main(String[] args) {

        StudentDefault student1 = new StudentDefault();

        Scanner console = new Scanner (System.in);

        System.out.println("Введите имя");    // вводятся данные в student1
        student1.name =console.nextLine();
        System.out.println("Введите фамилию");
        student1.surname = console.nextLine();
        System.out.println("Введите кол-во лет обучения");
        student1.yearTeaching = console.nextInt();
        System.out.println("Введите номер ученика");
        student1.numberStudentTicket = console.nextInt();
        System.out.println("Введите средний балл по математике");
        student1.averageMarkMath = console.nextDouble();
        System.out.println("Введите средний балл по экономике");
        student1.averageMarkEconomy = console.nextDouble();
        System.out.println("Введите средний балл по иностранному языку");
        student1.averageMarkForeignLanguage = console.nextDouble();

        student1.outAverageMark();

    }


}

