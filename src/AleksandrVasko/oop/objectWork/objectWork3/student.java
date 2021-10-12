package AleksandrVasko.oop.objectWork.objectWork3;

/**
 * The type Student.
 */
public class student {
    /**
     * The Name.
     */
    String name;
    /**
     * The Aver mat.
     */
    double averMat;
    /**
     * The Aver fiz.
     */
    double averFiz;

    /**
     * Instantiates a new Student.
     *
     * @param name    the name
     * @param averMat the aver mat
     * @param averFiz the aver fiz
     */
    student(String name, double averMat, double averFiz) {
        this.name = name;
        this.averMat = averMat;
        this.averFiz = averFiz;
    }

    /**
     * Sravn student.
     *
     * @param a the a
     * @param b the b
     */
    public static void sravnStudent(student a, student b) {
        if (a.name.equalsIgnoreCase(b.name)) {
            System.out.println("Студенты с одинокыми именами ");
        } else {
            System.out.println("У студентов разные имена ");
        }
    }

    /**
     * Sravn par stud.
     *
     * @param a the a
     * @param b the b
     */
    public static void sravnParStud(student a, student b) {
        System.out.println("Имя студента: " + a.name + " Средняя оценка по математике: " + a.averMat + " Средняя оценка по физике: " + a.averFiz);
        System.out.println("Имя студента: " + b.name + " Средняя оценка по математике: " + b.averMat + " Средняя оценка по физике: " + b.averFiz);
        if (a.name.equalsIgnoreCase(b.name)) {
            System.out.println("Студенты с одинокыми именами ");
        } else {
            System.out.println("У студентов разные имена ");
        }
        if (a.averFiz == b.averFiz) {
            System.out.println("У студентов одинаковые оценки по физике ");
        } else {
            System.out.println("У студентов разные оценки по физике ");
        }
        if (a.averMat == b.averMat) {
            System.out.println("У студентов одинаковые оценки по математике ");
        } else {
            System.out.println("У студентов разные оценки по математике ");
        }

    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        student st1 = new student("ivan", 4.3, 4.4);
        student st2 = new student("maks", 4.3, 4.4);

        sravnParStud(st1, st2);
    }
}
