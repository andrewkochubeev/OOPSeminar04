import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private  List<Teacher> teacherList = new ArrayList<>();

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void createTeacher(Teacher teacher){
        teacherList.add(teacher);
    }
}
