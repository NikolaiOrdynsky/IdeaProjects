package lamda;

import java.util.ArrayList;

public class ychenik1 {

    String name;
    int age;
    double avgGrand;
    String pol;

    ychenik1(String name, int age, double avgGrand, String pol) { //Создается конструктор с аргументами name , age, avgGrand, pol.
        this.name = name;// Переменная name этого объекта равна аргументу name.
        this.age = age;
        this.avgGrand = avgGrand;
        this.pol = pol;
    }


}

class stInfo {
    void printSt(ychenik1 b) {
        System.out.println(b.name + " " + b.pol + " " + b.age + " " + b.avgGrand);
    }

    void testYchenik(ArrayList<ychenik1> aL, infoStudent iS) { // Метод принимает параметры массив список типа ychenik1
                                 // и объект интерфейса infoStudent.
        for (ychenik1 b : aL) { // Цикл пробегает по массиву и сравнивает объекты ychenik1.
            if (iS.infoSt(b))   // Каждый объект в массиве проверяется на условие, если абстрактый метод интерфейса infoStudent ,
                                // в который передается объект из массива возвращает True, тогда

                printSt(b);    // запустить метод printSt с параметром - объект из массива на котором метод infoSt вернул True.
        }
    }
}

class main {
    public static void main(String[] args) {
        ychenik1 ych1 = new ychenik1("Ivanov", 20, 9, "men");      // Создается объект класса ychenik.
        ychenik1 ych2 = new ychenik1("Petrov", 21, 8, "men");      // Создается объект класса ychenik.
        ychenik1 ych3 = new ychenik1("Sidorova", 22, 8.5, "woman");// Создается объект класса ychenik.
        ychenik1 ych4 = new ychenik1("Fenkova", 20, 9.1, "woman"); // Создается объект класса ychenik.

        ArrayList<ychenik1> arrayList1 = new ArrayList<>();// Создается ArrayList
        arrayList1.add(ych1);                              // В ArrayList добавляем объект класса ychenik - ych1.
        arrayList1.add(ych2);                              // В ArrayList добавляем объект класса ychenik - ych1.
        arrayList1.add(ych3);                              // В ArrayList добавляем объект класса ychenik - ych1.
        arrayList1.add(ych4);                              // В ArrayList добавляем объект класса ychenik - ych1.


        stInfo si = new stInfo();                          // Создается объект класса infoSt - si

        si.testYchenik(arrayList1, c -> c.pol.equals("men")); // С помощью объекта класса stInfo вызывается метод testYchenik, который принимает
                                                              // параметры - массив список, и объект функционального интерфейса infoStudent,
                                                              // в виде реализации единственного метода infoSt,
                                                              // который представлен в виде лямбда выражения.

    }
}


interface infoStudent {
    boolean infoSt(ychenik1 c);
}