public abstract class Feline extends Animal{

    public Feline(String name, int age) {
            super(name, age);
        }
    
        @Override
    public void speak() {
    System.out.println("Meow my name is " + getName() + " and i am " + getAge() + " years old");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    
}