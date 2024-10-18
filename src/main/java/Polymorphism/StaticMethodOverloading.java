package Polymorphism;

public class StaticMethodOverloading {
    public void register(){
        System.out.println("Register with empty data");
    }

    public void register(String phone){
        System.out.println("Register with with data");
    }

    public void register(String data1, String data2, String data3){
        System.out.println("Register with empty data");
    }

    public void register(String firstName, String lastName, String phone, String role){
        System.out.println("Register with empty data");
    }

    public static void main(String[] args) {
        StaticMethodOverloading staticMethodOverloading = new StaticMethodOverloading();
        staticMethodOverloading.sum();
        System.out.println( staticMethodOverloading.sum(154,587));
        staticMethodOverloading.sum(10.2,10.3);
        staticMethodOverloading.sum(15.2,13.5f);
        staticMethodOverloading.register();

    }
    public void sum(){
        int a = 10, b= 20, c;
        c = a+b;
        System.out.println(c);
    }

    public int sum(int a, int b){
        int c;
        c = a+b;
        return c;

    }

    public double sum(int a, double b){
        double c;
        c = a+b;
        return c;
    }

    public double sum(double a, double b){
        double c;
        c = a+b;
        System.out.println(c);
        return c;
    }

    public double sum(double a, double b, int d){
        double c;
        c = a+b+d;
        return c;
    }

    public double sum(double a, int b, double d){
        double c;
        c = a+b+d;
        return c;
    }

    public double sum(double a, float b){
        double c;
        c = a+b;
        System.out.println(c);
        return c;
    }

    public int sum(int a, int b, int d){
        int c;
        c = a+b+d;
        return c;
    }

}
