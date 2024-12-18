package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseSelenium {
    public WebDriver driver;

    @BeforeSuite
    public void launchBrowser(){
        driver  = new ChromeDriver();
    }

    @AfterSuite
    public void killSession(){
        //driver.close();
        driver.quit();
    }

    @BeforeTest
    public void verifyDeleteButtons() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }
}
