package fix_assignment3;

public class Vn extends Khach_hang{
    public String doiTuong;

    public Vn() {
    }

    public Vn(int code, String fullName, String date, int quantity, String doiTuong) {
        super(code, fullName, date, quantity);
        this.doiTuong = doiTuong;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public int thanhTien() {
        if (quantity <50)
            return quantity *1000;
        else if (quantity<100)
            return (quantity - 50)*1200 + 50 *1000;
         else if (quantity<200)
            return (quantity-100)*1500 + 50 *1000;
         else
            return (quantity-200)*2000 + 100*1500 + 50 *1200 + 50 *1000;


    }
}
