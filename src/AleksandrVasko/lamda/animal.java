package AleksandrVasko.lamda;

import java.util.ArrayList;

public class animal {
    private final String name;
   private final int mesto;
    private final int age;
    animal(String name, int mesto, int age){
        this.name = name;
        this.age = age;
        this.mesto = mesto;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMesto() {
        return mesto;
    }
    public  void showAnimal(animal n) {
        System.out.println("Имя: "+n.getName() + ". Номер места: " + n.getMesto() + ". Возраст: " + n.getAge());
    }
public static void sorted(ArrayList<animal> al, sort s){
        for(animal a : al){
            if(s.sortAnimal(a))
                a.showAnimal(a);
        }
}

}




interface sort{
    boolean sortAnimal (animal a);
}


class Mai{
    public static void main(String[] args) {
        animal leo = new animal("leva",1,3);
        animal elefant = new animal("jimbo",2,10);
        animal pingvin = new animal("kovalski",3,2);
       ArrayList <animal> aL = new ArrayList<>();
        aL.add(leo);
        aL.add(elefant);
        aL.add(pingvin);
        animal.sorted(aL, s ->s.getAge()>5);
        System.out.println("---------------------------");
        animal.sorted(aL, s -> s.getName().equals("kovalski"));
    }
}
