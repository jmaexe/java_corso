public class DefensiveDeepCopyTest {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", new Engine(200));
        Car car2 = new Car(car1);

        System.out.println(car1 == car2);
        System.out.println(car1.getEngine() == car2.getEngine());
    }
}
