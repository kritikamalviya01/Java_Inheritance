package SuperKeyword;

public class Child extends Parent{

    int c, d;

    Child(int a, int b, int c, int d){
        super(a,b);
        this.c = c;
        this.d = d;
    }

    void displayDetails(){
        System.out.println("Parent a" + super.a);
        System.out.println("Parent b" + super.b);
        System.out.println("Child c" + c);
        System.out.println("Child d" + d);
    }

    @Override
    void p1() {
        super.p1();
        System.out.println("Inside Child P1 method");
    }
}
