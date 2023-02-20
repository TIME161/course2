package oop2;

public class ServiceStation {
    public void check(Car car) {

            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }

    public void check(Bicycle bicycle) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }

    public void check(Truck truck) {
       if (truck != null && truck.getDaysGarantee() > 0) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
       if (truck != null && truck.getDaysGarantee() < 1){
            truck.garanteeIsDown();
        }
            }

public void line() {
    System.out.println("-------------------------");
}
        }