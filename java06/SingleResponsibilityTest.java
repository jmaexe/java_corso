public class SingleResponsibilityTest {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        Logger l = new Logger();
        double a = 10, b = 5;
        l.log(a, "+", b, c.add(a, b));
        l.log(a, "-", b, c.subtract(a, b));
        l.log(a, "/", b, c.divide(a, b));
        l.log(a, "*", b, c.multiply(a, b));

    }
}