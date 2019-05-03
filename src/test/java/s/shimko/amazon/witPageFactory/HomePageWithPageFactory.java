package s.shimko.amazon.witPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import s.shimko.amazon.AbstractPage;

public class HomePageWithPageFactory extends AbstractPage {

    @FindBy(css = "#twotabsearchtextbox")
    WebElement searchInput;

    @FindBy(xpath = "//input[@value='Go']")
    WebElement goButton;

    public HomePageWithPageFactory(WebDriver driver) {
        super(driver);
    }

    public HomePageWithPageFactory open(){
        driver.get("https://amazon.com");
        return this;
    }

    public HomePageWithPageFactory fillSearchInput(String query){
        searchInput.sendKeys(query);
        return this;
    }

    public SearchResultPageWithPageFactory startSearch(){
       goButton.click();
        return new SearchResultPageWithPageFactory(driver);
    }
}