package module4.classwork.vehicles;

public class Client {

    public static void main(String[] args) {

        Bus bus = new Bus(60, 150, "MAN", "Bus", 40);
        Suv suv = new Suv(150, 200, "Citroen", "Suv", 50);
        Truck truck = new Truck(60, 250, "Scania", "Truck", 100);
        Car car = new Car(200, 200, "Polonez", "Car", "White");
        Cabrio cabrio = new Cabrio(500, 600, "The best", "Cabrio", "Red/Black");

        bus.printUniqueProperty();
        suv.printUniqueProperty();
        truck.printUniqueProperty();
        car.printUniqueProperty();

        VehicleCrusher crusher = new VehicleCrusher();

        crusher.destroyVehicle(bus);
        crusher.destroyVehicle(suv);
        crusher.destroyVehicle(truck);
        crusher.destroyVehicle(car);
        crusher.destroyVehicle(cabrio);

    }
}
