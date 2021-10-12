package AleksandrVasko.Collections.ListArrayList_Iterator;

import java.util.*;

/**
 * The type Array lists.
 */
/*Для создания простых списков применяется интерфейс List, который расширяет функцональность интерфейса Collection.
Некоторые наиболее часто используемые методы интерфейса List:
-void add(int index, E obj): добавляет в список по индексу index объект obj
-boolean addAll(int index, Collection<? extends E> col): добавляет в список по индексу index все элементы коллекции col.
Если в результате добавления список был изменен, то возвращается true, иначе возвращается false
-E get(int index): возвращает объект из списка по индексу index
-int indexOf(Object obj): возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1
-int lastIndexOf(Object obj): возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, то возвращается -1
-ListIterator<E> listIterator (): возвращает объект ListIterator для обхода элементов списка
-static <E> List<E> of(элементы): создает из набора элементов объект List
-E remove(int index): удаляет объект из списка по индексу index, возвращая при этом удаленный объект
-E set(int index, E obj): присваивает значение объекта obj элементу, который находится по индексу index
-void sort(Comparator<? super E> comp): сортирует список с помощью компаратора comp
-List<E> subList(int start, int end): получает набор элементов, которые находятся в списке между индексами start и end

По умолчанию в Java есть встроенная реализация этого интерфейса - класс ArrayList.
Класс ArrayList представляет обобщенную коллекцию, которая наследует свою функциональность от класса AbstractList и применяет интерфейс List.
Проще говоря, ArrayList представляет простой список, аналогичный массиву, за тем исключением, что количество элементов в нем не фиксировано.
ArrayList имеет следующие конструкторы:
ArrayList(): создает пустой список
ArrayList(Collection <? extends E> col): создает список, в который добавляются все элементы коллекции col.
ArrayList (int capacity): создает список, который имеет начальную емкость capacity
Емкость в ArrayList представляет размер массива, который будет использоваться для хранения объектов.
При добавлении элементов фактически происходит перераспределение памяти - создание нового массива и копирование в него элементов из старого массива.
Изначальное задание емкости ArrayList позволяет снизить подобные перераспределения памяти, тем самым повышая производительность.
*/
public class ArrayLists {
    private List<String> listTask = new ArrayList<>();

    /**
     * Add in list.
     *
     * @param task the task
     */
// Добавить строку в конец коллекции List.
    public void addInList(String task) {
        listTask.add(task);
    }

    /**
     * Add in index list.
     *
     * @param index the index
     * @param task  the task
     */
//Добавить строку в определенную позицию колеекции List.
    public void addInIndexList(int index, String task) {
        listTask.add(index, task);
    }

    /**
     * Seurch index list int.
     *
     * @param task the task
     * @return the int
     */
// Получить индекс порядковой позиции строки в коллекции.
    public int seurchIndexList(String task) {
        return listTask.indexOf(task);
    }

    /**
     * Sets list.
     *
     * @param index the index
     * @param task  the task
     */
//Изменить строку  в коллекции, в позиции index.
    public void setList(int index, String task) {
        listTask.set(index, task);
    }

    /**
     * Remove list.
     *
     * @param index the index
     */
//Удалить строку из коллекции.
    public void removeList(int index) {
        listTask.remove(index);
    }

    /**
     * Print list.
     */
//Показать элементы коллекции.
    public void printList() {
//        for (int i = 0; i < listTask.size(); i++) {
//            System.out.println(i+"["+listTask.get(i)+"]");
      //  Collections.sort(listTask);
        Iterator<String> iterator = listTask.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * Add sort alfavit boolean.
     *
     * @param task the task
     * @return the boolean
     */
    public boolean addSortAlfavit(String task) {
        ListIterator<String> listIterator = listTask.listIterator();            //listiterator помещается в переменную
        while (listIterator.hasNext()) {                                        // цикл выполняется пока условие "следующий элемент есть в списке" возвращает true.
            int index = listIterator.next().compareTo(task);                    // В переменную index помещается результат сравнения следующего элемента с элемнтом из параметра метода
            if (index == 0) {                                                   //если результат сравнения равен 0 , значит сравнивыемые элементы равны
                System.out.println("Такой элемента уже есть в коллекции.");
                return true;                                                    // закончить цикл
            } else if (index > 0) {                                             // если в переменной index число 1 то это значит выбранный элемент для сравнения больше чем элемнт из параметра метода
                listIterator.previous();                                        // вернуть предыдущий элемент и переместить курсор
                listIterator.add(task);                                         // добавить элемент на место курсра
                return true;                                                    // закончить цикл
            }
        }
        listTask.add(task);
        return true;
    }

    /**
     * Size list int.
     *
     * @return the int
     */
    public int sizeList() {

        return listTask.size();
    }
}
