package module4.classwork.vehicles;

public abstract class Vehicle {

    int maxSpeed;
    int horsepower;
    String model;
    String vehicleName;

    public Vehicle(int maxSpeed, int horsepower, String model, String vehicleName) {
        this.maxSpeed = maxSpeed;
        this.horsepower = horsepower;
        this.model = model;
        this.vehicleName = vehicleName;
    }

    abstract void printUniqueProperty();
}
