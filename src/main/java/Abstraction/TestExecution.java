package Abstraction;

public class TestExecution extends AbstractImplementation{
    public static void main(String[] args) {
        TestExecution testExecution = new TestExecution();
        testExecution.payment();
        testExecution.products();

        AbstractImplementation abstractImplementation = new AbstractImplementation();
        abstractImplementation.payment();
        abstractImplementation.products();

        AbstractImplementation abstractImplementation1 = new TestExecution();

        AbstractSample abstractSample = new TestExecution();
        abstractSample.payment();



    }
}
