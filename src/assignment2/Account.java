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

    public boolean credit(int n){
        if (n <= 0) return false ;
            balance += n;
         return true;
    }
    public boolean debit(int n){
        if (n <= 0 || n > balance) return false;
        balance -= n;
        return true;
    }
    public boolean tranfer(Account account, int n){
        if (n <= 0 || n > balance) return false;
        account.balance += n;
        balance -= n;
        return true;

    }

}

