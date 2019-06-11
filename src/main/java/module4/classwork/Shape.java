package module4.classwork;

class Shape {

    String color;
    int numberOfVertices;
    int sideLength;

    Shape(String color, int numberOfVertices, int sideLength) {
        this.color = color;
        this.numberOfVertices = numberOfVertices;
        this.sideLength = sideLength;
    }

    public Shape() {
    }


    int perimeter() {
        return sideLength * numberOfVertices;
    }

    void copyFrom(Shape otherShape) {
        this.color = otherShape.color;
        this.numberOfVertices = otherShape.numberOfVertices;
        this.sideLength = otherShape.sideLength;
    }

    Shape copy() {
        return new Shape(color, numberOfVertices, sideLength);
    }

}
