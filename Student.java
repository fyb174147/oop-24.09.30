public class Student extends Person {
    private String studentCode;

    public Student() {
        super();
        studentCode = "";
    }

    public Student(String name, int yearOfBirth, String studentCode) {
        super(name, yearOfBirth);
        this.studentCode = studentCode;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
