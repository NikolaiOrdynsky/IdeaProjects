package AleksandrVasko.Collections.CollectionsClass;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(Mast.BYBNI,Name.DAMA);
        Card card2 = new Card(Mast.CHERVI,Name.KOROL);
        System.out.println(card1.compareTo(card2));
    }
}
