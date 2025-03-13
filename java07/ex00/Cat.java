public class Cat extends Feline{

    public Cat(String name, int age) {
            super(name, age);
            //TODO Auto-generated constructor stub
        }
    

    @Override
    public void move() {
        System.out.println(getName()+" is running ");
    }

    
}