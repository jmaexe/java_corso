package presentation;

import java.util.Arrays;

import models.Firewall;
import models.LoadBalancer;
import models.NetworkController;
import models.Subnet;

public class App {
    public static void main(String[] args) throws Exception {
        LoadBalancer loadBalancer = new LoadBalancer("bo", 20, 20);
        Firewall firewall = new Firewall("bobo", 50, 20);

        Subnet subnetChild = new Subnet("subnet child", Arrays.asList(
                new Firewall("bobobobobo", 0),
                new Firewall("bababa", 0)));
        Subnet subnetRoot = new Subnet("subnetRoot", Arrays.asList(
                firewall,
                loadBalancer, subnetChild));
        // firewall.addObserver(new NetworkController());
        // firewall.issueDetected();
        // System.out.println();
        // firewall.setNumberOfResolvedAttacks(50);

        // subnetRoot.addObserver(new NetworkController());
        // subnetRoot.notifyObservers();
        // subnetRoot.addNetworkComponent(subnetChild);
        LoadBalancer loadBalancer2 = new LoadBalancer("b", 2);
        subnetRoot.addNetworkComponent(loadBalancer2);
        // subnetRoot.addNetworkComponent(new Firewall("a", 2));

        // System.out.println(subnetRoot);
    }
}
