package AleksandrVasko.Collections.Map.TreeMap;

import java.util.*;

import static AleksandrVasko.Collections.Map.TreeMap.Student.addStudent;

/*Класс TreeMap расширяет класс AbstractMap и реализует интерфейс NavigatebleMap.
Он создает коллекцию, которая для хранения элементов применяет дерево. Объекты сохраняются в отсортированном порядке по возрастанию.
Время доступа и извлечения элементов достаточно мало, что делает класс TreeMap блестящим выбором для хранения больших объемов отсортированной информации,
которая должна быть быстро найдена.
TreeMap основан на Красно-Черном дереве, вследствие чего TreeMap сортирует элементы по ключу в естественном порядке или на основе заданного вами компаратора.
TreeMap гарантирует скорость доступа log(n) для операций containsKey, get, put и remove.
В классе TreeMap присутствуют следующие конструкторы:
1. TreeMap( )
2. TreeMap(Comparator comp)
3. TreeMap(Map m)
4. TreeMap(SortedMap sm)
Первый конструктор создает коллекцию, в которой все элементы отсортированы в натуральном порядке их ключей.
Второй конструктор создаст пустую коллекцию, элементы в которой будут отсортированы по закону, который определен в передаваемом компараторе.
Третий конструктор создаст TreeMap на основе уже имеющегося Map.
Четвертый конструктор создаст TreeMap на основе уже имеющегося SortedMap , элементы в которой будут отсортированы по закону передаваемой SortedMap .
Обратите внимание на то, что для сортировки используются ключи, а не значения.
*/
public class Main {

    public static void main(String[] args) {
        addStudent();
        print(addStudent(), true);
    }


    public static void print(NavigableMap<Student, Set<PredmetGrade>> map, boolean s) {

        Set<Student> set = map.keySet();
        for (Student sag : set) {
            System.out.println(sag.getName() + " " + sag.getAvgGrade());
            if (s) {
                System.out.println(map.get(sag));
            }
        }

    }
}
