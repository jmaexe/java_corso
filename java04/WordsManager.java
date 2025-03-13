import java.util.Arrays;

public class WordsManager {
    private String[] words;

    public WordsManager(String[] words) {
        this.words = words;
    }

    public String[] copy() {
        String[] temp = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            temp[i] = words[i];
        }
        return temp;
    }

    public void printWords() {
        System.out.println(Arrays.toString(words));
    }
}
