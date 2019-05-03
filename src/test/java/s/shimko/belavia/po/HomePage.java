package s.shimko.belavia.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends AbstractPage {

    public static final String BELAVIA_URL = "http://belavia.by";

    @FindBy(xpath = "//div/a[@href='/predlozheniya/']")
    private WebElement allOffersLink;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        driver.get(BELAVIA_URL);
    }

    public OffersPage openOffersPage(){
        new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(allOffersLink));
        toSleep(1);
        allOffersLink.click();
        return PageFactory.initElements(driver, OffersPage.class);
    }

    public static void toSleep(long seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
