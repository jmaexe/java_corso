public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }
    public abstract double calculateSalary();


    public String getName() {
        return name;
    }

    
    
}