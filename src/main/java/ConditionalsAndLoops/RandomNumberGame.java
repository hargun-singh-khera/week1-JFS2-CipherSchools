package ConditionalsAndLoops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random rn = new Random();
        int computerChoice=rn.nextInt(20);
        System.out.println("Computer Choice is: " + computerChoice);

        for (int i=1;i<=6;i++) {
            System.out.println("Guess a number between 0 and 20");
            Scanner sc = new Scanner(System.in);
            int userChoice=sc.nextInt();
            if (userChoice>computerChoice) {
                System.out.println("Your guess is too high!");
            }
            else if (userChoice<computerChoice) {
                System.out.println("Your guess is too low!");
            }
            else {
                System.out.println("Gotcha! You guessed it right!");
                break;
            }
        }
    }
}
