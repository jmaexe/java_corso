import java.util.ArrayList;
import java.util.List;

public class NumberList {
    private List<Integer> numbers = new ArrayList<Integer>();

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public Integer sumNumbers() {
        Integer n = 0;
        for (Integer number : numbers) {
            n += number;
        }
        return n;
    }

    public static void main(String[] args) {
        NumberList nl = new NumberList();
        nl.addNumber(5);
        nl.addNumber(10);
        nl.addNumber(20);
        System.out.println(nl.sumNumbers());
    }
}
