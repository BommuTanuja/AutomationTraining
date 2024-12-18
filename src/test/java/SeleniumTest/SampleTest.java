package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleTest {
    WebDriver driver;
    JavascriptExecutor jse;

    @Test
    public void launchBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        jse = (JavascriptExecutor) jse;
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        jse = (JavascriptExecutor) driver;
        // jse.executeScript("return document.querySelector('//div[contains(text(),'I agree to the')]/../div[@class='checkbox-ui']').click()");
        //driver.findElement(By.xpath("//div[@class='field']/input[@id='SubscriptionAgreement']"));

        WebElement checkbox1 = driver.findElement(By.xpath("//div[contains(text(),'I agree to the')]/../div[@class='checkbox-ui']/preceding-sibling::input"));
        Assert.assertTrue(checkbox1.isEnabled());
        System.out.println(checkbox1.isSelected());
        jse.executeScript("arguments[0].click()",checkbox1);
        System.out.println(checkbox1.isSelected());

         driver.close();
    }

}
