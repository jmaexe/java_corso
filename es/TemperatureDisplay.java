public class TemperatureDisplay {
    public void alert(TemperatureSensor sensor) {
        System.out.println("Alert: Temperature reached : " + sensor.getTemperature() + "!");
    }

    public void update(TemperatureSensor sensor) {
        System.out.println("Temperature is " + sensor.getTemperature());
    }
}
