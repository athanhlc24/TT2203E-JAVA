package session1;

import java.util.Scanner;

public class demo_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("hello worl");
        int x = 10;
        System.out.println("x = "+x);
        String str = "hello world";
        if(x>10){
            System.out.println(str);
        }else {
            System.out.println("not found");
        }
        for (int i =0; i<10;i++){
            System.out.println("i= "+i);
        }

        Car c = new Car();
        Car c2 = new Car();
        c.brand = "TOYOTA";
        System.out.println("c = "+c.brand);
        System.out.println("c = "+c.year);
        System.out.println("c2 = "+c2.brand);
        System.out.println("c2 = "+c2.year);
        Car.color = "red";// sattic là biến toàn cục có ô nhớ riêng k liên quan đến ctrinh` cho cả project
        System.out.println(Car.color);
        c.showInfo();
        c2.showInfo();
        Bike b = new Bike();
        b.run();
        System.out.println(Car.color);


        // tính chu vi và diện tích tam giác
        Tamgiac tg = new Tamgiac();
        tg.setCanh1(4);
        tg.setCanh2(5);
        tg.setCanh3(6);
        System.out.println("Chu vi = "+tg.chuVi());
        System.out.println("Dien tich = "+tg.dienTich());

        // in phân số
        Phan_so ps = new Phan_so();
        System.out.println("Hãy nhập vào tử số và mẫu số: ");
        ps.setA(sc.nextInt());
        ps.setB(sc.nextInt());
        Phan_so ps2 = new Phan_so();
        ps2.setA(9);
        ps2.setB(15);
        System.out.println("Phan so la: ");
        ps.In_phan_so();
        // rút gọn phân số
        ps.Rutgonphanso();
        System.out.println("Rut gon phan so la: ");
        System.out.println(ps.getA()+"/"+ps.getB());
        //  nghịch đảo phân số
        System.out.println("Ngich dao phan so la: ");
        ps.Ngichdaophanso();
        System.out.println(ps.getA()+"/"+ps.getB());
        // ADD
        System.out.println("ADD phan so la: ");
        Phan_so tong = ps.add(ps2);
        tong.Rutgonphanso();
        tong.In_phan_so();

    }
}
