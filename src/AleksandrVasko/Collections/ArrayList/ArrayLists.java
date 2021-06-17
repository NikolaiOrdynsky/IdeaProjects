package AleksandrVasko.Collections.ArrayList;

import java.util.*;

public class ArrayLists {
    private List<String> listTask = new ArrayList<>();

    // Добавить строку в конец коллекции List.
    public void addInList(String task) {
        listTask.add(task);
    }

    //Добавить строку в определенную позицию колеекции List.
    public void addInIndexList(int index, String task) {
        listTask.add(index, task);
    }

    // Получить индекс порядковой позиции строки в коллекции.
    public int seurchIndexList(String task) {
        return listTask.indexOf(task);
    }

    //Изменить строку  в коллекции, в позиции index.
    public void setList(int index, String task) {
        listTask.set(index, task);
    }

    //Удалить строку из коллекции.
    public void removeList(int index) {
        listTask.remove(index);
    }

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

    public int sizeList() {

        return listTask.size();
    }
}
