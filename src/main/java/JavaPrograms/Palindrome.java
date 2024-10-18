package JavaPrograms;

public class Palindrome {
    public static void main(String[] args) {
        int r,sum=0,n,temp;
        n=565;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
           // System.out.println(n);
        }
        if(temp==sum){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
