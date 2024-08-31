package ConstructorChaining;

public class ChildClass extends superClass{

    ChildClass(){
        this(20);
        System.out.println("No Arg Child class constructor");
    }

    ChildClass(int x){
        super(x);
        System.out.println("One Arg CHild class constructor");
    }


    public static void main(String[] args) {
        ChildClass c = new ChildClass();

    }
}
