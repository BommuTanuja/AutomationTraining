package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabsTest {
    WebDriver driver;

    @Test
    public void launchBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");

        String text = driver.findElement(By.xpath("//div[@class='login_password']")).getText();
        System.out.println(text);




    }

    @Test
    public void verifyTheCheckbox(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/");

        WebElement checkbox = driver.findElement(By.xpath("//td[text()='Java']/preceding-sibling::td/input[@type='checkbox']"));
        checkbox.click();



    }
}
