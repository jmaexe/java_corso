package models;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double perimeter() {
        return this.side * 4;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Square: side: " + this.side + ", perimeter: " + perimeter() + ", area: " + area();
    }

}