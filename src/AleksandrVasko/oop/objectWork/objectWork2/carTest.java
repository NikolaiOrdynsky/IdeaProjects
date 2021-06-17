package AleksandrVasko.oop.objectWork.objectWork2;

public class carTest {
        public static void swapDoor(car y,int x) {
            y.door = x;
        }

        public static void swapColor(car x, car y) {
            car car2 = new car(null, null, 0);
            car2.color = x.color;
            x.color = y.color;
            y.color = car2.color;
        }

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


