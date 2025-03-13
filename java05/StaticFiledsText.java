public class StaticFiledsText {

    public static void main(String[] args) {
        InstanceCounter instance;
        instance = new InstanceCounter();
        instance = new InstanceCounter();
        instance = new InstanceCounter();
        System.out.println("Instance count : " + InstanceCounter.n_instances);

    }
}