package AleksandrVasko.Collections.SetCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEqualsHashCod {

    public static void main(String[] args) {
        Set<Car> carshering = new HashSet<>();
        Set<Car> carshering1 = new HashSet<>();
        carshering.add(new Car("vw", "golf", 3000));
        carshering.add(new Car("vw", "jetta", 3100));
        carshering.add(new Car("vw", "passat", 4000));

        carshering1.add(new Car("audi", "a4", 5000));
        carshering1.add(new Car("renault", "koleos", 4000));
        carshering1.add(new Car("vw", "golf", 3000));

       // carshering.addAll(carshering1); // соединяет две коллдекции. Если перезаписаны методы equals и hashcode то в результате  в коллекции не будет одинаковых элементов.
       // carshering.retainAll(carshering1); //Сохраняет только элементы этого набора, содержащиеся в указанной коллекции (необязательная операция).
                                           // Другими словами, удаляет из этого набора все его элементы, которые не содержатся в указанной коллекции.
                                           // Если указанная коллекция также является набором,эта операция эффективно изменяет этот набор таким образом,
                                           // чтобы его значение было пересечением двух наборов.
        carshering.removeAll(carshering1);//Удаляет из этого набора все его элементы, содержащиеся в указанной коллекции.
        Car.print(carshering);


    }
}
