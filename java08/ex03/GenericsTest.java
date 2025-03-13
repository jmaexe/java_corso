public class GenericsTest {

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<String, Integer>("Age", 21);

        System.out.println("Pair : " + p);

    }
}