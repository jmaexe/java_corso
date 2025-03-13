public class ConditionalCallbackTest {
    public static void main(String[] args) {
        TemperatureDisplay display = new TemperatureDisplay();
        TemperatureSensor sensor = new TemperatureSensor(display);
        sensor.updateTemperature(40);
        sensor.updateTemperature(60);
    }
}
