import java.util.HashMap;
import java.util.Map;

public class StudentManagement {

    private Map<Integer, Student> students = new HashMap<Integer, Student>();

    public StudentManagement() {
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student getStudent(int id) {
        return students.get(id);
    }
}