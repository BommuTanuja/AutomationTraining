package JavaPrograms;

public class StringsPrograms {
    public static void main(String[] args) {
        getSpecificStringFromGivenString();
        reverseAString();
       // reverseAString("Automation");
        //getDuplicateCharactersFromString();
       // getMaxValue();
       // getVowelsFromString();
        palindromeNumber();
    }

    public static void getSpecificStringFromGivenString(){
        String s = "Your payment is completed and cashback $10 will be credited back to your account";

        int indexOfDollar = s.indexOf('$');
        System.out.println("indexOfDollar :: " + indexOfDollar); // 39
        // s.substring(s.indexOf("$"));

        String stringFromDollar = s.substring(indexOfDollar);
        System.out.println(stringFromDollar);


        int indexOfSecondString = stringFromDollar.indexOf("will");
        System.out.println("indexOfSecondString :: " + indexOfSecondString);

        System.out.println(stringFromDollar.substring(0,indexOfSecondString));


    }

    public static void reverseAString(){
        String s="selenium";
        System.out.println(s.indexOf('s'));
        System.out.println(s.length());
        for(int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
    }
    public static void reverseAString(String s){
        char[] ch = s.toCharArray();    // converting string to character array
        for(int i=ch.length-1;i>=0;i--){
            System.out.println(ch[i]);
        }
    }
    public static void getDuplicateCharactersFromString(){
        String s= "Tanuja";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.println(ch[i]);
                }
            }
        } ////or we can write without converting charArray
        for(int k=0;k<s.length();k++){
            for(int c=k+1;c<s.length();c++){
                if(s.charAt(k)==s.charAt(c)){
                  //  System.out.println(s.charAt(k));
                }
            }
        }
    }
    public static void getMaxValue(){
        int[] a ={14,65,85,63,0,693,887,552,6};
        int max =a[0] ;
        for (int i=0;i<a.length;i++){
            if(a[i]>max){  //min a[i}<min
                max=a[i];

            }
        }
        System.out.println(max);

    }
    public static void getVowelsFromString(){
        String s ="Appium";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u'){
                System.out.println(s.charAt(i));
            }
        }
    }
    public static void palindromeNumber(){
     int remainder,sum=0,temp;
     int n=121;
     temp=n;
     while(n>0){
         remainder=n%10;
         sum =(sum*10)+remainder;
         n=n/10;

     }
     if(temp==sum){
         System.out.println("palindrome");
     }else {
         System.out.println("not palindrome");
     }
    }
}
