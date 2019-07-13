package module4.classwork.vehicles;

public class Bus extends Vehicle {

    int passengerSeats;

    Bus(int maxSpeed, int horsepower, String model, String vehicleName, int passengerSeats) {
        super(maxSpeed, horsepower, model, vehicleName);
        this.passengerSeats = passengerSeats;
    }

    void printUniqueProperty() {
        System.out.println("I have passenger seats: " + passengerSeats);
    }
}
