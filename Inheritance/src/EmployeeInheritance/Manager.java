package EmployeeInheritance;

public class Manager extends Employee{
    String[] Projects;

    public Manager(int id, String name, String dept, double salary, String[] Projects) {
        super(id, name, dept, salary);
        this.Projects = Projects;
    }

    @Override
    public void work(){
        super.work();
        System.out.println("Manager is working on ");
        for(int i=0; i<Projects.length; i++){
            System.out.println(Projects[i]);
        }
    }
}
