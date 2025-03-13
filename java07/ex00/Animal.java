
public abstract class Animal {


    private String name;
    private int age;

    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void speak();
    public abstract void move();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    
}