import config.EPTestBase;
import objects.EP.pages.customers.CustomerBillingData;
import objects.EP.pages.customers.CustomersPage;
import objects.EP.pages.LoginPage;
import objects.EP.pages.customers.CustomersPersons;
import objects.EP.pages.customers.CustomersPreferences;
import org.testng.annotations.Test;

public class EpTest extends EPTestBase {

    @Test
    public void epTest(){

        final String CustomerName = "Testcase2106";

        new LoginPage(driver)
                .login()
                .signIn();

        new CustomersPage(driver)
                .OpenCustomersTab()
                .SearchCustomer()
                .CreateCustomerButton()
                .SelectCustomerSaultation()
                .InsertCustomerFirstName(CustomerName)
                .InsertCustomerSecondName()
                .ChoseCustomerLanguage()
                .InsertCustomerEmail(CustomerName)
                .InsertCustomerBirthDay()
                .ChoseCustomerCountry()
                .ConfirmCustomer()
                .OpenNewAwailabilityCheck(false);

       new CustomersPersons(driver)
                .OpenCustomerPersonsTab()
                .PressCustomerPersonCreate()
                .ChoseCustomerPersonSaultation()
                .InsertCutomerPersonFirstName()
                .InsertCustomerPersonSecondName()
                .InsertCustomerPersonPhone()
                .SelectCustomerPersonLanguage()
                .InsertCustomerPersonEmail()
                .SelectCustomerPersonBirthDay()
                .SelectCustomerPersonCountry()
                .ConfirmCustomerPersonFunction()
                .ConfirmCustomersPersons();

        new CustomersPreferences(driver)
                .CustomerPreferencesTab()
                .CreatingPreferation()
                .AddingPreferation()
                .SelectingFloor()
                .SelectingValue()
                .SavingChanges();

        new CustomerBillingData(driver)
                .OpenBillingdatatab()
                .CreatePayers()
                .SearchPayers()
                .SavePayer()
                .CreateBankAcc()
                .SelectPayer()
                .FillAccNumber()
                .SelectCurrency()
                .SaveAccount();
    }
}
