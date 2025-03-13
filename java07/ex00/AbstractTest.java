public class AbstractTest {

    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);

        dog.speak();

        dog.move();

        Animal cat = new Cat("Whiskers",2);
        cat.speak();
        cat.move();

        
    }
}