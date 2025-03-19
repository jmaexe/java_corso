package models;

public class Firewall extends Host {
    private int numberOfAttacks;
    private int numberOfResolvedAttacks;

    public Firewall(String name, int numberOfAttacks, int numberOfResolvedAttacks) {
        super(name, HostType.FIREWALL);
        this.numberOfAttacks = numberOfAttacks;
        this.numberOfResolvedAttacks = numberOfResolvedAttacks;
    }

    public Firewall(String name, int numberOfAttacks) {
        super(name, HostType.FIREWALL);
        this.numberOfAttacks = numberOfAttacks;
    }

    public void setNumberOfAttacks(int numberOfAttacks) {
        this.numberOfAttacks = numberOfAttacks;
        issueDetected();
    }

    public void setNumberOfResolvedAttacks(int numberOfResolvedAttacks) {
        this.numberOfResolvedAttacks = numberOfResolvedAttacks;
        issueDetected();
    }

    public int getNumberOfAttacks() {
        return numberOfAttacks;
    }

    public int getNumberOfResolvedAttacks() {
        return numberOfResolvedAttacks;
    }

    @Override
    public String toString() {
        return super.toString() + ", number of attacks: " + numberOfAttacks + ", number of resolved attacks: "
                + numberOfResolvedAttacks;
    }

}
