package models;

import java.util.ArrayList;
import java.util.List;

public class Subnet extends NetworkComponent {
    private String name;
    private List<NetworkComponent> networkComponents;

    public Subnet(List<MonitoringSystemObserver> observers, List<NetworkComponent> networkComponents) {
        super(observers);
        this.networkComponents = networkComponents;
    }

    public Subnet(String name, List<NetworkComponent> networkComponents) {
        super();
        this.name = name;
        this.networkComponents = networkComponents;
    }

    public Subnet(String name, ArrayList<MonitoringSystemObserver> observers) {
        super(observers);
        this.name = name;
        this.networkComponents = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNetworkComponent(NetworkComponent networkComponent) {
        this.networkComponents.add(networkComponent);
        notifyObservers();
    }

    public void removeNetworkComponent(NetworkComponent networkComponent) {
        this.networkComponents.remove(networkComponent);
        notifyObservers();
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + " " + name + ":\nnetwork components: " + networkComponents;
    }

}