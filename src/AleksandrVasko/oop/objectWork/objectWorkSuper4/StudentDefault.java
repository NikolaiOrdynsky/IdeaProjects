package AleksandrVasko.oop.objectWork.objectWorkSuper4;

/**
 * The type Student default.
 */
public class StudentDefault {
    /**
     * The Number student ticket.
     */
    int numberStudentTicket;
    /**
     * The Name.
     */
    String name;
    /**
     * The Surname.
     */
    String surname;
    /**
     * The Year teaching.
     */
    int yearTeaching;
    /**
     * The Average mark math.
     */
    double averageMarkMath;
    /**
     * The Average mark economy.
     */
    double averageMarkEconomy;
    /**
     * The Average mark foreign language.
     */
    double averageMarkForeignLanguage;

    /**
     * Out average mark.
     */
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
