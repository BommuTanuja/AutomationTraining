package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class Factorial {
    public static void main(String[] args) {
        int number=5;
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact =fact*i;
        }
        System.out.println(fact);

        List collection = new ArrayList();
        System.out.println(collection.size());

        try{
            int b, a=1;
            b=a/0;
        }catch(Exception e){
            System.out.println("exception");
        }finally {
            System.out.println("finally");
        }
    }

}
