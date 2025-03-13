package models;

public class SprinklerManager implements Observer {

    private Subject subject;

    public SprinklerManager(Subject subject) {
        this.subject = subject;
    }

    public SprinklerManager() {

    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public void update() {
        System.out.println("Sprinkler Manager received updates : " + subject.toString());
        manageSprinkler();
    }

    public void manageSprinkler() {
        System.out.println("Sprinkler Manager managing sprinkler");
        // riferimento a un singolo Subject
        WeatherStation subjectConverted = (WeatherStation) subject;
        if (subjectConverted.getTemperature() < 25 && subjectConverted.getHumidity() < 50) {
            System.out.println("Sprinkler Manager: Sprinkler is on");
        } else {
            System.out.println("Sprinkler Manager: Sprinkler is off");
        }
    }

}
