package AleksandrVasko.Collections.CollectionsClass.СompareToMetod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorCard implements Comparator<Card> {
    List<Name> listName = Arrays.asList(Name.values());

    @Override
    public int compare(Card card1, Card card2) {
        if (listName.indexOf(card1.getName()) < listName.indexOf(card2.getName())) {
            return -1;
        } else if (listName.indexOf(card1.getName()) > listName.indexOf(card2.getName())) {
            return +1;
        }
           return card1.getMast().compareTo(card2.getMast());
    }
}
