public class TrackedCar {

    private String brand;
    private int year;
    private static int numberOfCars = 0;

    public TrackedCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
        numberOfCars++;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void main(String[] args) {
        new TrackedCar("Toyota", 2020);
        new TrackedCar("Honda", 2022);
        System.out.println("Number of cars: " + TrackedCar.getNumberOfCars());
    }
}
