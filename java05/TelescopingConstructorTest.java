public class TelescopingConstructorTest {
    public static void main(String[] args) {
        Pizza basicPizza = new Pizza(12);
        Pizza cheesePizza = new Pizza(12, true);
        Pizza pepperoniPizza = new Pizza(12, true, true);
        Pizza baconPizza = new Pizza(12, true, true, true);

        System.out.println("Basic Pizza: " + basicPizza);
        System.out.println("Cheese Pizza: " + cheesePizza);
        System.out.println("Pepperoni Pizza: " + pepperoniPizza);
        System.out.println("Bacon Pizza: " + baconPizza);
    }
}
