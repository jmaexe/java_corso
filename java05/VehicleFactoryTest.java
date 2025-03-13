public class VehicleFactoryTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle motorcycle = new Motorcycle();

        if (car != null) {
            car.drive();
        }

        if (truck != null) {
            truck.drive();
        }

        if (motorcycle != null) {
            motorcycle.drive();
        }
    }
}
