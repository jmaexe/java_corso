public class Cylinder extends SolidShape {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return radius * radius * Math.PI * height;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

}
