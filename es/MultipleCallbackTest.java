public class MultipleCallbackTest {
    public static void main(String[] args) {
        Module m1 = new Module("Module A", 10);
        Module m2 = new Module("Module B", 20);
        Manager manager = new Manager();
        m1.setListener(manager);
        m2.setListener(manager);
        m1.updateValue(100);
    }
}