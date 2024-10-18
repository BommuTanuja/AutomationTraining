package Polymorphism;

public class Child extends Parent{
    @Override
    public void register(){
        System.out.println("Test register");
            int a = 10, b= 20, c;
            c = a+b;
            System.out.println(c);

    }

    public static void main(String[] args) {
        Child child = new Child();
        child.register();
    }

}
