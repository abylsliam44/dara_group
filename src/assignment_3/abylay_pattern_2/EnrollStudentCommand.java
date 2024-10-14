package assignment_3.abylay_pattern_2;

public class EnrollStudentCommand implements Command {
    private Student student;
    private University university;

    public EnrollStudentCommand(Student student, University university) {
        this.student = student;
        this.university = university;
    }

    @Override
    public void execute() {
        university.enrollStudent(student);
    }
}

