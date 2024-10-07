public class Teacher extends Person{
    private String department;

    public Teacher(){
        super();
        this.department = "";
    }

    public Teacher(String name, int yearOfBirth, String department){
        super(name, yearOfBirth);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
