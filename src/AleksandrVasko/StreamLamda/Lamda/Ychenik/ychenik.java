package AleksandrVasko.StreamLamda.Lamda.Ychenik;

import java.util.ArrayList;

public class ychenik {
    String name;
    int age;
    double avgGrand;
    String pol;

    ychenik(String name, int age, double avgGrand, String pol) { //Создается конструктор с аргументами name , age, avgGrand, pol.
        this.name = name;// Переменная name этого объекта равна аргументу name.
        this.age = age;
        this.avgGrand = avgGrand;
        this.pol = pol;
    }

}
class styInfo{
    public  static void infoStudentPol(ArrayList<ychenik> a, String pol) {
        for (ychenik b : a) {
            if(b.pol.equals(pol)){
                System.out.println(b.name);
            }
        }
    }
    public static void infoStudent(ArrayList<ychenik> a, int age){
        for (ychenik b:a) {
            if(b.age==age){
                System.out.println(b.name+" "+b.age);
            }

        }
    }
    public static void infoStudent(ArrayList<ychenik> a, double avgGrand){
        for (ychenik b:a){
            if(b.avgGrand<=avgGrand){
                System.out.println(b.name+" "+b.avgGrand);
            }
        }
    }
    public static void infoStudent(ArrayList<ychenik> a, String name){
        for (ychenik b:a) {
            if(b.name.equals(name)){
                System.out.println(b.name+" "+b.pol+" "+b.age+" "+b.avgGrand);
            }
        }
    }
}



class main1 {
    public static void main(String[] args) {
        ychenik ych1 = new ychenik("Ivanov", 20, 9, "men"); // Создается объект класса ychenik.
        ychenik ych2 = new ychenik("Petrov", 21, 8, "men");// Создается объект класса ychenik.
        ychenik ych3 = new ychenik("Sidorova", 22, 8.5, "woman");// Создается объект класса ychenik.
        ychenik ych4 = new ychenik("Fenkova", 20, 9.1, "woman");// Создается объект класса ychenik.
        ArrayList<ychenik> arrayList1 = new ArrayList<>();// Создается ArrayList
        arrayList1.add(ych1);// В ArrayList добавляем объект класса ychenik - ych1.
        arrayList1.add(ych2);
        arrayList1.add(ych3);
        arrayList1.add(ych4);
        styInfo.infoStudent(arrayList1,9.1); //Методы infoStudent overlodet перегруженные, так как имеют разные аргументы.

    }
}

