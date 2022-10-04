package student_assignment;

public class Students {
    String name;
    String email;
    int mark;

    public Students(String name, String email, int mark) {
        this.name = name;
        this.email = email;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
