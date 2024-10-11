package assignment_3.abylay_pattern_2;

public class UpdateStudentCommand implements Command {
    private Student student;
    private String newName;

    public UpdateStudentCommand(Student student, String newName) {
        this.student = student;
        this.newName = newName;
    }

    @Override
    public void execute() {
        student.setName(newName);
        student.displayInfo();
    }
}
