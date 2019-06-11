package module4.classwork;

public class ShapeClient {

    public static void main(String[] args) {
        Shape square = new Shape("Black", 4, 1);
        Shape triangle = new Shape("White", 3, 1);

        int squarePerimeter = square.perimeter();
        int trianglePerimeter = triangle.perimeter();

        System.out.println("Square: color " + square.color + " perimeter " + squarePerimeter);
        System.out.println("Triangle: color " + triangle.color + " perimeter " + trianglePerimeter);

        Shape otherTriangle = new Shape();

        otherTriangle.copyFrom(triangle);
        int otherTrianglePerimeter = otherTriangle.perimeter();
        System.out.println("Other triangle: color " + otherTriangle.color + " perimeter " + otherTrianglePerimeter);

        Shape thirdTriangle = triangle.copy();
        int thirdTrianglePerimeter = thirdTriangle.perimeter();
        System.out.println("third triangle: color " + thirdTriangle.color + " perimeter " + thirdTrianglePerimeter);

    }
}
