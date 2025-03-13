import java.util.Optional;

public class TemperatureSensor {
    private Double temperature;

    public TemperatureSensor() {

    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Optional<Double> getTemperature() {
        return Optional.ofNullable(temperature);
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        System.out.println(sensor.getTemperature().orElse(0.0));
        sensor.setTemperature(25.0);
        System.out.println(sensor.getTemperature().orElse(0.0));
    }

}
