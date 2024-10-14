package assignment_3.abylay_pattern_2;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println("Enrolled student: " + student.getName());
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println("Removed student: " + student.getName());
    }

    public void displayStudents() {
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
