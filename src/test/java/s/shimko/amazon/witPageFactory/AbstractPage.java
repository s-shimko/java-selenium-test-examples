package s.shimko.amazon.witPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
    public static final int WAIT_TIME = 10;
    public WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    private boolean isElementPresent(By locator){
        return !driver.findElements(locator).isEmpty();
    }

    public void waitForElementPresent(By locator){
        new WebDriverWait(driver, WAIT_TIME).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public void waitForElementVisible(By locator){
        new WebDriverWait(driver, WAIT_TIME).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void waitForElementEnabled(By locator){
        new WebDriverWait(driver, WAIT_TIME).until(ExpectedConditions.elementToBeClickable(locator));
    }


}
