package exceptions;

public class TestMyException extends MyException {


    public TestMyException(String message) {
        super(message);
    }

    public static void main(String[] args) throws MyException {
        try{
            int a = 5;
            int b=5/0;
        }catch (ArithmeticException e){
            //throw new ArithmeticException("Provide right math");
            //throw new MyException("Provide right details");
            throw new MyException("Provide details", e.getCause());
        }

    }
}
