package objects.EP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.reporters.jq.Main;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {this.driver = driver;}

    public MainPage redirectCustomers()
    {
        driver.findElement(By.cssSelector("li#layout_9 div")).click();
        driver.findElement(By.cssSelector("li#layout_68 > a")).click();

        return this;
    }
}
