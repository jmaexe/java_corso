package models;

import java.util.List;

public abstract class Subject {

    private List<Observer> observers;

    public Subject(List<Observer> observers) {
        this.observers = observers;
    }

    public Subject() {
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
            System.out.println();
        }
    }

}