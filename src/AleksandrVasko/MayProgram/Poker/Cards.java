package AleksandrVasko.MayProgram.Poker;

import java.util.ArrayList;

/**
 * The type Cards.
 */
public class Cards {
    /**
     * The Mast.
     */
    protected static String[] mast = {"C", "P", "K", "B"};
    /**
     * The Name.
     */
    protected static String[] name = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "D", "K", "A"};
    private final String masti;
    private final String face;
    /**
     * The constant cards.
     */
    protected static ArrayList<Cards> cards = new ArrayList<>();

    /**
     * Instantiates a new Cards.
     *
     * @param masti the masti
     * @param face  the face
     */
    public Cards(String masti, String face) {
        this.masti = masti;
        this.face = face;

    }

    /**
     * Add coloda.
     */
    public static void addColoda() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards.add(new Cards(mast[i], name[j]));
            }
        }
    }

    /**
     * Print.
     */
    public static void print() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.printf("%-3s %s", cards.get(i).getMasti() + " " + cards.get(i).getFace(), (i + 1) % 13 == 0 ? "\n" : " ");
        }

    }

    /**
     * Gets masti.
     *
     * @return the masti
     */
    public String getMasti() {
        return masti;
    }

    /**
     * Gets face.
     *
     * @return the face
     */
    public String getFace() {
        return face;
    }


}


