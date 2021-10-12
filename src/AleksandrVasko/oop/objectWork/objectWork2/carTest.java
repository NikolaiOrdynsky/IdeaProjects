package AleksandrVasko.oop.objectWork.objectWork2;

/**
 * The type Car test.
 */
public class carTest {
    /**
     * Swap door.
     *
     * @param y the y
     * @param x the x
     */
    public static void swapDoor(car y,int x) {
            y.door = x;
        }

    /**
     * Swap color.
     *
     * @param x the x
     * @param y the y
     */
    public static void swapColor(car x, car y) {
            car car2 = new car(null, null, 0);
            car2.color = x.color;
            x.color = y.color;
            y.color = car2.color;
        }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
            car ford = new car("red", "v4", 4);
            car audi = new car("blue", "v6", 5);
            System.out.println("цвет: " + ford.color + " мотор: " + ford.engine + " кол-во дверей: " + ford.door);
            System.out.println("цвет: " + audi.color + " мотор: "  + audi.engine+ " кол-во дверей: " + audi.door);
            swapDoor(ford,7);
            swapColor(ford, audi);
            System.out.println();
            System.out.println("цвет: " + ford.color + " мотор: " + ford.engine + " кол-во дверей: " + ford.door);
            System.out.println("цвет: " + audi.color + " мотор: "  + audi.engine+ " кол-во дверей: " + audi.door);
        }

    }


