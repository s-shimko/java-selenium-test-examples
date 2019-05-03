package s.shimko.belavia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import s.shimko.belavia.dto.Offer;
import s.shimko.belavia.po.HomePage;
import s.shimko.belavia.po.OffersPage;
import s.shimko.belavia.po.RegionalSettingsPage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AppTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(RegionalSettingsPage.BELAVIA_URL);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test(description = "Special offers test",enabled = false)
    public void specialOffersTest() {
        System.out.println("Test is started");
        HomePage homePage = new HomePage(driver);
        OffersPage offersPage = homePage.openOffersPage();
        ArrayList<Offer> listOfOffers = offersPage.getListOfOffers();
        for(Offer offer : listOfOffers){
            System.out.println(offer);
        }
    }

}
