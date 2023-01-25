package Polymorphism;

//Polymorphism: An ability of an object to take many forms. It is of two types: Static(Function Overloading) & Dynamic(Function Overriding).
public class StaticPolymorphism {

//    Function Overloading: defining multiple functions with same name with different parameters.

//    add is existing in multiple forms (using parameters)
    void add(int num1,int num2) {
        System.out.println(num1+num2);
    }
    void add(int num1,int num2,int num3) {
        System.out.println(num1+num2+num3);
    }
    void add(float num1,float num2) {
        System.out.println(num1+num2);
    }
    void add(int num1,float num2) {
        System.out.println(num1+num2);
    }
    void add(float num1,int num2) {
        System.out.println(num1+num2);
    }
    public static void main(String[] args) {
//        rules

//        16 & 18: no of parameters must be different.
//        16 & 20: no of parameters are same, but it is valid because type is different
//        22 & 24: no of parameters are same and type are also almost same. It's sequence/order of datatype is different.

        StaticPolymorphism sp = new StaticPolymorphism();
        sp.add(12.2f,300);
    }
}
