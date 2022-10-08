package session2;

import session1.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Human h = new Human();
        h.run("a",5);
        h.run("a");
        h.run(5,"a");
        h.run(5);
        h.run();
        Human h2 = new Human("Nguyễn Tuấn Anh");
        System.out.println(h2.name);

        Student s = new Student("Nguyễn Văn An","293482394","8 tôn thất thuyết",29);
        s.girlFriends[0]= "Ngọc Trinh";
        Car C1 = new Car();
        C1.brand = "Honda";
        int [] mark = new int[4];
        mark[0] = 10;
        mark[1] = 20;
        mark[2] = 30;
        mark[3] = 40;
        for (int m:mark) {
            System.out.println(m);
        }
        Student[] students = new Student[10];
        students[0] = new Student("Nguyễn Văn An","293482394","8 tôn thất thuyết",29);
        for (int i = 0; i<students.length;i++){
            students[i] = new Student();
        }
        //sét 10 sinh viên theo độ tuổi từ 20 -> 29
        for (int i= 0; i<students.length;i++){
            students[i].setAge(i+20);
        }

        for (int i= 0; i<students.length;i++){
            System.out.println(students[i].getAge());
        }
        for (Student st: students){
            System.out.println(st.getAge());
        }

    }
}
