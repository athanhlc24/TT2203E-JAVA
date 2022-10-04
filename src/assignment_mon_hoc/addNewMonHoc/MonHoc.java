package assignment_mon_hoc.addNewMonHoc;

public class MonHoc {
    String name;
    String code;
    String hour;

    public MonHoc(String name, String code, String hour) {
        this.name = name;
        this.code = code;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
    public String toString(){
        return getName()+"---"+getCode()+"---"+getHour();
    }
}
