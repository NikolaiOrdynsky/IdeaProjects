package AleksandrVasko.StreamLamda.Lamda.Animal;

import java.util.ArrayList;

/**
 * The type Animal.
 */
public class animal {
    private final String name;
    private final int mesto;
    private final int age;

    /**
     * Instantiates a new Animal.
     *
     * @param name  the name
     * @param mesto the mesto
     * @param age   the age
     */
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

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets mesto.
     *
     * @return the mesto
     */
    public int getMesto() {
        return mesto;
    }

    /**
     * Show animal.
     *
     * @param n the n
     */
    public static void showAnimal(animal n) {
        System.out.println("Имя: " + n.getName() + ". Номер места: " + n.getMesto() + ". Возраст: " + n.getAge());
    }

    /**
     * Sorted.
     *
     * @param al the al
     * @param s  the s
     */
    public static void sorted(ArrayList<animal> al, sort<animal> s) {
        for (animal a : al) {
            if (s.test(a))
                showAnimal(a);
        }
    }

}





