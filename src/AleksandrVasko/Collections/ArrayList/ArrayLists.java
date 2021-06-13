package AleksandrVasko.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    private List<String> listTask = new ArrayList<>();

    // Добавить строку в конец коллекции List.

    public void addListTask(String task) {
        listTask.add(task);
    }

    //Добавить строку в определенную позицию колеекции List.
    public void addIndexListTask(int index, String task){
        listTask.add(index, task);
    }
}
