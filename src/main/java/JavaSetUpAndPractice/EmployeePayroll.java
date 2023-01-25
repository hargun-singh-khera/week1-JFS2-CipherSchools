package JavaSetUpAndPractice;
import java.util.Scanner;
public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your salary");
        double salary = sc.nextDouble();
        double gross,hra,da;
        if (salary>=5000) {
            hra=salary*0.1;
            da=salary*0.2;
        }
        else {
            hra=salary*0.2;
            da=salary*0.3;
        }
        gross=salary+hra+da;
        System.out.println("Your HRA is: " + hra);
        System.out.println("Your DA is: " + da);
        System.out.println("Your gross salary is: " + gross);
    }
}
