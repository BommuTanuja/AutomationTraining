package Inheritance;

public class Child extends Parent{
    public static void main(String[] args) {

        // inheritance relationship
        Child child = new Child();
        child.test1();
        test2();
        System.out.println(child.a);

        // without using inheriting the class
        Parent parent = new Parent();
        parent.test1();
        test2();
        System.out.println(parent.a);
    }
}
