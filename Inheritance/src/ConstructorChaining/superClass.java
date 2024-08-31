package ConstructorChaining;

public class superClass {

    int x;

    superClass(){
//        this(10);
        System.out.println("No arg Superclass Constructor");
    }

    superClass(int x){
        this();
        this.x = x;
        System.out.println("One Arg Superclass Constructor");
    }
}
