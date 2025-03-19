package models;

import java.util.Arrays;
import java.util.List;

public class ShapeCalculator {

    private List<Shape> shapes;

    public ShapeCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public void areas() {
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }

    public void perimeters() {
        for (Shape shape : shapes) {
            System.out.println(shape.perimeter());
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 8);
        GeometricShapeObjectAdapter adapter = new GeometricShapeObjectAdapter(rectangle);
        ShapeCalculator shapeCalculator = new ShapeCalculator(Arrays.asList(
                new Square(4),
                new Triangle(1, 4, 9),
                new Triangle(5, 6, 7),
                new Square(5),
                adapter));
        shapeCalculator.perimeters();
    }
}