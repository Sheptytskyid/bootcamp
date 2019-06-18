package module4.classwork.vehicles;

public class Car extends Vehicle {

    String color;

    public Car(int maxSpeed, int horsepower, String model, String vehicleName, String color) {
        super(maxSpeed, horsepower, model, vehicleName);
        this.color = color;
    }

    void printUniqueProperty() {
        System.out.println("I have a color: " + color);
    }
}
