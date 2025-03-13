public class FactoryPatternTest {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.creatCircle();
        Shape shape2 = ShapeFactory.createRectangle();
        if (shape1 != null)
            shape1.draw();
        if (shape2 != null)
            shape2.draw();
    }
}
