package fix_assignment_danh_ba_dien_thoai;
public class PhoneNumbers {
    String name;
    String phone;

    public PhoneNumbers(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return getName()+"_"+getPhone()+"\n";
    }
}
