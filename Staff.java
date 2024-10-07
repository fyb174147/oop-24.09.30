public class Staff extends Person {
    private String position;

    public Staff() {
        super();
        position = "";
    }

    public Staff(String name, int yearOfBirth, String position) {
        super(name, yearOfBirth);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
