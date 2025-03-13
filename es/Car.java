public class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(Car car) {
        this.model = car.model;
        this.engine = new Engine(car.engine.getHorsePower());
    }

    public Engine getEngine() {
        return engine;
    }

}
