package models;

public class GeometricShapeObjectAdapter implements Shape {

    private GeometricShape geometricShape;

    public GeometricShapeObjectAdapter(GeometricShape geometricShape) {
        this.geometricShape = geometricShape;
    }

    @Override
    public double perimeter() {
        System.out.print("Geometric Shape Object Adapter : ");
        return geometricShape.perimeter();
    }

    @Override
    public double area() {
        System.out.print("Geometric Shape Object Adapter : ");
        return geometricShape.area();
    }

}