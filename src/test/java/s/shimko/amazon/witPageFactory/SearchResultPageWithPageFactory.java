package s.shimko.amazon.witPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import s.shimko.amazon.AbstractPage;

public class SearchResultPageWithPageFactory extends AbstractPage {

    @FindBy(xpath = "(//div[@class = 'a-section aok-relative s-image-fixed-height'])[1]")
    WebElement firstResult;

    public SearchResultPageWithPageFactory(WebDriver driver) {
        super(driver);
    }

    public ItemPageWithPageFactory openFirtsSearchResult(){
        firstResult.click();
        return new ItemPageWithPageFactory(driver);
    }
}
