package Polymorphism;
class Addition {
    void sum(int num1, int num2) {
        System.out.println(num1+num2);
    }
    void sum(int num1, int num2, int num3) {
        System.out.println(num1+num2+num3);
    }
    void sum(int num1, float num2) {
        System.out.println(num1+num2);
    }
}
public class Task1 {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum(10,20);
        obj.sum(10,20,30);
        obj.sum(10,50.78f);
    }
}
