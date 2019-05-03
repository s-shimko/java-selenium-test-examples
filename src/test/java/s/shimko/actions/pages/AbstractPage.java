package s.shimko.actions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import s.shimko.actions.utils.WebDriverSingleton;

public abstract class AbstractPage {

    public static final int WAIT_TIME = 3;
    public WebDriver driver;

    public AbstractPage() {
        this.driver = WebDriverSingleton.getInstance();
    }

    public void switchToFrame() {
        driver.switchTo().frame(0);
    }

    public void outOfFrame() {
        driver.switchTo().defaultContent();
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

    protected void highLightElement(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid green'", driver.findElement(locator));
    }

    protected void unHighLightElement(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='0px'", driver.findElement(locator));
    }

    public void click(final By locator) {
        waitForElementVisible(locator);
        highLightElement(locator);
        driver.findElement(locator).click();
    }
}
