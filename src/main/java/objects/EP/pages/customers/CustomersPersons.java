package objects.EP.pages.customers;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class CustomersPersons {

    private WebDriver driver;

    public CustomersPersons(WebDriver driver) {this.driver = driver;}

    private void Latency(int seconds)
    {
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CustomersPersons OpenCustomerPersonsTab() {

        Latency(3);
        driver.findElement(By.xpath("(//span[@class ='tab-title'])[2]")).click();

        System.out.println("Customer Persons Tab Passed");

        return this;

    }


    public CustomersPersons PressCustomerPersonCreate() {
        Latency(1);

        driver.findElement(By.xpath("(//span[@class ='ui-pg-button-text'])[1]")).click();

        System.out.println("Customer Persons Creation Passed");

        return this;
    }

    public CustomersPersons ChoseCustomerPersonSaultation() {
        Latency(1);
        driver.findElement(By.xpath("//input[@id ='dto.person.gender.MALE']")).click();

        System.out.println("Customer Persons Saultation Passed");

        return this;
    }

    public CustomersPersons InsertCutomerPersonFirstName() {

        WebElement firstName = driver.findElement(By.xpath("//input[@id ='dto.person.firstName']"));
        firstName.click();
        firstName.sendKeys("TestPerson");

        System.out.println("Customer Persons First Name Passed");

        return this;
    }

    public CustomersPersons InsertCustomerPersonSecondName() {

        WebElement secondName = driver.findElement(By.xpath("//input[@id ='dto.person.lastName']"));
        secondName.click();
        secondName.sendKeys("Testperson");

        System.out.println("Customer Persons Second Name Passed");

        return this;
    }

    public CustomersPersons InsertCustomerPersonPhone() {
        WebElement phone = driver.findElement(By.xpath("//input[@id ='dto.person.phone']"));
        phone.click();
        phone.sendKeys("600600600");

        System.out.println("Customer Persons Phone Passed");

        return this;
    }


    public CustomersPersons SelectCustomerPersonLanguage() {
        driver.findElement(By.xpath("//input[@placeholder= '* Language']")).click();
        Latency(1);
        driver.findElement(By.xpath("//div[@data-value= '3']")).click();

        System.out.println("Customer Persons Language Passed");

        return this;
    }
    public CustomersPersons InsertCustomerPersonEmail() {

        WebElement email = driver.findElement(By.xpath("//input[@id='dto.person.email']"));
        email.click();

        String Rletters = RandomStringUtils.randomAlphabetic(7);
        System.out.println(Rletters);

        email.sendKeys( Rletters + "@gmail.com");
        System.out.println("Email Passed");

        System.out.println("Customer Persons Email Passed");

        return this;
    }

    public CustomersPersons SelectCustomerPersonBirthDay() {

        WebElement date = driver.findElement(By.xpath("//input[@id='dto.person.birthDate']"));
        date.click();
        date.sendKeys("01/01/2000");
        date.sendKeys(Keys.ENTER);

        Latency(1);

        driver.findElement(By.xpath("//input[@id='dto.person.postalCode']")).click();

        System.out.println("Customer Persons Bday Passed");

        return this;
    }

    public CustomersPersons SelectCustomerPersonCountry() {

        WebElement country = driver.findElement(By.xpath("//input[@placeholder ='* Country']"));
        country.click();
        Latency(1);
        driver.findElement(By.xpath("//div[@data-value = '242']")).click();
        System.out.println("Country Passed");

        System.out.println("Customer Persons Country Passed");

        return this;
    }

    public CustomersPersons ConfirmCustomerPersonFunction (){

        WebElement function = driver.findElement(By.xpath("//input[@placeholder ='* Function']"));
        function.click();
        Latency(1);
        function.sendKeys(Keys.ENTER);

        System.out.println("Customer Persons Function Passed");

        return this;
    }

    public CustomersPersons ConfirmCustomersPersons()
    {
        driver.findElement(By.xpath("//button[@id ='savePanelButtton']")).click();

        System.out.println("Customer Persons Confirmation Passed");

        return this;
    }


}
