package session3_ke_thua;

public class Animal {
    public int id;
    public String name;
    public Animal(){

    }
    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void run(){
        System.out.println("Run...");
    }
}
