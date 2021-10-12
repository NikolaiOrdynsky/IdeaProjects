package AleksandrVasko.javarash.TestThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Solution.
 */
public class Solution {
    /**
     * The constant threads.
     */
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread_1());
        threads.add(new Thread_2());
        threads.add(new Thread_3());
        threads.add(new Thread_4());
        threads.add(new Thread_5());
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws InterruptedException the interrupted exception
     */
    public static void main(String[] args) throws InterruptedException {

    }

    /**
     * The type Thread 1.
     */
    public static class Thread_1 extends Thread {
        @Override
        public void run() {

        }
    }

    /**
     * The type Thread 2.
     */
    public static class Thread_2 extends Thread {


        @Override
        public void run() {

            try {
                throw new InterruptedException();
            } catch (InterruptedException s) {
                System.out.println("InterruptedException");
            }

        }
    }

    /**
     * The type Thread 3.
     */
    public static class Thread_3 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * The type Thread 4.
     */
    public static class Thread_4 extends Thread implements Message {
        @Override
        public void showWarning() {
            boolean alive = isAlive();
            if (alive) {
                this.interrupt();
            }

        }

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + " Запущена");


        }
    }

    /**
     * The type Thread 5.
     */
    public static class Thread_5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String value = "";
            Integer sum = 0;
            try {
                while (true) {
                    if (!(value = reader.readLine()).equalsIgnoreCase("N")) {
                        if (booleanInteger(value)) {
                            int a = Integer.parseInt(value);
                            sum = sum + a;
                        }
                    } else {
                        break;
                    }

                }
            } catch (IOException s) {
                s.printStackTrace();
            }
            System.out.println(sum);
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean booleanInteger(String string) {
        boolean value = false;
        if (string != null) {
            try {
                int i = Integer.parseInt(string);
                value = true;

            } catch (NumberFormatException s) {
                value = false;
            }
        }
        return value;
    }
}
