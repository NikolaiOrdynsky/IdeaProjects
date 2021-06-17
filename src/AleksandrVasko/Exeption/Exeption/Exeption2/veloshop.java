package AleksandrVasko.Exeption.Exeption.Exeption2;

import java.util.ArrayList;

public class veloshop {
    private ArrayList<String> garaj = new ArrayList<>();

    public void getGaraj(String name) {
        if (garaj.contains(name)) {
            System.out.println(name + " Номер ячейки на складе " + garaj.indexOf(name));
        } else {
            System.out.println("такого велолсипеда нет на складе. ");
        }

    }

    public void setGaraj(String name) throws noSize {
        if (garaj.size() < 5) {
            garaj.add(name);
            System.out.println(name + " добавлен на склад.");
        } else {
            throw new noSize(name + " не добавлен на склад, нет места.");
        }


    }

    class noSize extends Exception {
        noSize(String message) {
            super(message);
        }
    }
}