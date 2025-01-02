package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptExecutorTests extends BaseSelenium{

    JavascriptExecutor jse;
    @BeforeClass
    public void initialize(){
         jse = (JavascriptExecutor) driver;
    }

    @Test
    public void clickUsingJS(){
        driver.get("https://www.prettylittlething.com/dark-grey-marl-knit-distressed-detail-chunky-cable-jumper.html");
        WebElement acceptAllButton = driver.findElement(By.xpath("//button[text()='Accept All']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String eleClick = "arguments[0].click()";
        ((JavascriptExecutor) driver).executeScript(eleClick, acceptAllButton);
        WebElement addToBagButton = driver.findElement(By.id("add-to-bag-button"));
        boolean getStatusOdAddToBagButton = addToBagButton.isEnabled();
        System.out.println("getStatusOfAddToBagButton :: " + getStatusOdAddToBagButton);

        WebElement size = driver.findElement(By.xpath("//span[text()='S']"));
        ((JavascriptExecutor) driver).executeScript(eleClick, size);

        System.out.println("addToBagButton status :: " + addToBagButton.isEnabled());
    }

    @Test
    public void typeValueUsingJS(){
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        WebElement firstNameInput = driver.findElement(By.cssSelector("input[id^='UserFirstName']"));
        firstNameInput.clear();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String typeValueInElement = "arguments[0].value='Tanuja'";
        jse.executeScript(typeValueInElement, firstNameInput);
    }

    @Test
    public void changeAttributeValue(){
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        System.out.println(clickHereLink.getAttribute("target")); // deprecated in current version 4.27
        System.out.println(clickHereLink.getDomAttribute("target"));
        System.out.println(clickHereLink.getDomProperty("target"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String changeAttribute = "arguments[0].setAttribute('target','_self')";
        jse.executeScript(changeAttribute, clickHereLink);
        clickHereLink.click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".example>h3")).getText(), "New Window");
    }

    @Test
    public void scrollToElement(){
        driver.get("https://the-internet.herokuapp.com/");
        WebElement abtestLink = driver.findElement(By.xpath("//a[@href='/abtest']"));
        WebElement forgetPwdLink = driver.findElement(By.xpath("//a[@href='/forgot_password']"));

        // based on the pixel
        jse.executeScript("window.scrollBy(0,200)");

        // Bottom of the page
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //scroll to the element
        jse.executeScript("arguments[0].scrollIntoView(true)",abtestLink);

    }

    @Test
    public void typeValueUsingJSId(){
        driver.get("https://www.saucedemo.com/");
        jse.executeScript("document.getElementById(\"user-name\").value='standard_user'");
        jse.executeScript("document.getElementById(\"password\").value='secret_sauce'");
        jse.executeScript("document.getElementById('login-button').click()");
    }

    @Test
    public void typeUsingQuerySelector(){
        driver.get("https://www.saucedemo.com/");
        jse.executeScript("return document.querySelector('[name=\"user-name\"]').value='standard_user'");
        jse.executeScript(" document.querySelector('name=\"password\"]').value='secret_sauce'");

    }



}
