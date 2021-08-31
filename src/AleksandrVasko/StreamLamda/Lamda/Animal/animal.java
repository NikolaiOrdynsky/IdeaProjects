package AleksandrVasko.StreamLamda.Lamda.Animal;

import java.util.ArrayList;

public class animal {
    private final String name;
    private final int mesto;
    private final int age;

    animal(String name, int mesto, int age) {
        this.name = name;
        this.age = age;
        this.mesto = mesto;
    }

    @Override
    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                ", mesto=" + mesto +
                ", age=" + age +
                '}';
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

    public static void showAnimal(animal n) {
        System.out.println("Имя: " + n.getName() + ". Номер места: " + n.getMesto() + ". Возраст: " + n.getAge());
    }

    public static void sorted(ArrayList<animal> al, sort<animal> s) {
        for (animal a : al) {
            if (s.test(a))
                showAnimal(a);
        }
    }

}





