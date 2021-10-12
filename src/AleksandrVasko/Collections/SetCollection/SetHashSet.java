package AleksandrVasko.Collections.SetCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Set hash set.
 */
/*Интерфейс Set расширяет интерфейс Collection и представляет набор уникальных элементов.
Set не добавляет новых методов, только вносит изменения унаследованные.
В частности, метод add() добавляет элемент в коллекцию и возвращает true, если в коллекции еще нет такого элемента.
Обобщенный класс HashSet представляет хеш-таблицу. Он наследует свой функционал от класса AbstractSet, а также реализует интерфейс Set.
Хеш-таблица представляет такую структуру данных, в которой все объекты имеют уникальный ключ или хеш-код.
Данный ключ позволяет уникально идентифицировать объект в таблице.
Для создания объекта HashSet можно воспользоваться одним из следующих конструкторов:
-HashSet(): создает пустой список
-HashSet(Collection<? extends E> col): создает хеш-таблицу, в которую добавляет все элементы коллекции col
-HashSet(int capacity): параметр capacity указывает начальную емкость таблицы, которая по умолчанию равна 16
-HashSet(int capacity, float koef): параметр koef или коэффициент заполнения, значение которого должно быть в пределах от 0.0 до 1.0,
указывает, насколько должна быть заполнена емкость объектами прежде чем произойдет ее расширение. Например, коэффициент 0.75 указывает,
что при заполнении емкости на 3/4 произойдет ее расширение.*/
public class SetHashSet {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String[] array1 = {"vw","audi","skoda","lada"};
        String[] array2 = {"renault","mersedes","ferrari","lada"};
        Set<String > list = new HashSet<>(Arrays.asList(array1));
        System.out.println(list);
        list.addAll(Arrays.asList(array2));
        System.out.println(list);
    }
}
