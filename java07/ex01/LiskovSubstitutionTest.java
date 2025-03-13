public class LiskovSubstitutionTest {

    public static void main(String[] args) {
        Employee [] employees = {
            new FullTimeEmployee("Alice", 3000),
            new PartTimeEmployee("Bob",20,80)
        };


        for(Employee e : employees) {
            System.out.println(e.getName() + "'s salary : " + e.calculateSalary());
        }
    }
}