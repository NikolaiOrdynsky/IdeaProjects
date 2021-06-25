package AleksandrVasko.Collections.SetCollection;

import java.util.Arrays;

import java.util.LinkedHashSet;
/* Реализация хэш-таблицы и связанного списка интерфейса набора с предсказуемым порядком итераций.
Эта реализация отличается от HashSet тем, что она поддерживает двусвязный список, проходящий через все ее записи.
Этот связанный список определяет порядок итераций, то есть порядок, в котором элементы были вставлены в набор (порядок вставки).
Обратите внимание, что порядок вставки не изменяется, если элемент повторно вставляется в набор.
(Элемент e повторно вставляется в набор s, если s.add(e) вызывается, когда s.contains(e) вернет значение true непосредственно перед вызовом.)
Эта реализация избавляет своих клиентов от неопределенного, как правило, хаотичного упорядочения, предоставляемого HashSet,
 без увеличения затрат, связанных с набором деревьев. Его можно использовать для создания копии набора, который имеет тот же порядок,
 что и оригинал, независимо от реализации исходного набора */

public class SetLinkedHashSet {
    public static void main(String[] args) {
        String[] array1 = {"vw","audi","skoda","lada"};
        String[] array2 = {"renault","mersedes","ferrari","lada"};
        java.util.Set<String > list = new LinkedHashSet<>(Arrays.asList(array1));
        System.out.println(list);
        list.addAll(Arrays.asList(array2));
        System.out.println(list);
    }
}
