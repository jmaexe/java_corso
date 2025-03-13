public class RaceCar {
    String brand;
    int year;
    Engine engine;

    public RaceCar(String brand, int year, Engine engine) {
        this.brand = brand;
        this.year = year;
        this.engine = engine;
    }

    public String getDetails() {
        return "Brand : " + this.brand + ", Year: " + this.year + ",\n Engine: " + this.engine.toString();
    }

    public static void main(String[] args) {
        Engine engine = new Engine(450);
        RaceCar car = new RaceCar("Dodge", 2021, engine);
        System.out.println(car.getDetails());
    }
}
