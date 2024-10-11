
//Command

package assignment_3.abylay_pattern_2;

public class MainUniversity {
    public static void main(String[] args) {
        University university = new University();
        UniversityQueue queue = new UniversityQueue();

        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);


        Command enrollStudent1 = new EnrollStudentCommand(student1, university);
        Command enrollStudent2 = new EnrollStudentCommand(student2, university);
        

        Command updateStudent1 = new UpdateStudentCommand(student1, "Alicia");


        Command removeStudent2 = new RemoveStudentCommand(student2, university);

        
        queue.addCommand(enrollStudent1);
        queue.addCommand(enrollStudent2);
        queue.addCommand(updateStudent1);
        queue.addCommand(removeStudent2);


        queue.processCommands();

        
        university.displayStudents();
    }
}

