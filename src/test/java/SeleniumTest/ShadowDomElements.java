package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShadowDomElements extends BaseSelenium {
    JavascriptExecutor jse;

    @Test
    public void handleShadowDOMElement(){
        driver.get("https://www.salesforce.com/in/?ir=1");
        SearchContext mainShadowRoot = driver.findElement(By.cssSelector("div[class='globalnav-wrapper-c360 ']>hgf-c360nav")).getShadowRoot()
                .findElement(By.cssSelector("hgf-button[variant='trial']")).getShadowRoot();
        WebElement element = mainShadowRoot.findElement(By.xpath("//a[@data-variant='trial']"));
       // jse.executeScript("arguments[0].click()", element);
        element.click();


    }

    @Test
    public void handleShadowRootElement(){
        driver.get("https://books-pwakit.appspot.com/");

        SearchContext shadowRootElement = driver.findElement(By.cssSelector("[apptitle='BOOKS']")).getShadowRoot();
//        WebElement element = driver.findElement(By.xpath(""));
//        element.findElement(By.xpath("")).click();
        shadowRootElement.findElement(By.cssSelector("[aria-label='Search Books']")).sendKeys("Selenium");

    }



}
