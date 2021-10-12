package AleksandrVasko.MayProgram.Poker;

import java.util.ArrayList;
import java.util.Collections;


/**
 * The type Gamers.
 */
public class Gamers {
    /**
     * The constant numberGamers.
     */
    protected static int numberGamers;
    /**
     * The Points.
     */
    protected int points;
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Hand.
     */
    protected ArrayList<Cards> hand = new ArrayList<>();


    /**
     * Instantiates a new Gamers.
     *
     * @param cards the cards
     */
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

    /**
     * Print string.
     *
     * @return the string
     */
    public String print() {
        String value = "";
        for (Cards s : hand) {

            value = value + s.getMasti() + s.getFace() + " ";
        }
        return value;
    }


}
