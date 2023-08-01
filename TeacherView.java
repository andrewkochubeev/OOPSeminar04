import java.util.List;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        System.out.println("Список преподавателей:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
    
}
