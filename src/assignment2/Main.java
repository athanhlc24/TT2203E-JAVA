package assignment2;
public class Main {
    public static void main(String[]args){
        Account ac = new Account();
        System.out.println("Tong so du la: ");
        ac.setBalance(8);
        ac.credit(30);
        System.out.println(ac.getBalance());

        System.out.println("Số dư bị trừ sau khi thanh toán là: ");
        ac.debit(60);






    }
}
