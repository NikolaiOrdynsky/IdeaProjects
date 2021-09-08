package AleksandrVasko.javarash;



import java.time.LocalDateTime;


public class ThreadTest {
    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();

    }

    public static void sleepNSecond(int n) {
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface Musicalinstrument extends Runnable {
        LocalDateTime startPlaying();

        LocalDateTime stopPlaying();
    }

    public static class Violin implements Musicalinstrument {
        private String name;

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
