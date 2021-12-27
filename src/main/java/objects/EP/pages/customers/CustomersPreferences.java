package objects.EP.pages.customers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomersPreferences {

    private WebDriver driver;

    public CustomersPreferences(WebDriver driver) {this.driver = driver;}

    private void Latency(int seconds)
    {
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CustomersPreferences CustomerPreferencesTab() {

        Latency(5);

        driver.findElement(By.xpath("//div[@class='toast toast-success']")).click();
        driver.findElement(By.xpath("(//span[@class ='tab-title'])[3]")).click();

        return this;
    }

    public CustomersPreferences CreatingPreferation() {

        Latency(1);

        driver.findElement(By.xpath("//div[@id ='preferencesPager-create']")).click();
        Latency(1);

        return this;
    }

    public CustomersPreferences AddingPreferation() {

        Latency(3);
        WebElement group = driver.findElement(By.xpath("//input[@placeholder ='* Preference group']"));
        group.click();
        group.sendKeys(Keys.ENTER);

        return this;
    }

    public CustomersPreferences SelectingFloor() {

        WebElement floor = driver.findElement(By.xpath("//input[@placeholder ='* Floor']"));
        Latency(1);
        floor.click();
        Latency(1);
        floor.sendKeys("1");

        return this;
    }

    public CustomersPreferences SelectingValue() {

        WebElement value = driver.findElement(By.xpath("//input[@placeholder ='Preference value']"));

        value.click();
        value.sendKeys("3");

        return this;
    }

    public CustomersPreferences SavingChanges() {

        driver.findElement(By.xpath("//button[@id ='savePanelButtton']")).click();
        Latency(3);
        driver.findElement(By.xpath("//div[@class='toast toast-success']")).click();

        return this;
    }

}
