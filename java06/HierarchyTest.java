public class HierarchyTest {

    public static void main(String[] args) {
        Person alice = new Person("Alice", 40);
        System.out.println(alice);
        Employee bob = new Employee("Bob", 52, 1001);
        System.out.println(bob);
        Manager charlie = new Manager("Charlie", 35, 1001, "Sales");

        System.out.println(charlie);
    }
}