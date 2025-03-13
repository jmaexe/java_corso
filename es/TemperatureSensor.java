public class TemperatureSensor {
    private int temperature;
    private TemperatureDisplay display;

    public TemperatureSensor(int temperature) {
        this.temperature = temperature;
    }

    public TemperatureSensor(TemperatureDisplay display) {
        this.display = display;
    }

    public void updateTemperature(int temperature) {
        this.temperature = temperature;
        if (this.temperature > 50) {
            display.alert(this);
        } else {
            System.out.println("Temperature is " + this.temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

}
