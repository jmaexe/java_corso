public class FinalizationTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(new Item("A"));
        stack.push(new Item("B"));
        stack.push(new Item("C"));

        stack.unsafePop();
        stack.pop();

        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }
}
