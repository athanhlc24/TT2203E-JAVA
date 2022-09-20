package assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
//        Account ac = new Account();
//        System.out.println("Tong so du la: ");
//        ac.setBalance(8);
//        ac.credit(30);
//        System.out.println(ac.getBalance());
//        System.out.println("Số dư bị trừ sau khi thanh toán là: ");
//        ac.debit(60);
        Account myAccount = new Account("1","tHANH",1000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn rút: ");
        int x = sc.nextInt();
        if (myAccount.debit(x)){
            System.out.println("Rút tiền thành công và số dư bị trừ: "+x);
        }else {
            System.out.println("Rút tiền không thành công do số dư k đủ hoặc do nhập sai số tiền");
        }

        Account nam = new Account("2","nam",1000);
        System.out.println("Nhập vào số tiền cần chuyển: ");
        int y = sc.nextInt();
            if (myAccount.tranfer(nam,y)){
                System.out.println("Chuyển khoản thành công sang tài khoản "+nam.getName());
            }else {
                System.out.println("Chuyển khoản thất bại. Vui lòng thực hiện lại");
            }



    }
}
