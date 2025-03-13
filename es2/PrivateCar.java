public class PrivateCar {
    private String brand;
    private int year;

    public PrivateCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Brand : " + this.brand + ", year: " + this.year;
    }

    public static void main(String[] args) {
        PrivateCar car = new PrivateCar("Toyota", 2020);
        System.out.println(car.getBrand());
        car.setYear(2022);
        System.out.println(car.getYear());
    }
}
