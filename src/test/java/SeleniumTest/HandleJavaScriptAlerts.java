package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandleJavaScriptAlerts extends BaseSelenium{

    @BeforeClass
    public void initialize() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        //driver.switchTo().alert()
    }

    @Test
    public void verifyJSAlert() {
        WebElement jsAlertButton = driver.findElement(By.cssSelector("[onclick^='jsAlert']"));
        jsAlertButton.click();
        driver.switchTo().alert().accept();

        WebElement result = driver.findElement(By.xpath("//h4[contains(text(),'Result')]/following-sibling::p"));
        Assert.assertTrue(result.getText().contains("clicked"));
    }

    @Test
    public void verifyJSConfirmAlert(){
        WebElement jsAlertButton = driver.findElement(By.cssSelector("[onclick^='jsConfirm']"));
        jsAlertButton.click();
        driver.switchTo().alert().dismiss();
        WebElement result = driver.findElement(By.xpath("//h4[contains(text(),'Result')]/following-sibling::p"));
        Assert.assertTrue(result.getText().contains("Cancel"));
    }

    @Test
    public void verifyJSPromptAlert() throws InterruptedException {
        WebElement jsPromptButton = driver.findElement(By.cssSelector("[onclick^='jsPrompt']"));
        jsPromptButton.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Admin");
        alert.accept();
        WebElement result = driver.findElement(By.xpath("//h4[contains(text(),'Result')]/following-sibling::p"));
        Assert.assertTrue(result.getText().contains("Admin"));
        System.out.println(result.getText());

    }
}
