package AleksandrVasko.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

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
        for (int i = 0; i < listTask.size(); i++) {
            System.out.println(i+"["+listTask.get(i)+"]");
        }
    }
    public int sizeList(){

        return listTask.size();
    }
}
