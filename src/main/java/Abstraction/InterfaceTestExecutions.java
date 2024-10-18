package Abstraction;

public class InterfaceTestExecutions extends InterfaceImplementation{
    public static void main(String[] args) {
        InterfaceSample interfaceSample = new InterfaceTestExecutions();  // webdriver driver = new chromedriver();
        interfaceSample.login();
        interfaceSample.register();
    }

}
