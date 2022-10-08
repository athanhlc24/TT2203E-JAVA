package baithi.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        System.out.println("Please enter the balance USD: ");
        b.setBalance(sc.nextDouble());
        System.out.println("Please enter the rate %: ");
        b.setRate(sc.nextDouble());
        System.out.println( "interest rate USD: "+b.calculateInterest()+ "USD");
    }
}
