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
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", horsepowers=").append(horsepowers);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append('}');
        return sb.toString();
    }
}
