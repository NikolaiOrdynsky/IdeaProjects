package AleksandrVasko.Collections.SetCollection;

import java.util.Collection;

class Car implements Comparable<Car>{
    private final String brend;
    private final String model;
    private final Integer price;

    public Car(String brend, String model, Integer price) {
        this.brend = brend;
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString() {
        return brend+" "+model+" "+price+"\n";
    }

    @Override
    public int compareTo(Car car) {
        if(this.price> car.getPrice()) return 1;
        if(this.price< car.getPrice())return -1;
        return 0;
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


}
