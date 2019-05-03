package s.shimko.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage {
    private static final By SEARCH_INPUT_LOCATOR = By.cssSelector("#twotabsearchtextbox");
    private static final By GO_BUTTON_LOCATOR = By.xpath("//input[@value='Go']");


    public HomePage(WebDriver driver) {
        super(driver);
}
    public HomePage open(){
        driver.get("https://amazon.com");
        return this;
    }

    public HomePage fillSearchInput(String query){
        driver.findElement(SEARCH_INPUT_LOCATOR).sendKeys(query);
        return this;
    }

    public SearchResultPage startSearch(){
        driver.findElement(GO_BUTTON_LOCATOR).click();
        return new SearchResultPage(driver);
    }
}
