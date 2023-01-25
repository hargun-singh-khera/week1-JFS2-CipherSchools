package ConditionalsAndLoops;

import java.util.Scanner;

public class BurrpCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How long is your burp?");
        int length=sc.nextInt();
        String mssg="";
        for (int i=1;i<=length;i++) {
            mssg+="r";
        }
        System.out.println("Bu"+mssg+"p");
    }
}
