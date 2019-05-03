package s.shimko.amazon.witPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import s.shimko.amazon.AbstractPage;

public class ItemPageWithPageFactory extends AbstractPage {

    @FindBy(css="#priceblock_ourprice")
    WebElement itemPrice;

    public ItemPageWithPageFactory(WebDriver driver) {
        super(driver);
    }

    public String readItemPrice(){
        String priceTextValue = itemPrice.getText();
        System.out.println("Price: " + priceTextValue);
        return priceTextValue;
    }
}
