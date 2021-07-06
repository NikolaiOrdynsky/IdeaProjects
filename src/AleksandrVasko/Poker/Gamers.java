package AleksandrVasko.Poker;

import java.util.ArrayList;
import java.util.Collections;


public class Gamers {
    protected static int numberGamers;
    protected int points;
    protected String name;
    protected ArrayList<Cards> hand = new ArrayList<>();


    public Gamers(Cards[] cards) {
        numberGamers++;
        Collections.addAll(hand, cards);//Добавляет все указанные элементы в указанную коллекцию.
        // Добавляемые элементы могут быть указаны индивидуально или в виде массива.
        // Поведение этого удобного метода идентично поведению c.addAll(Массивы.asList(элементы)), но этот метод, вероятно,
        // будет работать значительно быстрее в большинстве реализаций.

        System.out.println("Gamers " + numberGamers);
        System.out.println(print());
        this.name = "Gamers " + numberGamers;

    }/*конструктор принимает массив типа Cards и передает в список hand (рука)*/

    public String print() {
        String value = "";
        for (Cards s : hand) {

            value = value + s.getMasti() + s.getFace() + " ";
        }
        return value;
    }


}
