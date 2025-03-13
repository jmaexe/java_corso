public class Dog extends Animal {

    public Dog(String name, int age) {
            super(name, age);
        }
    
        @Override
    public void speak() {
        System.out.println("Woof my name is " + getName() + " and i am " + getAge() + " years old");
    }

    @Override
    public void move() {
    System.out.println("Woof "+getName()+" am running");
    }


    
}