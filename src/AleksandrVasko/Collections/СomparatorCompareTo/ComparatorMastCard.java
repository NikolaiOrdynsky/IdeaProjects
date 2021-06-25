package AleksandrVasko.Collections.СomparatorCompareTo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorMastCard implements Comparator<Card> {
List<Mast> mast = new ArrayList<>(Arrays.asList(Mast.values()));
    @Override
    public int compare(Card card1, Card card2) {
        return Integer.compare(mast.indexOf(card1.getMast()), mast.indexOf(card2.getMast()));

    }
}
