package EmployeeInheritance.test;

import EmployeeInheritance.Developer;
import EmployeeInheritance.Manager;
import EmployeeInheritance.Tester;

public class Testing {
    public static void main(String[] args) {
        String[] projects = new String[] {"BFSI", "Retail Manufacturing"};
        Manager manager = new Manager(1, "Kritika", "IT", 10000000, projects);
        manager.work();

        Developer developer = new Developer(2, "Kinesh", "Web Developer", 100000000, "React JS");
        developer.work();

        String[] tools =  new String[] {"Postman", "Newman"};
        Tester tester = new Tester(3, "Komal", "Testing", 100000000, tools);
        tester.work();
    }
}
