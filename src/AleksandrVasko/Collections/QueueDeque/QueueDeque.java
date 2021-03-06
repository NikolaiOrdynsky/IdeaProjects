package AleksandrVasko.Collections.QueueDeque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * The type Queue deque.
 */
/*Очереди представляют структуру данных, работающую по принципу FIFO (first in - first out).
То есть чем раньше был добавлен элемент в коллекцию, тем раньше он из нее удаляется.
Это стандартная модель однонаправленной очереди. Однако бывают и двунаправленные - то есть такие,
в которых мы можем добавить элемент не только в начала, но и в конец. И соответственно удалить элемент не только из конца, но и из начала.
Особенностью классов очередей является то, что они реализуют специальные интерфейсы Queue или Deque.

Интерфейс Queue
Обобщенный интерфейс Queue<E> расширяет базовый интерфейс Collection и определяет поведение класса в качестве однонаправленной очереди.
Свою функциональность он раскрывает через следующие методы:
E element(): возвращает, но не удаляет, элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
boolean offer(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false
E peek(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
E poll(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
E remove(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
Таким образом, у всех классов, которые реализуют данный интерфейс, будет метод offer для добавления в очередь,
метод poll для извлечения элемента из головы очереди, и методы peek и element, позволяющие просто получить элемент из головы очереди.
Интерфейс Deque
Интерфейс Deque расширяет вышеописанный интерфейс Queue и определяет поведение двунаправленной очереди,
которая работает как обычная однонаправленная очередь, либо как стек, действующий по принципу LIFO (последний вошел - первый вышел).

Интерфейс Deque определяет следующие методы:
-void addFirst(E obj): добавляет элемент в начало очереди
-void addLast(E obj): добавляет элемент obj в конец очереди
-E getFirst(): возвращает без удаления элемент из головы очереди. Если очередь пуста, генерирует исключение NoSuchElementException
-E getLast(): возвращает без удаления последний элемент очереди. Если очередь пуста, генерирует исключение NoSuchElementException
-boolean offerFirst(E obj): добавляет элемент obj в самое начало очереди. Если элемент удачно добавлен, возвращает true, иначе - false
-boolean offerLast(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false
-E peekFirst(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
-E peekLast(): возвращает без удаления последний элемент очереди. Если очередь пуста, возвращает значение null
-E pollFirst(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
-E pollLast(): возвращает с удалением последний элемент очереди. Если очередь пуста, возвращает значение null
-E pop(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
-void push(E element): добавляет элемент в самое начало очереди
-E removeFirst(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
-E removeLast(): возвращает с удалением элемент из конца очереди. Если очередь пуста, генерирует исключение NoSuchElementException
-boolean removeFirstOccurrence(Object obj): удаляет первый встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.
-boolean removeLastOccurrence(Object obj): удаляет последний встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.
Таким образом, наличие методов pop и push позволяет классам, реализующим этот элемент, действовать в качестве стека.
В тоже время имеющийся функционал также позволяет создавать двунаправленные очереди, что делает классы, применяющие данный интерфейс, довольно гибкими.*/
public class QueueDeque {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();

        list.offer(1);/*помещает указанный элемент в эту очередь, если это возможно сделать немедленно, не нарушая ограничений емкости.
                            При использовании очереди с ограниченной емкостью этот метод, как правило, предпочтительнее для добавления,
                            который может не вставить элемент, только вызвав исключение. */
        list.offer(2);
        list.offer(3);
        list.offer(4);
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        System.out.println(list.offerLast(9));//Вставляет указанный элемент в конец этого списка, если только это не нарушает ограничения емкости.
                                                // При использовании дескриптора с ограниченной емкостью этот метод обычно предпочтительнее метода addLast,
                                                // который может не вставить элемент, только вызвав исключение.

        list.poll();//Извлекает и удаляет заголовок этой очереди или возвращает значение null, если эта очередь пуста.
        System.out.println(list);

        list.element();//Извлекает, но не удаляет главу этой очереди. Этот метод отличается от peek только тем, что он создает исключение, если эта очередь пуста.

        list.removeFirst();// Извлекает и удаляет первый элемент этого дека. Этот метод отличается от pollFirst только тем, что он создает исключение, если этот раздел пуст.

        System.out.println( list.peekLast());//Извлекает, но не удаляет последний элемент этого списка или возвращает значение null, если этот список пуст.

        list.removeFirstOccurrence(3);//Удаляет первое вхождение указанного элемента из этого списка.
                                         // Если дека не содержит элемента, он остается неизменным.
                                         // Более формально удаляет первый элемент e таким образом, что Objects.равно(o, e) (если такой элемент существует).
                                         // Возвращает значение true, если этот deque содержал указанный элемент (или, что эквивалентно, если этот deque изменился в результате вызова).
        System.out.println(list);
    }
}

