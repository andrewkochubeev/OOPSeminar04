/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        TeacherController tc = new TeacherController();
        tc.create("Иван", "Иванович", "Иванов");
        tc.create("Петр", "Петрович", "Петров");
        tc.sendOnConsole();        
        tc.change(tc.getTeacherService().getTeacherList().get(0));
        tc.sendOnConsole(); 
    }
}