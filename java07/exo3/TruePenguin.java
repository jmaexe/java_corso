public class TruePenguin extends Bird {

    public TruePenguin(String name) {
            super(name);
        }
    
        @Override
    public void speak() {
    System.out.println(getName() + " says Squawk");
    }

    @Override
    public void fly() {
    System.out.println("Wait Penguins cant fly");
    }

    @Override
    public void sing() {
    System.out.println(getName() + " is singing");
    }

    
}