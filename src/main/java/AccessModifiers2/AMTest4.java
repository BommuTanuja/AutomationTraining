package AccessModifiers2;

import AccessModifiers.AMTest1;

public class AMTest4 extends AMTest1 {
    public static void main(String[] args) {
        AMTest1 amTest1 = new AMTest1();
      // amTest1.test3();


        AMTest4 amTest4 = new AMTest4();
        amTest4.test3();
    }
}
