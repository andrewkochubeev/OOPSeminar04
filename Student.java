public class Student extends User implements Comparable<Student> {
    private Integer studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public int compareTo(Student s) {
        return this.studentId.compareTo(s.studentId);
    }

}
