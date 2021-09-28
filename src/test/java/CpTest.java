import config.EPTestBase;
import objects.CP.pages.MainPage;
import org.testng.annotations.Test;

public class CpTest extends EPTestBase {

    @Test
    public void myFirstTest(){
        MainPage mainPage = new MainPage(driver);

        mainPage
                .redirectLoginPage()
                .setDestination();



    }
}
