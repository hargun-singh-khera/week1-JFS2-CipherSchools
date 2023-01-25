package Polymorphism;
//Encapsulation topic task
class Student {
    private int standard;
    private int rollno;
    private String section;

    void setStandard(int standard) {
        this.standard=standard;
    }
    void setRollno(int rollno) {
        this.rollno=rollno;
    }
    void setSection(String section) {
        this.section=section;
    }
    int getStandard() {
        return standard;
    }
    int getRollno() {
        return rollno;
    }
    String getSection() {
        return section;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setStandard(12);
        obj.setRollno(32);
        obj.setSection("ABC");

        System.out.println("Standard " + obj.getStandard()+" Rollno "+ obj.getRollno()+" Section "+ obj.getSection());
    }
}
