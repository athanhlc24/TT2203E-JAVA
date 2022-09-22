package fix_assignment3;

public class Khach_hang {
    public int code;
    public String fullName;
    public String date;
    public int quantity;

    public Khach_hang() {
    }

    public Khach_hang(int code, String fullName, String date, int quantity) {
        this.code = code;
        this.fullName = fullName;
        this.date = date;
        this.quantity = quantity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int thanhTien(){
        return quantity * 2000;
    }
}
