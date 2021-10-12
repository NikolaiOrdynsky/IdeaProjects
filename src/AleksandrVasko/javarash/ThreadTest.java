package AleksandrVasko.javarash;



import java.time.LocalDateTime;


/**
 * The type Thread test.
 */
public class ThreadTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();

    }

    /**
     * Sleep n second.
     *
     * @param n the n
     */
    public static void sleepNSecond(int n) {
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * The interface Musicalinstrument.
     */
    public interface Musicalinstrument extends Runnable {
        /**
         * Start playing local date time.
         *
         * @return the local date time
         */
        LocalDateTime startPlaying();

        /**
         * Stop playing local date time.
         *
         * @return the local date time
         */
        LocalDateTime stopPlaying();
    }

    /**
     * The type Violin.
     */
    public static class Violin implements Musicalinstrument {
        private String name;

        /**
         * Instantiates a new Violin.
         *
         * @param name the name
         */
        public Violin(String name) {
            this.name = name;
        }

        @Override
        public LocalDateTime startPlaying() {
            System.out.println(this.name + " start");
            return LocalDateTime.now();
        }

        @Override
        public LocalDateTime stopPlaying() {
            System.out.println(this.name + " stop");
            return LocalDateTime.now();
        }

        @Override
        public void run() {
            LocalDateTime startPlaying = startPlaying();
           sleepNSecond(1);
            LocalDateTime stopPlaying = stopPlaying();
            long time = stopPlaying.getSecond()-startPlaying.getSecond();
            System.out.println("Playing "+ time+" sec");
        }
    }
}
