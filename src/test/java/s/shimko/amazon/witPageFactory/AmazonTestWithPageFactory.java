package s.shimko.amazon.witPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class AmazonTestWithPageFactory {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test(description = "Amazon Test",enabled = false)
    public void amazonTest() {
        SearchResultPageWithPageFactory searchResultPage = new HomePageWithPageFactory(driver).open().fillSearchInput("Iphone SE").startSearch();
        ItemPageWithPageFactory itemPage = searchResultPage.openFirtsSearchResult();
        String priceTextValue = itemPage.readItemPrice();
        assertTrue(Double.parseDouble(priceTextValue.substring(1)) < 350);
    }
}