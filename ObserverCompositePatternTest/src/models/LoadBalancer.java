package models;

public class LoadBalancer extends Host {

    private int numberOfReplication;
    private int numberOfReplicationRequest;

    public LoadBalancer(String name, int numberOfReplication, int numberOfReplicationRequest) {
        super(name, HostType.LOADBALANCER);
        this.numberOfReplication = numberOfReplication;
        this.numberOfReplicationRequest = numberOfReplicationRequest;
    }

    public LoadBalancer(String name, int numberOfReplication) {
        super(name, HostType.LOADBALANCER);
        this.numberOfReplication = numberOfReplication;
    }

    public void setNumberOfReplication(int numberOfReplication) {
        this.numberOfReplication = numberOfReplication;
    }

    public void setNumberOfReplicationRequest(int numberOfReplicationRequest) {
        this.numberOfReplicationRequest = numberOfReplicationRequest;
    }

    public int getNumberOfReplication() {
        return numberOfReplication;
    }

    public int getNumberOfReplicationRequest() {
        return numberOfReplicationRequest;
    }

    @Override
    public String toString() {
        return super.toString() + ", number of replication: " + numberOfReplication
                + ", number of replication request: " + numberOfReplicationRequest;
    }
}