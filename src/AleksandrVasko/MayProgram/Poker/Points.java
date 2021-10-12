package AleksandrVasko.MayProgram.Poker;



import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

/**
 * The type Points.
 */
public class Points {
    /**
     * Para set.
     *
     * @param arrayGamers the array gamers
     */
    public static void paraSet(ArrayList<Gamers> arrayGamers) {
        for (Gamers a : arrayGamers) {
            for (int i = 0; i < a.hand.size(); i++) {
                if (a.points == 3)
                    break;
                for (int j = i + 1; j < a.hand.size(); j++) {
                    if (a.hand.get(i).getFace().equals(a.hand.get(j).getFace())) {
                        a.points++;
                    }
                }
            }
        }
    }

    /**
     * Street.
     *
     * @param arrayGamers the array gamers
     */
    public static void street(ArrayList<Gamers> arrayGamers) {
        List<String> mastArrayList = new ArrayList<>(Arrays.asList(Cards.name));
        List<Integer> indexArray = new ArrayList<>();
        for (Gamers s : arrayGamers) {
            for (Cards a : s.hand) {
                int index = mastArrayList.indexOf(a.getFace());
                indexArray.add(index);

            }
            if (indexArray.get(0) + 1 == indexArray.get(1) && indexArray.get(1) + 1 == indexArray.get(2) &&
                    indexArray.get(2) + 1 == indexArray.get(3) && indexArray.get(3) + 1 == indexArray.get(4)) {
                s.points = 4;
            }
            indexArray.removeAll(indexArray);

        }
    }

    /**
     * Flash.
     *
     * @param arrayGamers the array gamers
     */
    public static void flash(ArrayList<Gamers> arrayGamers) {
        ArrayList<String> indexArray = new ArrayList<>();

        for (Gamers s : arrayGamers) {
            String indexValue = null;
            int points = 0;
            for (Cards c : s.hand) {
                indexValue = c.getMasti();
                indexArray.add(indexValue);
            }
            for (String c : indexArray) {
                if (c.equals(indexValue)) {
                    points++;
                }
            }
            if (points == 5) {
                s.points = 5;

            }
            indexArray.removeAll(indexArray);
        }
    }
}
