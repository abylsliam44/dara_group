package assignment_3.abylay_pattern_2;


public class RemoveStudentCommand implements Command {
    private Student student;
    private University university;

    public RemoveStudentCommand(Student student, University university) {
        this.student = student;
        this.university = university;
    }

    @Override
    public void execute() {
        university.removeStudent(student);
    }
}

