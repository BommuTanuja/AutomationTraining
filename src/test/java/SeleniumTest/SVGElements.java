package SeleniumTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SVGElements extends BaseSelenium{

    @Test
    public void handleSVGElements(){
        driver.get("https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd");
        driver.findElement(By.cssSelector("button#UppyImageUploader")).click();
        driver.findElement(By.xpath("//div[@class='uppy-DashboardTab']/button/*[name()='svg']/following-sibling::div[text()='My Device']")).click();

    }
}
