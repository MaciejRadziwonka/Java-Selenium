package objects.EP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {this.driver = driver;}

    public LoginPage login() {
        WebElement Login = driver.findElement(By.cssSelector("#login"));
        Login.click();
        Login.sendKeys("mradziwonka");

        WebElement Password = driver.findElement(By.cssSelector("#passwd"));
        Password.click();
        Password.sendKeys("Vision73mr");

        return this;
    }
    public LoginPage signIn() {
        driver.findElement(By.cssSelector("button#loginBtn")).click();

        return this;
    }
}
