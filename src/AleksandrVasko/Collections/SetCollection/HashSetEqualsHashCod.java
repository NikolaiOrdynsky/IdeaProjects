package AleksandrVasko.Collections.SetCollection;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetEqualsHashCod {
    static class Car {
        private final String brend;
        private final String model;
        private final Integer price;

        public Car(String brend, String model, Integer price) {
            this.brend = brend;
            this.model = model;
            this.price = price;
        }

        public String getBrend() {
            return brend;
        }

        public String getModel() {
            return model;
        }

        public Integer getPrice() {
            return price;
        }

        public static void print(Collection<Car> car) {
            for (Car s : car) {
                System.out.printf("%-20s %-20s %-20s \n", s.getBrend(), s.getModel(), s.getPrice());
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }

            Car car = (Car) obj;
            if (!this.getBrend().equals(car.getBrend())) {
                return false;
            }
            if (!this.getModel().equals(car.getModel())) {
                return false;
            }

            return (this.getPrice().equals(car.getPrice()));


        }

        @Override
        public int hashCode() {
            return brend.hashCode() + model.hashCode() + price.hashCode();
        }
    }

    public static void main(String[] args) {
        Set<Car> carshering = new HashSet<>();
        Set<Car> carshering1 = new HashSet<>();
        carshering.add(new Car("vw", "golf", 3000));
        carshering.add(new Car("vw", "jetta", 3100));
        carshering.add(new Car("vw", "passat", 4000));
        carshering1.add(new Car("audi", "a4", 5000));
        carshering1.add(new Car("renault", "koleos", 4000));
        carshering1.add(new Car("vw", "golf", 3000));

        carshering.addAll(carshering1);
        Car.print(carshering);

    }
}
