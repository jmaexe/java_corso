import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> carList;

    public Garage() {
        carList = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        if (car != null)
            carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public void displayCars() {
        for (Car car : carList) {
            System.out.println(car.getDetails());
        }
    }

    public static void main(String[] args) {
        Garage g = new Garage();

        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2021);
        g.addCar(car1);
        g.addCar(car2);
        g.displayCars();

        g.removeCar(car2);
        System.out.println("DOPO RIMOZIONE: ");
        g.displayCars();

    }
}
