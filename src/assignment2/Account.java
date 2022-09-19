package assignment2;

public class Account {
    public String id;
    public String name;
    public int balance;
    public Account(){// hàm khởi tạo không tham số

    }

    public Account(String id, String name,int balance) { // hàm khởi tạo có tham số
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int n){
        if (n < 0) {
           System.out.println("Số tiền nạp vào phải là dương ");
        }else
        balance = balance + n;
    }
    public void debit(int k){
        if (k < balance){
            balance = balance - k;
            System.out.println(getBalance());

        }else
            System.out.println("Số tiền thanh toán phải nhỏ hơn số tiền trong tài khoản");
    }
}

