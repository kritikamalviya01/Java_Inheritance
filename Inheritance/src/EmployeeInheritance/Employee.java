package EmployeeInheritance;

public class Employee {
    int id;
    String name;
    String dept;
    double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void work(){
        System.out.println("Common working for all");
    }
}
