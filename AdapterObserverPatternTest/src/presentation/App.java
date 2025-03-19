package presentation;

import models.AirConditionerAdapter;
import models.Display;
import models.SprinklerManager;
import models.WeatherStation;

public class App {
    public static void main(String[] args) throws Exception {
        WeatherStation weatherStation = new WeatherStation(10, 20, 30);
        Display display = new Display(weatherStation);
        SprinklerManager manager = new SprinklerManager(weatherStation);

        AirConditionerAdapter airConditionerAdapter = new AirConditionerAdapter(weatherStation);

        weatherStation.add(display);
        weatherStation.add(manager);
        weatherStation.add(airConditionerAdapter);
        weatherStation.notifyObservers();
        System.out.println();
        System.out.println();
        weatherStation.setParam(60, 30, 40);

    }
}
