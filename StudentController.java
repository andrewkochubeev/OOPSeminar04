import java.util.List;

public class StudentController implements UserController<Student> {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private StudentView studentView = new StudentView();
    public void removeStudentByFIO(String lastName, String secondName, String firstName) {
        studentGroupService.removeStudentByFIO(lastName, secondName, firstName);
    }

    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO() {
        return getSortedStudentByFIO();
    }

    public void sendOnConsole(){
        studentView.sendOnConsole(studentGroupService.getStudentGroup().getStudentsList());
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setSecondName(secondName);
        student.setLastName(lastName);
        studentGroupService.createStudent(student);
    }
}
