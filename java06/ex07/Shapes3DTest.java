public class Shapes3DTest {

    public static void main(String[] args) {
        Cube cube = new Cube(3);

        Cylinder cylinder = new Cylinder(2, 5);
        System.out.println("Cube Surface Area : " + cube.getArea());
        System.out.println("Cube Volume : " + cube.getVolume());

        System.out.println("Cylinder Surface Area : " + cylinder.getArea());
        System.out.println("Cylinder Volume : " + cylinder.getVolume());

    }
}