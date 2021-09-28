package objects.EP.pages.customers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomersPage {

    private WebDriver driver;

    public CustomersPage(WebDriver driver) {this.driver = driver;}

    private void Latency(int seconds)
    {
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CustomersPage OpenCustomersTab()
    {
        Latency(1);
        driver.findElement(By.xpath("//*[@title='Customers']")).click();
        System.out.println("Customers Passed");
        return this;
    }

    public CustomersPage SearchCustomer() {

        driver.findElement(By.xpath(("//*[@id='layout_68']"))).click();
        System.out.println("Search Customers Passed");

        return this;
    }

    public CustomersPage CreateCustomerButton() {

        driver.findElement(By.xpath("//div[@class='btn btn-xs ui-pg-button']")).click();
        System.out.println("Create Customer Button Passed");

        return this;
    }

    public CustomersPage SelectCustomerSaultation() {

        try {
            Thread.sleep(3333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//input[@id='customerGeneralDto.person.gender.MALE']")).click();
        System.out.println("Saultaion passed");
        return this;
    }

    public CustomersPage InsertCustomerFirstName(String FirstName) {

        WebElement firstName = driver.findElement(By.xpath("//input[@id='customerGeneralDto.person.firstName']"));
        firstName.click();
        firstName.sendKeys(FirstName);
        System.out.println("Firstname Passed");
        return this;
    }

    public CustomersPage InsertCustomerSecondName() {

        WebElement lastName = driver.findElement(By.xpath("//input[@id='customerGeneralDto.person.lastName']"));
        lastName.click();
        lastName.sendKeys("Testcase");
        System.out.println("Lastname Passed");
        return this;
    }

    public CustomersPage ChoseCustomerLanguage() {
        driver.findElement(By.xpath("//input[@placeholder= '* Language']")).click();
        Latency(1);
        driver.findElement(By.xpath("//div[@data-value= '3']")).click();

        return this;
    }
    public CustomersPage InsertCustomerEmail(String Email) {

        WebElement email = driver.findElement(By.xpath("//input[@id='customerGeneralDto.person.email']"));
        email.click();
        email.sendKeys(Email + "@gmail.com");
        System.out.println("Email Passed");

        return this;
    }

    public CustomersPage InsertCustomerBirthDay() {

        WebElement date = driver.findElement(By.xpath("//input[@id='customerGeneralDto.person.birthDate']"));
        date.click();
        date.sendKeys("01/01/2000");

        driver.findElement(By.xpath("//input[@id='customerGeneralDto.person.postalCode']")).click();
/*
        WebElement calendarYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        calendarYear.click();


       calendarYear.sendKeys("2000");
        calendarYear.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(("")))
        System.out.println("Date Passed");
*/
        return this;
    }

    public CustomersPage ChoseCustomerCountry() {

        WebElement country = driver.findElement(By.xpath("//div[@id = 'customerGeneralDto.person.country.idTitleContainer']"));
        country.click();
        Latency(1);
        driver.findElement(By.xpath("//div[@data-value = '242']")).click();
        System.out.println("Country Passed");


        return this;
    }

    public CustomersPage ConfirmCustomer()
    {
        driver.findElement(By.xpath("//button[@id='saveGeneralTabButton']")).click();
        System.out.println("Save Passed");

        return this;
    }

    public CustomersPage OpenNewAwailabilityCheck(boolean state)
    {
        Latency(3);

        if(state == true) {
            driver.findElement(By.xpath("//button[@id='js-newAvailabilityCheckBtn']")).click();
        }else if (false){
            System.out.println("No Availability Check");
        }

        System.out.println("Availability Check Passed");

        driver.findElement(By.xpath("//div[@class='toast toast-success']")).click();

        return this;
    }
}
