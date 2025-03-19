package models;

public class AirConditionerAdapter extends AirConditioner implements Observer {
    private Subject subject;

    public AirConditionerAdapter(Subject subject) {
        this.subject = subject;

    }

    @Override
    public void update() {
        System.out.println("Air Conditioner received updates: " + subject);
        WeatherStation weatherStation = (WeatherStation) subject;
        if (weatherStation.getTemperature() > 30) {
            coolDown();
        } else {
            warmUp();
        }
    }

}
