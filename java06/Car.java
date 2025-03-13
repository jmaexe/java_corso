
public class Car extends Vehicle {

    private double speed;

    public Car(double vehicleSpeed, double carSpeed) {
        super(vehicleSpeed);
        this.speed = carSpeed;
    }

    public void displaySpeeds() {
        System.out.println("Vehicle speed: " + getSpeed());
        System.out.println("Car speed: " + speed);
    }
}