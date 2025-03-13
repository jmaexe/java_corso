public class Eagle extends Bird {

    public Eagle(String name) {
            super(name);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public void speak() {
    System.out.println(getName() + " says : Screech");
    }

    @Override
    public void fly() {
    System.out.println(getName() + " is flying");
    }

    @Override
    public void sing() {
    System.out.println(getName() + " is singing");
    }

    
}