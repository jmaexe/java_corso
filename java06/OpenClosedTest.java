public class OpenClosedTest {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Rectangle area : " + rectangle.getArea());
        System.out.println("Circle area : " + circle.getArea());
    }

}