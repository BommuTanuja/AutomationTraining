package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.desktop.SystemEventListener;
import java.time.Duration;

public class HandleMouseActions extends BaseSelenium{

    SeleniumActions seleniumActions;

    @BeforeClass
    public void initializePages(){
        seleniumActions = new SeleniumActions();
    }

    @Test
    public void verifyDynamicDropDownIsHandled() throws InterruptedException{
        driver.get("https://thesoftwarepractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement parentElement = driver.findElement(By.xpath("(//li/a[text()='Industries'])[2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(parentElement).perform();
        actions.click(driver.findElement(By.xpath("(//a[text()='Transportation'])[2]")));
        actions.perform();
        actions.release();

        wait.until(ExpectedConditions.textToBe(By.cssSelector(".title"), "TRANSPORTATION"));
        Assert.assertEquals(driver.getTitle(), "TSP : Industries - Transportation");
        System.out.println(driver.getTitle());
    }

}
