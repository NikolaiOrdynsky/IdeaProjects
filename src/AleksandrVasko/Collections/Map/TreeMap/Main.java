package AleksandrVasko.Collections.Map.TreeMap;

import java.util.*;
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
   public static NavigableMap<StudentAvgGrade, Set<PredmetGrade>> map1 = new TreeMap<>(addStudent());
    public static void main(String[] args) {
        addStudent();
print(addStudent(),true);
    }

    private static float averageGrade(Set<PredmetGrade> alex) {
        float sum = 0f;
        for (PredmetGrade pg : alex) {
            sum = sum + pg.getGrade();
        }
        return sum / alex.size();
    }

    public static NavigableMap<StudentAvgGrade, Set<PredmetGrade>> addStudent() {
        Set<PredmetGrade> alex = new HashSet<>();
        alex.add(new PredmetGrade("история", 8));
        alex.add(new PredmetGrade("физика", 7));
        alex.add(new PredmetGrade("математика", 6));
        alex.add(new PredmetGrade("география", 9));
        alex.add(new PredmetGrade("информатика", 10));

        Set<PredmetGrade> nik = new HashSet<>();
        nik.add(new PredmetGrade("история", 7));
        nik.add(new PredmetGrade("физика", 8));
        nik.add(new PredmetGrade("математика", 7));
        nik.add(new PredmetGrade("география", 5));
        nik.add(new PredmetGrade("информатика", 9));

        Set<PredmetGrade> fil = new HashSet<>();
        fil.add(new PredmetGrade("история", 9));
        fil.add(new PredmetGrade("физика", 6));
        fil.add(new PredmetGrade("математика", 7));
        fil.add(new PredmetGrade("география", 10));
        fil.add(new PredmetGrade("информатика", 10));

        Set<PredmetGrade> mary = new HashSet<>();
        mary.add(new PredmetGrade("история", 9));
        mary.add(new PredmetGrade("физика", 9));
        mary.add(new PredmetGrade("математика", 7));
        mary.add(new PredmetGrade("география", 7));
        mary.add(new PredmetGrade("информатика", 7));

        Set<PredmetGrade> fiona = new HashSet<>();
        fiona.add(new PredmetGrade("история", 10));
        fiona.add(new PredmetGrade("физика", 10));
        fiona.add(new PredmetGrade("математика", 7));
        fiona.add(new PredmetGrade("география", 9));
        fiona.add(new PredmetGrade("информатика", 10));

        NavigableMap<StudentAvgGrade, Set<PredmetGrade>> map = new TreeMap<>();
        map.put(new StudentAvgGrade("Alex", averageGrade(alex)), alex);
        map.put(new StudentAvgGrade("Nik", averageGrade(nik)), nik);
        map.put(new StudentAvgGrade("Fil", averageGrade(fil)), fil);
        map.put(new StudentAvgGrade("Fiona", averageGrade(fiona)), fiona);
        map.put(new StudentAvgGrade("Mary", averageGrade(mary)), mary);

        return map;
    }

    public static void print(NavigableMap<StudentAvgGrade, Set<PredmetGrade>> map, boolean s) {

        Set<StudentAvgGrade> set = map.keySet();
        for (StudentAvgGrade sag : set) {
            System.out.println(sag.getName() + " " + sag.getAvgGrade());
            if (s) {
                System.out.println(map.get(sag));
            }
        }

    }
}
