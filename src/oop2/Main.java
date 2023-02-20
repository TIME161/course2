package oop2;

public class Main {
    public static void main(String[] args) {
       Vehicle one = new Vehicle();

        Car car = new Car("car1", 1);
        Car car2 = new Car("car2",1);
        car.setModelName("Audi");
        car2.setModelName("Bmw");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck("truck1", 4, 1, "");
        Truck truck2 = new Truck("truck2", 4,0,"");
        truck.setModelName("Man");
        truck2.setModelName("Scania");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle("bicycle1", 0);
        Bicycle bicycle2 = new Bicycle("bicycle2", 0);
        bicycle.setModelName("BMX");
        bicycle2.setModelName("Child Bicycle");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(3);


        ServiceStation station = new ServiceStation();
        station.line();
        station.check(car);
        station.line();
        station.check(car2);
        station.line();
        station.check(bicycle);
        station.line();
        station.check(bicycle2);
        station.line();
        System.out.println("Статус гарантии: " + truck.getGaranteeStatus());
        station.check(truck);
        station.line();
        System.out.println("Статус гарантии: " + truck2.getGaranteeStatus());
        station.check(truck2);
        station.line();
    }
}