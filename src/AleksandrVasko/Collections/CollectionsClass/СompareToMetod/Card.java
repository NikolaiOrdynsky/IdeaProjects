package AleksandrVasko.Collections.CollectionsClass.СompareToMetod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Card implements Comparable<Card> {
    private Mast mast;
    private Name name;

    public Card(Mast mast, Name name) {
        this.mast = mast;
        this.name = name;
    }

    public Mast getMast() {
        return mast;
    }

    public Name getName() {
        return name;
    }

    /* Сравнивает этот объект с указанным объектом для заказа.
         Возвращает отрицательное целое число, ноль или положительное целое число,
         поскольку этот объект меньше, равен или больше указанного объекта.*/
    @Override
    public int compareTo(Card card) {                    // в параметры передается объект того же типа что и у объекта у которого вызывается метод.
        Name[] values = Name.values();                   //для сравнения будем использовать индексы очередности списка,
                                                         // поэтому очередность записи объектов в enum Name и есть условие старшинства объектов. Метод values() возвращает массив из enum.
        List<Name> listName = Arrays.asList(values);     //С помощью метода asList() преобразуем массив в коллекцию список.


        if (listName.indexOf(this.name) < listName.indexOf(card.getName())) {           // Сравниваем индекс поля name в списке listName , у текущего объекта,
                                                                                        // c помощью this  и индекс у name переданного в параметрах метода.
            return -1;                                                                  // Если результат -1  текущий объект меньше.
        } else if (listName.indexOf(this.name) > listName.indexOf(card.getName())) {
            return +1;                                                                  // +1  текущий объект больше.
        } else if (listName.indexOf(this.name) == listName.indexOf(card.getName())) {
            return String.valueOf(this.mast).compareTo(String.valueOf(card.getMast())); // Если объекты равны то с помощью метода valueOf,
                                                                                        //  у поля mast текущего объекта (возвращает строковое представление объекта),
                                                                                        // сравниваем с полем mast у объекта переданного в параметрах,  с помощью метода compareTo.
        }
        return 0; // возвращаем 0 если сравниваемые объекты равны и по полю name и по полю mast.
    }

    @Override
    public String toString() {
        return "Card " + mast + " " + name;

    }
    public static void printCard(ArrayList<Card> al) {
        System.out.println("-------------------------------------------------");
        int i = 0;
        for (Card s : al) {
            i++;
            System.out.printf("%-30s %s", s.toString(), i % 4 == 0 ? "\n" : " ");
        }
    }
}
