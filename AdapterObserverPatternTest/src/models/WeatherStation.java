package models;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation(float temperature, float humidity, float pressure, List<Observer> observers) {
        super(observers);
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public WeatherStation(float temperature, float humidity, float pressure) {
        super(new ArrayList<Observer>());
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setParam(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Weather Station: temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure;
    }

}