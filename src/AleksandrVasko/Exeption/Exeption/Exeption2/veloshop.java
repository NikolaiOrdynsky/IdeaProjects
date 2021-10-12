package AleksandrVasko.Exeption.Exeption.Exeption2;

import java.util.ArrayList;

/**
 * The type Veloshop.
 */
public class veloshop {
    private ArrayList<String> garaj = new ArrayList<>();

    /**
     * Gets garaj.
     *
     * @param name the name
     */
    public void getGaraj(String name) {
        if (garaj.contains(name)) {
            System.out.println(name + " Номер ячейки на складе " + garaj.indexOf(name));
        } else {
            System.out.println("такого велолсипеда нет на складе. ");
        }

    }

    /**
     * Sets garaj.
     *
     * @param name the name
     * @throws noSize the no size
     */
    public void setGaraj(String name) throws noSize {
        if (garaj.size() < 5) {
            garaj.add(name);
            System.out.println(name + " добавлен на склад.");
        } else {
            throw new noSize(name + " не добавлен на склад, нет места.");
        }


    }

    /**
     * The type No size.
     */
    class noSize extends Exception {
        /**
         * Instantiates a new No size.
         *
         * @param message the message
         */
        noSize(String message) {
            super(message);
        }
    }
}