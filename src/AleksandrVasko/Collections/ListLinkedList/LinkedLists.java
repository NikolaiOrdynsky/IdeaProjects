package AleksandrVasko.Collections.ListLinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * The type Linked lists.
 */
/*Обобщенный класс LinkedList<E> представляет структуру данных в виде связанного списка.
Он наследуется от класса AbstractSequentialList и реализует интерфейсы List, Dequeue и Queue.
То есть он соединяет функциональность работы со списком и фукциональность очереди.
Класс LinkedList имеет следующие конструкторы:
-LinkedList(): создает пустой список
-LinkedList(Collection<? extends E> col): создает список, в который добавляет все элементы коллекции col
-LinkedList содержит все те методы, которые определены в интерфейсах List, Queue, Deque. Некоторые из них:
-addFirst() / offerFirst(): добавляет элемент в начало списка
-addLast() / offerLast(): добавляет элемент в конец списка
-removeFirst() / pollFirst(): удаляет первый элемент из начала списка
-removeLast() / pollLast(): удаляет последний элемент из конца списка
-getFirst() / peekFirst(): получает первый элемент
-getLast() / peekLast(): получает последний элемент
*/
public class LinkedLists {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("milk");
        list.add("beard");
        list.add("coffe");
        list.add("chees");
        list.add("milk");
        System.out.println(list);
    }
}
