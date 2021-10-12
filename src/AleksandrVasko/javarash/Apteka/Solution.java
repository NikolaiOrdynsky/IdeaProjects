package AleksandrVasko.javarash.Apteka;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Solution.
 */
public class Solution {
    /**
     * The constant drugsController.
     */
    public static DrugsController drugsController = new DrugsController();
    /**
     * The constant isStopped.
     */
    public static boolean isStopped = false;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws InterruptedException the interrupted exception
     */
    public static void main(String[] args) throws InterruptedException {
        Thread apteka = new Thread(new Apteka(), "Apteka");
        Thread man = new Thread(new Person(), "Мужчина");
        Thread woman = new Thread(new Person(), "Женщина");

        apteka.start();
        man.start();
        woman.start();

        Thread.sleep(1000);
        isStopped = true;
    }

    /**
     * The type Apteka.
     */
    public static class Apteka implements Runnable {
        @Override
        public void run() {
            while (!isStopped) {
                drugsController.sell(getRandomDrug(), getRandomCount());
                waitAMoment();
                waitAMoment();
                waitAMoment();
            }
        }
    }

    /**
     * The type Person.
     */
    public static class Person implements Runnable {
        @Override
        public void run() {
            while (!isStopped) {
                drugsController.buy(getRandomDrug(), getRandomCount());
                waitAMoment();
            }

        }
    }

    /**
     * Gets random count.
     *
     * @return the random count
     */
    public synchronized static int getRandomCount() {
        return (int) (Math.random() * 3) + 1;
    }

    /**
     * Gets random drug.
     *
     * @return the random drug
     */
    public static Drug getRandomDrug() {
        int index = (int) ((Math.random() * 1000) % (DrugsController.allDrugs.size()));
        List<Drug> drugs = new ArrayList<>(DrugsController.allDrugs.keySet());
        return drugs.get(index);
    }

    private synchronized static void waitAMoment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}