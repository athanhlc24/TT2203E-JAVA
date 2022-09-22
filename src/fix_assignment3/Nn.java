package fix_assignment3;

public class Nn extends Khach_hang{
    public String quocTich;

    public Nn() {
    }

    public Nn(int code, String fullName, String date, int quantity, String quocTich) {
        super(code, fullName, date, quantity);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public int thanhTien() {
        return super.thanhTien();
    }
}
