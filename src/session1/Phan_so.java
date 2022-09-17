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
        System.out.println(getA()+"/"+getB());
    }

    public void Rutgonphanso(){
      int ucln = 1;
      for (int i = Math.min(Math.abs(a),Math.abs(b)); i >1;i--){
          if (a%i==0&&b%i==0){
              ucln = i;
              break;
          }
      }
      setA(a/ucln);
      setB(b/ucln);

    }
    public void Ngichdaophanso(){
        int tmp = a;
        a = b;
        b = tmp;
    }
    public Phan_so add(Phan_so f){
        Phan_so tong = new Phan_so();
        tong.a = this.a * f.b + this.b * f.a;
        tong.b = this.b * f.b;
        //tong.Rutgonphanso();
        return tong;
    }

}
