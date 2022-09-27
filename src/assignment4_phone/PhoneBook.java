package assignment4_phone;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList;
    public PhoneBook(){
        PhoneList = new ArrayList<>();
    }
    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p :PhoneList) {
            if (p.getName().equals(name)){
                if (p.getPhone().contains(phone)){
                    System.out.println("Liên lạc đã có");
                    return;
                }
                // có tên nhưngg chưa có số
                p.getPhone().add(phone);
                System.out.println("Đã thêm"+phone+"vào liên lạc có sẵn");
                return;
            }
        }
        // nếu mà k có
        PhoneNumber pn = new PhoneNumber(name,phone);
        PhoneList.add(pn);
        System.out.println("Đã thêm"+name+"vào liên lạc");
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p:PhoneList) {
            if (p.getName().equals(name)){
                PhoneList.remove(p);
            }
        }
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        for (PhoneNumber p:PhoneList) {
            if (p.getName().equals(name)){
                p.getPhone().remove(oldPhone);
                p.getPhone().add(newPhone);
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for (PhoneNumber p:PhoneList) {
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void sort() {

    }
}
