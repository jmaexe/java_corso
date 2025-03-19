package models;

public class Triangle implements Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double semiperimeter = perimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }

    @Override
    public String toString() {
        return "Triangle: side-1 :  " + side1 + ", side-2: " + side2 + ", side-3: " + side3 + ", perimeter: "
                + perimeter() + ", area: " + area();
    }

}