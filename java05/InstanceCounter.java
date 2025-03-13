public class InstanceCounter {
    public static int n_instances = 0;

    public InstanceCounter() {
        n_instances++;
        if (n_instances == 3)
            System.out.println("Instances" + n_instances);
    }
}
