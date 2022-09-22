package fix_assignment3;

public class Main {
    public static void main(String[]args){
        Vn vn = new Vn(1,"a","2022",3,"ca nhan");
        Nn nn = new Nn(2,"ab","2022",3519,"ca nhan");
        System.out.println("Thành tiền của VN: "+vn.thanhTien());
        System.out.println("Thành tiền của Nn: "+nn.thanhTien());

        // upcasting và dowcasting
        Khach_hang kh = (Khach_hang) new Vn(3,"a","2022",100,"ca nhan");
        System.out.println("Thành tiền của VN: "+kh.thanhTien());

        Vn khvn = (Vn) kh;
        System.out.println("Thành tiền của VN: "+khvn.thanhTien());

    }
}
