public class ForSaleCar {

    String brand;
    int year;

    public ForSaleCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getDetails() {
        return "Brand : " + this.brand + ", Year: " + this.year;
    }

    public static void main(String[] args) {
        ForSaleCar[] cars = {
                new ForSaleCar("Toyota", 2020),
                new ForSaleCar("Honda", 2021),
                new ForSaleCar("Ford", 2022)
        };

        for (ForSaleCar forSaleCar : cars) {
            System.out.println(forSaleCar.getDetails());
        }

    }
}
