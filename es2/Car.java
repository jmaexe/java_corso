public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getDetails() {
        return "Brand: " + this.brand + " Year: " + this.year;
    }

}
