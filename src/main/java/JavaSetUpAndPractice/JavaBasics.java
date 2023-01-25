package JavaSetUpAndPractice;
import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
//      Scanner class is used for taking the input from multiple sources that's why we pass the source in its object argument &
//      since we need to take input from user from keyboard we need to use System.in
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number!");
        int n = sc.nextInt();
        if(n>0) {
            System.out.println("+ve");
        }
        else if(n==0) {
            System.out.println("Neutral");
        }
        else {
            System.out.println("-ve");
        }
    }
}
