import java.util.Scanner;

public class TeacherController implements UserController<Teacher> {
    private TeacherService teacherService = new TeacherService();
    public TeacherService getTeacherService() {
        return teacherService;
    }

    private TeacherView teacherView = new TeacherView();

    public void sendOnConsole(){
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }

    public void change(Teacher teacher) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что следует изменить?(1 - Имя, 2 - Фамилия, 3 - Отчество):");
        int n = Integer.parseInt(scanner.nextLine());
        switch (n) {
            case 1:
                System.out.print("Введите новое имя: ");
                teacher.setFirstName(scanner.nextLine());
                break;
            case 2:
                System.out.print("Введите новую фамилию: ");
                teacher.setLastName(scanner.nextLine());
                break;
            case 3:
                System.out.print("Введите новое отчество: ");
                teacher.setSecondName(scanner.nextLine());
                break;

            default:
                System.out.println("Введен некорректный номер!");
                break;
        }
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(firstName);
        teacher.setSecondName(secondName);
        teacher.setLastName(lastName);
        teacherService.createTeacher(teacher);
    }

}
