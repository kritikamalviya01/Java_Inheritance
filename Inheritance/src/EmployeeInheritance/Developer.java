package EmployeeInheritance;

public class Developer extends Employee{
    String technology;

    public Developer(int id, String name, String dept, double salary, String technology) {
        super(id, name, dept, salary);
        this.technology = technology;
    }

    @Override
    public void work(){
        super.work();
        System.out.println("Developer is working on "+ technology);
    }
}
