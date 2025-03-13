public class Manager extends Employee {

    private String department;

    public Manager(String name, int age, int employeeId, String department) {
        super(name, age, employeeId);
        this.department = department;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", Department: " + department;
    }

}