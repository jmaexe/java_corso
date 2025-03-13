import java.util.Arrays;

public class ArrayTest {
    private static final Integer[] intArray = { 1, 2, 3 };

    private static final String[] strArray = { "one", "two", "three", };

    public static void main(String[] args) {
        modifyArray();
        printArray(intArray);
        printArray(strArray);
    }

    public static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void modifyArray() {
        intArray[1] = 99;
        strArray[1] = "ninetynine";
    }
}