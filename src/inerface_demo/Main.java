package inerface_demo;

import abstract_truu_tuong_seasion4.Human;

public class Main {
    public static void main(String[]args){
        // interface và abstract k thể tạo 1 đối tượng
        StudentInterface s = new StudentInterface() {
            @Override
            public void run() {

            }

            @Override
            public void eat() {

            }

            @Override
            public void learn() {

            }
        };
        Human h = new Human() {
            @Override
            public void eat() {
                System.out.println("Eat..........");
            }
        };
        h.eat();

        Human h2 = new Human() {// đây là lớp ẩn danh được tạo từ 1 đối tượng

            @Override
            public void eat() {
                System.out.println("Eating...........");
            }
        };

        FPTStudentInterface f = new FPTStudentInterface() {
            @Override
            public void coding(int y) {

            }
        };

        h2.eat();
        // lambda expression viết interface cho gọn hơn
        FPTStudentInterface fs = (int y) ->{
        // body của coding function
        };
    }
}
