public class Engine {
    int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "HorsePower :" + this.horsepower;
    }
}
