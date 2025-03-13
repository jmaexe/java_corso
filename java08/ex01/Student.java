import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {

    private int id;
    private List<String> courses;
    private Set<String> clubs;

    public Student(int id) {
        this.id = id;
        this.courses = new ArrayList<String>();
        this.clubs = new HashSet<String>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void enrollCourse(String name) {
        courses.add(name);

    }

    public void joinClub(String name) {
        clubs.add(name);
    }

    @Override
    public String toString() {
        return " Student : " + id + ", courses : " + courses.toString() + ", clubs :" + clubs.toString();
    }

}