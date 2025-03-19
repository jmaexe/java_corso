package models;

public class Rhombus implements GeometricShape {
    private double diagonal1;
    private double diagonal2;

    public Rhombus() {
    }

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    @Override
    public double perimeter() {
        return diagonal1 * 2 + diagonal2 * 2;
    }

    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public String toString() {
        return "Rhombus: diagonal-1: " + diagonal1 + ", diagonal-2: " + diagonal2;
    }
}
