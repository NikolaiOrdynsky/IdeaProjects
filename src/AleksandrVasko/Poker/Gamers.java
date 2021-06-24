package AleksandrVasko.Poker;

import java.util.ArrayList;
import java.util.Collections;


public class Gamers {
    public static int numberGamers;
    public int points;
    public String name;
    ArrayList<Coloda> hand = new ArrayList<>();
   public Gamers(Coloda[] cards) {
        numberGamers++;
        Collections.addAll(hand, cards);
        System.out.println("Gamers " + numberGamers);
        System.out.println(print());
        this.name = "Gamers " + numberGamers;

    }

    public String print() {
        String value = "";
        for (Coloda s : hand) {

            value = value + s.getMasti() + s.getFace() + " ";
        }
        return value;
    }



}
