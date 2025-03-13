public class StaticFactoryMethods {
    public static void main(String[] args) {
        Point p1 = Point.fromCartesian(3, 4);
        Point p2 = Point.fromPolar(5, 0.9273);

        System.out.println("p1 : " + p1.getX() + " " + p1.getY());
        System.out.println("p2 : " + p2.getX() + " " + p2.getY());
    }
}
