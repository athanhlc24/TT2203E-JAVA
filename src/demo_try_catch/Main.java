package demo_try_catch;

public class Main {
    public static void main(String[]args){
        try {
            int x = 10;
            int y = 0;
            if (y==0){
                throw new NullPointerException();
            }
            System.out.println(x+":"+y+"=");
            int z = x/y;
            System.out.println(z);

        }catch (NullPointerException ab){
            // chưa cấp ô nhớ cho nó thì vào đây
            System.out.println("Null...................");
        }catch (ArithmeticException aa){
            // ngoại lệ toán học
            System.out.println("Tính toán quá ngu rồi xem lại đi thằng chó ");
        }
        catch (Exception e){
            System.out.println("Loi roi xem lai di");
        }finally {
            // lúc nào cũng chạy qua đây để thông báo hay làm gì đó có try-hay catch cx đều đi vào finally vì nó như kiểu hàm tổng kết

        }

    }
}
