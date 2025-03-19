package models;

public abstract class Host extends NetworkComponent {
    protected String name;
    private HostType hostType;

    public Host(String name) {
        this.name = name;
    }

    public Host(String name, HostType hostType) {
        this.name = name;
        this.hostType = hostType;
    }

    public void setHostType(HostType hostType) {
        this.hostType = hostType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HostType getHostType() {
        return hostType;
    }

    public String getName() {
        return name;
    }

    public void issueDetected() {
        System.out.println("Issue detected in " + hostType + "! ");
        notifyObservers();

    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + ": name : " + name + ", host type: " + hostType;
    }

}