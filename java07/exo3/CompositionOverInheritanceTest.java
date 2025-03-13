public class CompositionOverInheritanceTest {

    public static void main(String[] args) {
        Bird eddie = new Eagle("Eddie");
        eddie.speak();
        eddie.fly();
        eddie.sing();

        Bird penny = new TruePenguin("Penny");
        penny.speak();
        penny.fly();
        penny.sing();

        Penguin twinkle = new Penguin("Twinkle");
        twinkle.speak();
        twinkle.sing();
    }
}