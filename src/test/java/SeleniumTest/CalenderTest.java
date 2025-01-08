package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class CalenderTest extends BaseSelenium {

    String year = "2025";
    String month = "April";
    String date = "12";


    @Test
    public void selectDate(){
        driver.get("https://www.makemytrip.com/");
        WebElement closeButton = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        closeButton.click();

        JavascriptExecutor jse =(JavascriptExecutor)driver;
        WebElement departureButton = driver.findElement(By.xpath("//label[@for='departure']"));
       // jse.executeScript("arguments[0].click()",departureButton);
        departureButton.click();

        WebElement nextButton = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));

        /*
        List<WebElement> years = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'2025')]"));
        WebElement month = driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]/div[contains(text(),'December')]"));
        WebElement date = driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]/div[contains(text(),'December')]/../following-sibling::div[@class=\"DayPicker-Body\"]/descendant::p[not(@class)]"));
        */

        while(true){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            if (driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'" + year + "')]")).size() > 0)
            {
                System.out.println( year +" found ");
                break;
            }else {
                nextButton.click();
            }
        }
        while(true){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            if (driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"')]")).size() > 0)
            {
                System.out.println(month +" found");
                break;

            }else {
                nextButton.click();
            }
        }
        String dateXpath = "//div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"')]/../following-sibling::div[@class='DayPicker-Body']/descendant::p[text()='"+date+"']";
        WebElement date = driver.findElement(By.xpath(dateXpath));
        date.click();
        List<WebElement> fullDate = driver.findElements(By.xpath("//p[@data-cy='departureDate']/span[text()]"));
        List<String> dateInfo = new ArrayList<>();

        for (int i=0; i< fullDate.size(); i++){
            dateInfo.add(fullDate.get(i).getText());
        }
        System.out.println(dateInfo);
    }



}
