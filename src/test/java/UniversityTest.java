import org.example.Student;
import org.example.University;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class UniversityTest {
    private Student student1;
    private Student student2;
    private Student student3;
    private University university=new University();
    @BeforeEach
    public void setUp() {
        student1 = new Student("Anna", 21, false);
        student2 = new Student("Ivan", 19, true);
        student3 = new Student("Olga", 20, false);
        university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
    }
    @Test
    public void detAllStudents() {

        List<Student> expected = university.getAllStudents();
        List<Student> actual = new ArrayList<Student>();
        actual.add(student1);
        actual.add(student2);
        actual.add(student3);
        assertEquals(expected, actual);
    }

    @Test
    public void getAllStudentsNotNull() {
        university = new University();
        List<Student> expected = university.getAllStudents();
        assertNotNull(expected);
    }

    @Test
    public void detAllStudentsIsMale() {
        List<Student> expected = university.getAllStudents(true);
        List<Student> actual = new ArrayList<Student>();
        actual.add(student2);
        assertEquals(expected, actual);
    }
}
