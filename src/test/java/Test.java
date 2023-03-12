import java.util.ArrayList;
import java.util.HashMap;

class Test {
    public static void main(String[] args) {
        Students student = new Students(3530901, new ArrayList<>(), new HashMap<>());

        String name = "Жуков Никита";
        HashMap<String, Double> marks = new HashMap<>();
        marks.put("Математика", 4.0);
        marks.put("Биология", 5.0);
        marks.put("Физика", 2.0);
        marks.put("География", 3.0);
        student.addStudent(name, marks);

        String name2 = "Заворин Илья";
        HashMap<String, Double> marks2 = new HashMap<>();
        marks2.put("Математика", 5.0);
        marks2.put("География", 2.0);
        marks2.put("Физика", 3.0);
        marks2.put("Программирование", 4.0);
        student.addStudent(name2, marks2);

        System.out.println(student);

        student.addSubject(name, "Программирование", 5.0);
        student.addSubject(name, "Физика", 3.0);
        System.out.println(student);

        student.deleteSubject(name, "Биология");
        student.changeGrade(name, "География", 5.0);
        System.out.println(student);

        student.deleteStudent(name);
        System.out.println(student);
    }
}
