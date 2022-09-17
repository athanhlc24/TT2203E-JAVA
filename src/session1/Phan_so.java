package session1;

public class Phan_so {
    int a;
    int b;

    public Phan_so() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void In_phan_so(){
        System.out.println(a+"/"+b);
    }
    public int UCLN(int a, int b){
        while (a!=b){
            if (a>b){
                a -= b;
            }else {
                b -= a;
            }
        }
        return a;
    }
    public void Rutgonphanso(){
        int i = UCLN(this.getA(), this.getB());
        this.setA(this.getA()/i);
        this.setB(this.getB()/i);

    }
    public void Ngichdaophanso(){
        System.out.println(b+"/"+a);
    }
    public void Congphanso(){
        int ts = this.getA() * this.getB() + this.getA() * this.getB();
        int ms = this.getB()* this.getB();
        System.out.println(ts+"/"+ms);
    }
    public void  Truphanso(){
        int ts = this.getA() * this.getB() - this.getA() * this.getB();
        int ms = this.getB()* this.getB();
        System.out.println(ts+"/"+ms);
    }
    public void  Nhanphanso(){
        int ts = this.getA() *  this.getA();
        int ms = this.getB() * this.getB();
        System.out.println(ts+"/"+ms);
    }
}
