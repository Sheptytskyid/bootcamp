package module4.classwork.vehicles;

public class Truck extends Vehicle {

    int containerCapacity;

    public Truck(int maxSpeed, int horsepower, String model, String vehicleName, int containerCapacity) {
        super(maxSpeed, horsepower, model, vehicleName);
        this.containerCapacity = containerCapacity;
    }

    void printUniqueProperty() {
        System.out.println("I have a container capacity: " + containerCapacity);
    }
}
