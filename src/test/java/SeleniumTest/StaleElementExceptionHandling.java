package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaleElementExceptionHandling extends BaseSelenium{

    @Test
    public void handleStale(){
        driver.get("https://www.saucedemo.com/");
        WebElement userId = driver.findElement(By.id("user-name"));
        userId.clear();
        userId.sendKeys("Selenium");

        driver.navigate().refresh();
        try {
            userId.sendKeys("Selenium");
        }catch (StaleElementReferenceException ste){
            System.out.println("Stale handled");
            driver.findElement(By.id("user-name")).sendKeys("Appium");
        }

    }

}
