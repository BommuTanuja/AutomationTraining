package TestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {
    @Test
    public void smoke1(){
        System.out.println("Smoke1");
        Assert.assertTrue(false);
    }

    @Test
    public void smoke2(){
        System.out.println("Smoke2");
        Assert.assertEquals(2,2);
    }
}
