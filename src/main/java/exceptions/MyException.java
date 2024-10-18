package exceptions;

public class MyException extends Throwable{


         public MyException(String message) {
             super(message);

         }


        public MyException(String message, Throwable throwable){
            super(message,throwable);
        }

}
