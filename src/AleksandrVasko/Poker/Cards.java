package AleksandrVasko.Poker;

import java.util.ArrayList;

public class Cards {
    protected static String[] mast = {"C", "P", "K", "B"};
    protected static String[] name = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "D", "K", "A"};
    private final String masti;
    private final String face;
    protected static ArrayList<Cards> cards = new ArrayList<>();

    public Cards(String masti, String face) {
        this.masti = masti;
        this.face = face;

    }

    public static void addColoda() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards.add(new Cards(mast[i], name[j]));
            }
        }
    }

    public static void print() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.printf("%-3s %s", cards.get(i).getMasti() + " " + cards.get(i).getFace(), (i + 1) % 13 == 0 ? "\n" : " ");
        }

    }

    public String getMasti() {
        return masti;
    }

    public String getFace() {
        return face;
    }


}


