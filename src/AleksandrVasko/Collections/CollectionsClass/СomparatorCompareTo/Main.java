package AleksandrVasko.Collections.CollectionsClass.СomparatorCompareTo;

import java.util.ArrayList;
import java.util.Collections;



public class Main {


    public static void main(String[] args) {
        Card card1 = new Card(Mast.BYBNI, Name.DAMA);
        Card card2 = new Card(Mast.CHERVI, Name.KOROL);
        System.out.println(card1.compareTo(card2));// сравнение объектов с помощью перезаписанного метогда compareTo в классе Card.

        ArrayList<Card> al = new ArrayList<>();
        Mast[] valueMast = Mast.values();//Создаем массив из элементов enum Mast.
        Name[] valueName = Name.values();//Создаем массив из элементов enum Name.

        //добавляем в ArrayList объекты класса Card.

        for (Name name : valueName) {          // цикл по массиву valueName.
            for (Mast mast : valueMast) {      // цикл по массиву valueMast.
                al.add(new Card(mast, name));  //добавляем объект класса Card с текущими (mast,name) из циклов.
            }
        }


        Card.printCard(al);  // Выводим на экран элементы из ArrayList

        Collections.shuffle(al); // перемешать элементы в ArrayList.

        Card.printCard(al);  // Выводим на экран элементы из ArrayList

        al.sort(new ComparatorCard()); // Метод sort класса ArrayList сортирует элементы с помощью нашего компаратора.


    }

}

