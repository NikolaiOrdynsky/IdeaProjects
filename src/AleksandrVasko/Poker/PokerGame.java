package AleksandrVasko.Poker;

import java.util.ArrayList;

public class PokerGame {
    public static ArrayList<Gamers> points = new ArrayList<>();

    public static Coloda[] randomArray() {
        Coloda.addColoda();
        Coloda[] array = new Coloda[5];
        for (int i = 0; i < 5; i++) {
            int index = (int) (Math.random() * 52);
            array[i] = Coloda.coloda.get(index);
        }
        return array;
    }

    public static Coloda[] valueArray() {
        Coloda.addColoda();
        Coloda[] array = new Coloda[5];
        array[0] = Coloda.coloda.get(13);
        array[1] = Coloda.coloda.get(14);
        array[2] = Coloda.coloda.get(15);
        array[3] = Coloda.coloda.get(16);
        array[4] = Coloda.coloda.get(17);
        return array;
    }

    public static void game(int colGammers) {
        ArrayList<Gamers> arrayGamers = new ArrayList<>();
        for (int i = 0; i < colGammers; i++) {
            arrayGamers.add(new Gamers(randomArray()));
        }
        arrayGamers.add(new Gamers(valueArray()));
        Points.paraSet(arrayGamers);
        Points.street(arrayGamers);
        Points.flash(arrayGamers);
        points.addAll(arrayGamers);
        for (Gamers s : PokerGame.points) {
            System.out.println(s.name + " " + s.points);
        }
        winner(points);
    }

    private static void winner(ArrayList<Gamers> gamers) {
        ArrayList<Gamers> winner = new ArrayList<>();
        Gamers max = gamers.get(0);
        for (Gamers s : gamers) {
            if (s.points > max.points) {
                max = s;
            }
        }
        for (Gamers a : gamers) {
            if (a.points == max.points) {
                winner.add(a);
            }
        }
        for (Gamers s : winner) {
            System.out.println("Winner " + s.name + " points " + s.points);
            if (s.points == 1) {
                System.out.println("Para");
            } else if (s.points == 2) {
                System.out.println("2 Pary");
            } else if (s.points == 3) {
                System.out.println("Set");
            } else if (s.points == 4) {
                System.out.println("Street");
            }
            else if (s.points == 5) {
                System.out.println("Flash");
            }
        }
    }
}

