package assignment4_phone;

public class Main {
    public static void main(String[]agrs){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Dũng","12321312");
        pb.insertPhone("Nam","12321313");
        pb.insertPhone("Tuấn","999999999");
        pb.insertPhone("hoàng","12321312");
        System.out.println(pb.PhoneList.size());
        pb.updatePhone("Tuấn","999999999","55555555555555555555555");

        System.out.println("tìm kiếm là: ");
        PhoneNumber p = pb.searchPhone("Nam");
            if (p!=null){
                System.out.println(p.getName());
            }else {
                System.out.println("not found");
            }
        System.out.println("sắp xếp là: ");
        pb.sort();
        for (PhoneNumber pn:pb.PhoneList) {
            System.out.println(pn.getName());
        }
    }
}
