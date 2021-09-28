package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class EPTestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://ep-test.visionapartments.com/");
    }


    @AfterMethod
    public void close(){
        driver.quit();
    }
}