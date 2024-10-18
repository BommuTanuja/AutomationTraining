package Constructors;


public class ConstructorTest {
    int a;

    public ConstructorTest(){
        System.out.println(a);
        System.out.println("Automation Testing");
    }
    public ConstructorTest(int a ,int b){               // constructors can be overload and cant be over ride
        System.out.println(a+b);
        System.out.println("Automation Testing");
    }

    public static void main(String[] args) {
        ConstructorTest constructorTest = new ConstructorTest();
        ConstructorTest constructorTest1 = new ConstructorTest(4,5);
        constructorTest1.test();
        constructorTest.test();

    }
    public String test(){
       String s="selenium";
        System.out.println(s);
       return s;
    }
}
