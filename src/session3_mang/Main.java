package session3_mang;
import assignment2.Account;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        int [] intarráy = new int[5]; // mảng giới hạn kích thước
        ArrayList arrayList = new ArrayList();// mảng thêm được dữ liệu và thêm kích thước và thứ tự bị lung tung
        arrayList.add(10);
        arrayList.add("Hello world");
        arrayList.add(new Account());
        arrayList.remove(0);

        ArrayList<String> strArray = new ArrayList<>();// đầy đủ chỉ thêm cái mình muốn như String, integer..
        strArray.add("hế lồ");
        strArray.add("aaa");
        strArray.add("bbb");
        for (String s: strArray){
            System.out.println(s);
        }
        for (int i = 0 ; i<strArray.size();i++){
            System.out.println(strArray.get(i));
        }

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(11);

        ArrayList<Double> dArr = new ArrayList<>();
        dArr.add(11.11);
    }
}
