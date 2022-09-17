package session1;

public class Car {
    String brand = "BMW";
    int year = 2002;

    static String color;// sattic là biến toàn cục có ô nhớ riêng k liên quan đến ctrinh` cho cả project
    // phương thức method
    public void showInfo(){
        System.out.println(brand);
        System.out.println(year);
    }
}
