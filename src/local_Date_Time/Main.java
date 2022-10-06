package local_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[]args){
        LocalDate d = LocalDate.now();
        //LocalDateTime ddddd = LocalDateTime.now();
        System.out.println(d);
        //System.out.println(ddddd);
        LocalDate d1 = d.plusDays(5);
        System.out.println(d1);
        LocalDate d2 = d.plusYears(5);
        System.out.println(d2);
        LocalDate d3 = d.minusYears(10);
        System.out.println(d3);


        LocalDate t = LocalDate.of(2022,10,15);
        LocalDate t1 = t.plusYears(1);
        System.out.println(t1);



        LocalDate y = LocalDate.parse("2022-10-09");
        LocalDate y2 = LocalDate.parse("2022-02-28");
        System.out.println(y2);

        long b = ChronoUnit.DAYS.between(t,t1);// khoảng cách giữa 2 khoảng thời gian là bao nhiêu ngày
        System.out.println(b);

        System.out.println(y.getDayOfYear());// ngày này là ngày bao nhiêu trong năm


        LocalDateTime l = LocalDateTime.now();

        LocalDateTime l2 = l.plusHours(1);
        System.out.println(l2);

        LocalDateTime lt = LocalDateTime.of(2022,10,6,18,30,0);
        LocalDateTime lt1 = LocalDateTime.parse("2022-10-06T18:30:20");
        System.out.println(lt);
        System.out.println(lt1);



    }
}
