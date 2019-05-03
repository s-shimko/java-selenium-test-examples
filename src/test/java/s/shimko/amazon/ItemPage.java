package s.shimko.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class ItemPage extends AbstractPage {

    private static final By ITEM_PRICE_LOCATOR = By.cssSelector("#priceblock_ourprice");

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public String readItemPrice(){
        waitForElementPresent(ITEM_PRICE_LOCATOR);
        String priceTextValue = driver.findElement(ITEM_PRICE_LOCATOR).getText();
        System.out.println("Price: " + priceTextValue);
        return priceTextValue;
    }
}
