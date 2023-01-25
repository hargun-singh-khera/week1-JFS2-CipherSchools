package Inheritance;

public class Furniture {
    int width;
    int height;
    void display(String item) {
        System.out.println("Item "+item+" Width "+width+" Height "+height);
    }
    public static void main(String[] args) {
        Chair ch=new Chair();
        ch.foo();
    }
}
class Chair extends Furniture {
    void foo() {
        width=10;
        height=20;
        display("Chair");
    }
}
class Table extends Furniture {
    void foo() {
        width=30;
        height=50;
        display("Chair");
    }
}
class Almira extends Furniture {
    void foo() {
        width=100;
        height=200;
        display("Chair");
    }
}
