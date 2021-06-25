package AleksandrVasko.Poker;

import java.util.ArrayList;
import java.util.Collections;


public class Gamers {
    protected static int numberGamers;
    protected int points;
    protected String name;
    protected ArrayList<Cards> hand = new ArrayList<>();
    /*конструктор принимает массив типа Cards и передает в список hand (рука)*/
   public Gamers(Cards[] cards) {
        numberGamers++;
        Collections.addAll(hand, cards);
        System.out.println("Gamers " + numberGamers);
        System.out.println(print());
        this.name = "Gamers " + numberGamers;

    }

    public String print() {
        String value = "";
        for (Cards s : hand) {

            value = value + s.getMasti() + s.getFace() + " ";
        }
        return value;
    }



}
