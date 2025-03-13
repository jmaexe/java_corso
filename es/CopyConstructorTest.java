public class CopyConstructorTest {
    public static void main(String[] args) {
        Book original = new Book("<", "fea");

        Book copy = new Book(original);
        original.display();

        copy.display();
    }
}
