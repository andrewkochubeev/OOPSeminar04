import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> studentList) {
        System.out.println("Список студентов по id: ");
        for (Student student : studentList) {
            System.out.println(student.getStudentId());
        }
    }
    
}
