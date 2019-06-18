package module4.classwork.vehicles;

public class Suv extends Vehicle {

    int carBootCapacity;

    public Suv(int maxSpeed, int horsepower, String model, String vehicleName, int carBootCapacity) {
        super(maxSpeed, horsepower, model, vehicleName);
        this.carBootCapacity = carBootCapacity;
    }

    void printUniqueProperty() {
        System.out.println("I have car boot capacity: " + carBootCapacity);
    }
}
