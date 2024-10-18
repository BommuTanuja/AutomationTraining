package Basics;

public class Constructors {
    public Constructors(){
        System.out.println("Automation testing");
    }
    public Constructors(int a ){
        System.out.println("Automation testing :: " + a);
    }
    public static void main(String[] args) {
        Constructors constructors = new Constructors();
        Constructors constructors1 = new Constructors(14);
        constructors.sum1();
        constructors.sum2();
        constructors.sum(57,558);
        constructors1.sum1();
        constructors1.sum2();
        constructors1.sum(100, 1000);
        constructors1.sum(999900, 1000);
    }

    public void sum1(){
        int a=10,b=20, c;
        c = a+b;
        System.out.println(c);
    }

    public int sum2(){
        int a=30,b=20, c;
        c = a+b;
        System.out.println(c);
        return c;
    }

    public int sum(int a, int b){
        int c;
        c = a+b;
        System.out.println(c);
        return c;
    }

}
