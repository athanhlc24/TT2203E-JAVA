package session3_ke_thua;

public class Dog extends Animal{
    public int year;
    public Dog(){

    }
    public Dog(int id, String name, int year) {
        super(id, name);
        this.year = year;
    }

    public void eat(){
        super.run();
        System.out.println("Eat.............................");
    }
    public void run(){
        super.run();
        System.out.println("Dog run................");
    }
}
