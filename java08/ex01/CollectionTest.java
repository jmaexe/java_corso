public class CollectionTest {

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        Student s1 = new Student(2);

        s1.enrollCourse("Math");
        s1.enrollCourse("Biology");

        s1.joinClub("Chess Club");
        s1.joinClub("Running Club");

        Student s2 = new Student(2);
        Student s3 = new Student(3);
        sm.addStudent(s1);
        System.out.println(sm.getStudent(2));
    }
}