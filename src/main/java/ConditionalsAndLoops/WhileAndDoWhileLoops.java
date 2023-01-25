package ConditionalsAndLoops;

public class WhileAndDoWhileLoops {
    public static void main(String[] args) {
        char ch='A'; //65
//      while loop in java
        while(ch<=90) {
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();
//      do while loop in java
        char c='A';
        do {
            System.out.print(c+" ");
            c++;
        } while(c<='Z');

    }
}
