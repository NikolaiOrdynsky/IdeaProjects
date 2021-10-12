package AleksandrVasko.javarash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The type Singleton.
 */
public class Singleton {
    /**
     * The type Earth.
     */
    public static class Earth implements Planet {
        private static Earth instance;

        /**
         * Gets instance.
         *
         * @return the instance
         */
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

    /**
     * The type Sun.
     */
    public static class Sun implements Planet {
        private static Sun instance;

        /**
         * Gets instance.
         *
         * @return the instance
         */
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

    /**
     * The type Moon.
     */
    public static class Moon implements Planet {
        private static Moon instance;

        /**
         * Gets instance.
         *
         * @return the instance
         */
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

    /**
     * The interface Planet.
     */
    public  interface Planet {
        /**
         * The constant SUN.
         */
        static String SUN = "sun";
        /**
         * The constant MOON.
         */
        static String MOON = "moon";
        /**
         * The constant EARTH.
         */
        static String EARTH = "earth";
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(thePlanet);
    }

    static {
        greatePlanet();


    }

    /**
     * The constant thePlanet.
     */
    public static Planet thePlanet;

    /**
     * Greate planet.
     */
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
