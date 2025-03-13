
import models.Display;
import models.SprinklerManager;
import models.WeatherStation;

public class App {
    public static void main(String[] args) throws Exception {
        WeatherStation weatherStation = new WeatherStation(10, 20, 30);
        Display display = new Display();
        SprinklerManager manager = new SprinklerManager();
        display.setSubject(weatherStation);
        manager.setSubject(weatherStation);
        weatherStation.add(display);
        weatherStation.add(manager);
        weatherStation.notifyObservers();
        weatherStation.setParam(60, 30, 40);

    }
}
