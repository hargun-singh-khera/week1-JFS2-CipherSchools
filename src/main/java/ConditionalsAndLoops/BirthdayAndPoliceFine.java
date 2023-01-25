package ConditionalsAndLoops;

import java.util.Scanner;

public class BirthdayAndPoliceFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your speed: ");
        int speed=sc.nextInt();

        System.out.println("Is Today your birthday?");
        boolean isBirthday=sc.nextBoolean();

        if (isBirthday==true) {
            speed-=5;
        }

        if (speed>80) {
            System.out.println("High Ticket");
        }
        else if(speed>60) {
            System.out.println("Mid Ticket");
        }
        else {
            System.out.println("No Ticket");
        }
    }
}
