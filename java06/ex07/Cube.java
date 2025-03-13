public class Cube extends SolidShape {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return side * side * side;

    }

    @Override
    public double getArea() {
        return side * side;
    }

}