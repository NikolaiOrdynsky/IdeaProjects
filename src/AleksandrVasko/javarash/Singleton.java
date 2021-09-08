package AleksandrVasko.javarash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Singleton {
    public static class Earth implements Planet {
        private static Earth instance;

        public static Earth getInstance() {
            if (instance == null) {
                return instance = new Earth();
            }
            return instance;
        }

        @Override
        public String toString() {
            return "Earth";
        }
    }

    public static class Sun implements Planet {
        private static Sun instance;

        public static Sun getInstance() {
            if (instance == null) {
                return instance = new Sun();
            }
            return instance;
        }

        @Override
        public String toString() {
            return "Sun";
        }
    }

    public static class Moon implements Planet {
        private static Moon instance;

        public static Moon getInstance() {
            if (instance == null) {
                return instance = new Moon();
            }
            return instance;
        }

        @Override
        public String toString() {
            return "Moon";
        }
    }

    public  interface Planet {
        static String SUN = "sun";
        static String MOON = "moon";
        static String EARTH = "earth";
    }

    public static void main(String[] args) {
        System.out.println(thePlanet);
    }

    static {
        greatePlanet();


    }

    public static Planet thePlanet;

    public static void greatePlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String value = reader.readLine();

            if (value.equalsIgnoreCase(Planet.EARTH)) {
                thePlanet = Earth.getInstance();
            } else if (value.equalsIgnoreCase(Planet.SUN)) {
                thePlanet = Sun.getInstance();
            } else if (value.equalsIgnoreCase(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            } else {
                thePlanet = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
