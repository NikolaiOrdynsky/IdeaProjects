package AleksandrVasko.Poker;

import java.util.ArrayList;

public class PokerGame {


    protected static ArrayList<Gamers> arrayGamers = new ArrayList<>();//создается список из элементов типа Gamers.

    public static Cards[] randomArray() {
        Cards.addColoda();
        Cards[] array = new Cards[5];
        for (int i = 0; i < 5; i++) {
            int index = (int) (Math.random() * 52);
            array[i] = Cards.cards.get(index);
        }
        return array;
    }/*Возвращает массив типа Cards со случайными пятью картами.  */

    public static Cards[] valueArray() {
        Cards.addColoda();
        Cards[] array = new Cards[5];
        array[0] = Cards.cards.get(13);
        array[1] = Cards.cards.get(14);
        array[2] = Cards.cards.get(15);
        array[3] = Cards.cards.get(16);
        array[4] = Cards.cards.get(17);
        return array;
    }/*Возвращает массив типа Cards со пятью картами, указанными вручную.  */

    public static void greatGamersAddHandsCard(int colGammers) {

        for (int i = 0; i < colGammers; i++) {
            arrayGamers.add(new Gamers(randomArray()));
        }// добавляем новые объекты класса Gamers в список arrayGamers. В конструкторе передаем массив Cards[] в нем содержатся их карты.
        arrayGamers.add(new Gamers(valueArray()));// добавляем новые объекты класса Gamers в список arrayGamers. В конструкторе передаем массив Cards[] в нем содержатся их карты.

        /*В методах класса Points, проверяем карты в списке hand, у объектов Gamers, в списке arrayGamers,
        присваиваем полям points у объектов Gamers соответств. очки.*/
        Points.paraSet(arrayGamers);
        Points.street(arrayGamers);
        Points.flash(arrayGamers);


        //выводим на экран объекты с наибольшими очками.
        winner(arrayGamers);
    }//Создает игроков и добавляет им карты в Hands(руку)

    private static void winner(ArrayList<Gamers> gamersArrayList) {
        ArrayList<Gamers> winner = new ArrayList<>();
        Gamers max = gamersArrayList.get(0);
        for (Gamers s : gamersArrayList) {
            if (s.points > max.points) {
                max = s;
            }
        }
        for (Gamers a : gamersArrayList) {
            if (a.points == max.points) {
                winner.add(a);
            }
        }
        for (Gamers s : PokerGame.arrayGamers) {
            System.out.print(s.name + " " + "points "+s.points);
            switch (s.points){
                case 1 -> { System.out.println(" Para");break; }
                case 2-> {System.out.println(" 2 Pary");break;}
                case 3-> {System.out.println(" Set");break;}
                case 4-> {System.out.println(" Street");break;}
                case 5-> {System.out.println(" Flash");break;}
                default -> System.out.println(" ");
            }

        }
        System.out.println("==========================");
        for (Gamers s : winner) {
            System.out.println("Winner " + s.name + " points " + s.points);
            if (s.points == 1) {
                System.out.println("Para");
            } else if (s.points == 2) {
                System.out.println("2 Pary");
            } else if (s.points == 3) {
                System.out.println("Set");
            } else if (s.points == 4) {
                System.out.println("Street");
            } else if (s.points == 5) {
                System.out.println("Flash");
            }
        }
    }//показывает игроков и их очки, так же победителя и его очки.
}

