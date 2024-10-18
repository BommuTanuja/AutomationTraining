package Constructors;

public class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
       // Child child = new Child();  // all constructors will be printed
      //  Parent parent = new Child(); // all
        Parent parent1 = new Parent(); // only parent class and ancestor
    }

    /*
      Multi level inheritance
      constructors weill execute when parent class is  called
     */
}
