package models;

import java.util.List;

public abstract class NetworkComponent extends NetworkObservable {

    public NetworkComponent() {
        super();
    }

    public NetworkComponent(List<MonitoringSystemObserver> observers) {
        super(observers);
    }

    @Override
    public void notifyObservers() {
        for (MonitoringSystemObserver observers : observers) {
            observers.update(this);
        }
    }

}
