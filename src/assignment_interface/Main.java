package assignment_interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        News n = new News(1,"tieu de","30/08","thanh","abc");
        n.Display();

        n.RateList[0]=1;
        n.RateList[1]=2;
        n.RateList[2]=3;
        n.Calculate();


    }
}
