import java.util.Arrays;

public class StringCopyTest {
    public static void main(String[] args) {
        String[] fruits = { "apple", "banana", "cherry" };
        WordsManager manager = new WordsManager(fruits);
        String[] fruitsCopy = manager.copy();
        fruitsCopy[0] = "avocado";
        System.out.println(Arrays.toString(fruitsCopy));
        manager.printWords();
    }
}
