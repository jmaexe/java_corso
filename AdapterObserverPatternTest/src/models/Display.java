package models;

public class Display implements Observer {
    private Subject subject;

    public Display(Subject subject) {
        this.subject = subject;
    }

    public Display() {

    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public void update() {
        System.out.println("Display received updates : " + subject.toString());
    }

}
