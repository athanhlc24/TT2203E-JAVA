package session3_ke_thua;

public class Main {
    public static void main(String[]args){
        Animal a = new Animal();
        a.run();
        Dog d = new Dog();
        d.run();
        d.eat();
        BullDogs bd = new BullDogs();
        bd.eat();
        bd.run();
        bd.runFast();
    }
}
