package objects.CP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver=driver;
    }

    public MainPage redirectLoginPage(){
        driver.findElement(By.cssSelector("#loginLink")).click();
        return this;
    }

    public MainPage setDestination(){
        return this;
    }
    public MainPage setDates() {return this;}
    public MainPage pressSearchButton() {return this;}
    public MainPage redirectCreateAccount() {return this;}
    public MainPage redirectServicedApartments() {return this;}
    public MainPage redirectSharedOffices() {return this;}
    public MainPage redirectConceptStore() {return this;}
    public MainPage redirectCompany() {return this;}
    public MainPage redirectContact() {return this;}
    public MainPage redirectMyBookmarks() {return this;}
    public MainPage changeLanguage(String language) {return this;}

}

