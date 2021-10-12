package AleksandrVasko.StreamLamda.Lamda.Animal;

import java.util.ArrayList;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
            animal leo = new animal("leva", 1, 3);
            animal elefant = new animal("jimbo", 2, 10);
            animal pingvin = new animal("kovalski", 3, 2);
            ArrayList<animal> aL = new ArrayList<>();
            aL.add(leo);
            aL.add(elefant);
            aL.add(pingvin);
            animal.sorted(aL, s -> s.getAge() < 5);
            System.out.println("---------------------------");
            animal.sorted(aL, s -> s.getName().equals("kovalski"));
        }

}
