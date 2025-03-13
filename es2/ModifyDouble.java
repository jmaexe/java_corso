public class ModifyDouble {
    public static void main(String[] args) {
        double primitive = 5.0;
        modifyPrimitive(primitive);
        System.out.println("After ModifyPrimitive: " + primitive);

        BoxedDouble boxed = new BoxedDouble(5.0);
        modifyBoxed(boxed);
        System.out.println("After ModifyBoxed: " + boxed.getValue());
    }

    public static void modifyPrimitive(double value) {
        value *= 2;
    }

    public static void modifyBoxed(BoxedDouble value) {
        value.setValue(value.getValue() * 2);
    }
}
