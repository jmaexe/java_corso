public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void speak();
    public abstract void fly();
    public  abstract void sing();

    
}