package models;

import java.util.ArrayList;
import java.util.List;

public abstract class NetworkObservable {

    protected List<MonitoringSystemObserver> observers;

    public NetworkObservable(List<MonitoringSystemObserver> observers) {
        this.observers = observers;
    }

    public NetworkObservable() {
        this.observers = new ArrayList<MonitoringSystemObserver>();
    }

    public void addObserver(MonitoringSystemObserver monitoringSystemObserver) {
        this.observers.add(monitoringSystemObserver);
    }

    public void removeObserver(MonitoringSystemObserver monitoringSystemObserver) {
        this.observers.remove(monitoringSystemObserver);
    }

    public abstract void notifyObservers();

}