package s.shimko.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.awt.windows.WBufferStrategy;

public class SearchResultPage extends AbstractPage {

    private static final By FIRST_RESULT_LOCATOR = By.xpath("(//div[@class = 'a-section aok-relative s-image-fixed-height'])[1]");

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public ItemPage openFirtsSearchResult(){
        waitForElementPresent(FIRST_RESULT_LOCATOR);
        driver.findElement(FIRST_RESULT_LOCATOR).click();
        return new ItemPage(driver);
    }
}
