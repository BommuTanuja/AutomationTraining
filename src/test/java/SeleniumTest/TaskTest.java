package SeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskTest extends BaseSelenium{
    String match = "Live";
    String location = "Christchurch";

    @Test
    public void gettingTheMatchName(){
        driver.get("https://www.espncricinfo.com/");
        List<String> allElements = new ArrayList<>();

        List<WebElement> firstElement = driver.findElements(By.xpath("//span[text()='1st ODI']/../parent::div/../following-sibling::div/descendant::div[@title]"));
        ///div[@class='ds-truncate']/../following-sibling::div/div

        List<WebElement> teamsWithLocation = driver.findElements(By.xpath("//span[text()='RESULT']/../following-sibling::span[text()='Gqeberha']/span/span[text()='1st Match']/../../span/../span/../../../following-sibling::div/descendant::div[@title]"));
        List<WebElement> teamLocation = driver.findElements(By.xpath("//span[text()='"+match+"']/../following-sibling::span[text()='"+location+"']/../../following-sibling::div/descendant::div[@title]"));


        for(int i=0;i<teamLocation.size();i++){
            allElements.add(teamLocation.get(i).getText());
        }
        System.out.println(allElements);
    }
}
