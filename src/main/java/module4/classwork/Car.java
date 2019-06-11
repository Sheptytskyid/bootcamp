package module4.classwork;

class Car {

    String color;
    int horsepowers;
    int maxSpeed;

    Car(String color, int horsepowers, int maxSpeed) {
        this.color = color;
        this.horsepowers = horsepowers;
        this.maxSpeed = maxSpeed;
    }

    Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
               "color='" + color + '\'' +
               ", horsepowers=" + horsepowers +
               ", maxSpeed=" + maxSpeed +
               '}';
    }
}
