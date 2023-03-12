import org.junit.jupiter.api.Test;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    private String name = "Жуков";
    private String subject = "Физика";

    @Test
    void addStudent() {
        Students students = new Students(3530901, new ArrayList<>(), new HashMap<>());
        Students students2 = new Students(3530901, new ArrayList<>(), new HashMap<>());
        students2.equals(students);
        HashMap<String, Double> marks = new HashMap<>();
        students.addStudent(name, marks);
          assertTrue(students.checkStudent(name));
    }

    @Test
    void deleteStudent() {
        Students students = new Students(3530901, new ArrayList<>(), new HashMap<>());
        HashMap<String, Double> marks = new HashMap<>();
        students.addStudent(name, marks);
        students.deleteStudent(name);
        assertFalse(students.checkStudent(name));
    }

    @Test
    void addSubject() {
        Students students = new Students(3530901, new ArrayList<>(), new HashMap<>());
        HashMap<String, Double> marks = new HashMap<>();
        students.addStudent(name, marks);
        students.addSubject(name, subject, 5.0);
        assertEquals(5.0, students.getMarkForSubject(name, subject));
    }

    @Test
    void deleteSubject() {
        Students students = new Students(3530901, new ArrayList<>(), new HashMap<>());
        HashMap<String, Double> marks = new HashMap<>();
        marks.put(subject, 5.0);
        students.addStudent(name, marks);
        students.deleteSubject(name, subject);
        assertNull(students.getMarkForSubject(name, subject));
    }

    @Test
    void changeGrade() {
        Students students = new Students(3530901, new ArrayList<>(), new HashMap<>());
        HashMap<String, Double> marks = new HashMap<>();
        marks.put(subject, 5.0);
        students.addStudent(name, marks);
        students.changeGrade(name, subject, 3.0);
        assertEquals(3.0, students.getMarkForSubject(name, subject));
    }
}