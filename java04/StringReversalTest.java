public class StringReversalTest {
    public static void main(String[] args) {
        StringManager manipulator = new StringManager("Hello, World!");
        String reversed = manipulator.reverse();
        System.out.println(reversed);
    }
}
