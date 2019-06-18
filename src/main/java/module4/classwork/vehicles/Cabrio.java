package module4.classwork.vehicles;

public class Cabrio extends Vehicle {

    String color;

    public Cabrio(int maxSpeed, int horsepower, String model, String vehicleName, String color) {
        super(maxSpeed, horsepower, model, vehicleName);
        this.color = color;
    }

    void printUniqueProperty() {
        System.out.println("A have a color: " + color);
    }
}
