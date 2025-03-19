package models;

public class NetworkController implements MonitoringSystemObserver {

    @Override
    public void update(NetworkComponent networkComponent) {
        System.out.println("Network controller received updates: " + networkComponent);
    }

}