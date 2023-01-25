package Constructors;

public class Employee {
    private int employeeId;
    private int salary;
    private String dept;

    Employee(int employeeId, int salary, String dept) {
        this.employeeId=employeeId;
        this.salary=salary;
        this.dept=dept;
    }
    public static void main(String[] args) {
        Employee hargun=new Employee(101,100000,"Engineering");
        Employee arjun=new Employee(102,20000,"Testing");

        System.out.println("Id "+hargun.employeeId+" Salary "+hargun.salary+" Dept "+hargun.dept);
        System.out.println("Id "+arjun.employeeId+" Salary "+arjun.salary+" Dept "+arjun.dept);
    }
}
