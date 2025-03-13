public class Penguin   {
    private Bird bird;

    public Penguin(String name) {
    this.bird = new TruePenguin(name);
    }

    public void speak() {
        bird.speak();
    }

    public void sing() {
        bird.sing();
    }

    
}