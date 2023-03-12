import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Students {

    private Integer id;
    private ArrayList<String> studentList;
    private HashMap<String, HashMap<String, Double>> journal;

    public Students(Integer id, ArrayList<String> studentList, HashMap<String, HashMap<String, Double>> journal){
        this.id = id;
        this.studentList = studentList;
        this.journal = journal;
    }

    public ArrayList<String> getStudentList() {
        return studentList;
    }

    public HashMap<String, HashMap<String, Double>> getJournal() {
        return journal;
    }

    public HashMap<String, Double> getMarks(String name) {
        return journal.get(name);
    }

    public Double getMarkForSubject(String name, String subject) {
        return journal.get(name).get(subject);
    }

    public Boolean checkStudent(String name) {
        return studentList.contains(name);
    }

    public void addStudent(String newStudent, HashMap<String, Double> subjectsWithGrades){
        this.studentList.add(newStudent);
        this.journal.put(newStudent, subjectsWithGrades);
    }

    public void deleteStudent(String newStudent) {
        this.studentList.remove(newStudent);
        this.journal.remove(newStudent);
    }

    public void addSubject(String student, String newSubject, Double newGrade){
        journal.get(student).put(newSubject, newGrade);
    }

    public void deleteSubject(String student, String newSubject){
        journal.get(student).remove(newSubject);
    }

    public void changeGrade(String student, String subject, Double newGrade){
        journal.get(student).put(subject, newGrade);
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", students=" + studentList +
                ", journal=" + journal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id.equals(students.id) && studentList.equals(students.studentList) && journal.equals(students.journal);
    }
}

