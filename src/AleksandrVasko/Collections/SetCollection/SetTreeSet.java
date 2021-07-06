package AleksandrVasko.Collections.SetCollection;

import java.util.Arrays;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
/*Обобщенный класс TreeSet<E> представляет структуру данных в виде дерева, в котором все объекты хранятся в отсортированном виде по возрастанию.
TreeSet является наследником класса AbstractSet и реализует интерфейс NavigableSet, а следовательно, и интерфейс SortedSet.
В классе TreeSet определены следующие конструкторы:
-TreeSet(): создает пустое дерево
-TreeSet(Collection<? extends E> col): создает дерево, в которое добавляет все элементы коллекции col
-TreeSet(SortedSet <E> set): создает дерево, в которое добавляет все элементы сортированного набора set
-TreeSet(Comparator<? super E> comparator): создает пустое дерево, где все добавляемые элементы впоследствии будут отсортированы компаратором.
     */
public class SetTreeSet {
    public static void main(String[] args) {
        NavigableSet <Car> listCar = new TreeSet<>();
        listCar.add(new Car("vw", "golf", 3000));
        listCar.add(new Car("vw", "jetta", 3100));
        listCar.add(new Car("audi", "a4", 4000));
        listCar.add(new Car("audi", "tt", 5000));
        listCar.add(new Car("mersedes", "e500", 6000));
        listCar.add(new Car("ferrari", "cfd", 10000));
        Car.print(listCar);

        System.out.println(listCar.ceiling(new Car("audi", "a4", 4100)));//ищет в наборе наименьший элемент e, который больше obj (e >=obj).
        // Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.
        System.out.println(listCar.floor(new Car("audi", "a4", 4100)));//ищет в наборе наибольший элемент e, который меньше элемента obj (e <=obj).
        // Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.
        System.out.println(listCar.higher(new Car("audi", "a4", 4000)));//ищет в наборе наименьший элемент e, который больше элемента obj (e >obj).
        // Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.
        System.out.println(listCar.lower(new Car("audi", "a4", 4000)));//ищет в наборе наибольший элемент e, который меньше элемента obj (e <obj).
        // Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.
    }
}