public class BulkCar {
    String brand;
    int year;

    public BulkCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null || getClass() != obj.getClass())
    // return false;
    // BulkCar car = (BulkCar) obj;
    // return car.brand.equals(this.brand) && car.year == this.year;
    // }

    public boolean equals(BulkCar car) {
        return car.brand.equals(this.brand) && car.year == this.year;
    }

    public static void main(String[] args) {
        BulkCar car1 = new BulkCar("Toyota", 2020);
        BulkCar car2 = new BulkCar("Toyota", 2020);
        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));
    }
}
