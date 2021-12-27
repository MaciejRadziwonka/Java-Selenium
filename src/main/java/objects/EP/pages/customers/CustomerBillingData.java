package objects.EP.pages.customers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerBillingData {

    private WebDriver driver;

    public CustomerBillingData(WebDriver driver) {this.driver = driver;}

    private void Latency(int seconds)
    {
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CustomerBillingData OpenBillingdatatab() {

        Latency(3);

        driver.findElement(By.xpath("//div[@class='toast toast-success']")).click();
        driver.findElement(By.xpath("(//span[@class ='tab-title'])[4]")).click();

        return this;
    }

    public CustomerBillingData CreatePayers() {
        Latency(3);
        driver.findElement(By.xpath("//div[@id ='customerPayerPager-create']")).click();

        return this;
    }

    public CustomerBillingData SearchPayers() {

        Latency(2);
        WebElement searchPerson = driver.findElement(By.xpath("(//input[@placeholder ='Search existing person...'])[2]"));

        searchPerson.click();
        searchPerson.sendKeys("mradziwonka2@");
        Latency(2);
        searchPerson.sendKeys(Keys.ENTER);
        Latency(2);

        return this;
    }

    public CustomerBillingData SavePayer() {
        driver.findElement(By.xpath("//button[@id='savePanelButtton']")).click();

        return this;
    }

    public CustomerBillingData CreateBankAcc() {

        Latency(2);
        driver.findElement(By.xpath("//div[@class='toast toast-success']")).click();
        driver.findElement(By.xpath("//div[@id='customerBankAccountPager-create']")).click();

        return this;
    }

    public CustomerBillingData SelectPayer() {

        Latency(2);
        WebElement payer = driver.findElement(By.xpath("//input[@placeholder='* Owner/Payer']"));

        payer.click();
        payer.sendKeys(Keys.DOWN);
        payer.sendKeys(Keys.ENTER);

        return this;
    }

    public CustomerBillingData FillAccNumber() {


        WebElement account = driver.findElement(By.xpath("//input[@id='customerBankAccountDto.bankAccount.number']"));

        account.click();
        account.sendKeys("1234567890123456");

        return this;

    }

    public CustomerBillingData SelectCurrency() {

        WebElement currency = driver.findElement(By.xpath("//input[@placeholder='* Currency']"));

        currency.click();
        currency.sendKeys(Keys.DOWN);
        currency.sendKeys(Keys.ENTER);

        return this;
    }

    public CustomerBillingData SaveAccount() {

        driver.findElement(By.xpath("//button[@id='savePanelButtton']")).click();

        return this;

    }

}
