package ZaurTregulov.objectWork.objectWorkSuper4;

public class StudentDefault {
    int numberStudentTicket;
    String name;
    String surname;
    int yearTeaching;
    double averageMarkMath;
    double averageMarkEconomy;
    double averageMarkForeignLanguage;

      void  outAverageMark () { // инфо о студенте + среднее арифметическое по всем предметам

       double averageMark = ((averageMarkMath + averageMarkEconomy + averageMarkForeignLanguage)/3);
        System.out.println();
        System.out.println("Имя. " +  name);
        System.out.println("Фамилия. " +  surname);
        System.out.println("Кол-во лет обучения. " +  yearTeaching);
        System.out.println("Номер ученика. " +  numberStudentTicket);
        System.out.println("Средний бал за все предметы. " + averageMark);
    }

}
