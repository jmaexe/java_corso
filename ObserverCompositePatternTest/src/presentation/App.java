package presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.Firewall;
import models.LoadBalancer;
import models.NetworkComponent;
import models.NetworkController;
import models.NetworkObservable;
import models.Subnet;

public class App {
    public static void main(String[] args) throws Exception {
        LoadBalancer loadBalancer = new LoadBalancer("bo", 20, 20);
        Firewall firewall = new Firewall("bobo", 50, 20);

        List<NetworkComponent> lista = new ArrayList<>();
        lista.add(new Firewall("bobobobobo", 0));
        lista.add(new Firewall("bababa", 0));

        Subnet subnetChild = new Subnet("subnet child", lista);

        List<NetworkComponent> lista2 = new ArrayList<>();
        lista2.add(firewall);
        lista2.add(loadBalancer);
        lista2.add(subnetChild);
        Subnet subnetRoot = new Subnet("subnetRoot", lista2);
        // firewall.addObserver(new NetworkController());
        // firewall.issueDetected();
        // System.out.println();
        // firewall.setNumberOfResolvedAttacks(50);

        subnetRoot.addObserver(new NetworkController());
        subnetRoot.addNetworkComponent(subnetChild);
        // subnetRoot.addNetworkComponent(new Firewall("a", 2));

        // System.out.println(subnetRoot);
    }
}
