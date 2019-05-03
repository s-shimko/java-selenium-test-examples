package s.shimko.actions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggablePage extends AbstractPage {

    private static final String DRAGGABLE_PAGE_URL = "https://jqueryui.com";

    private static final By SQUARE_LOCATOR = By.xpath("//div[@id='draggable']");
    private static final By TARGET_LOCATOR = By.xpath("//div[@id='droppable']");
    private static final By DROPPABLE_LOCATOR = By.xpath("//a[@href='https://jqueryui.com/droppable/']");
    private static final By DRAGGABLE_LOCATOR = By.xpath("//a[@href='https://jqueryui.com/draggable/']");

    public DraggablePage open() {
        driver.get(DRAGGABLE_PAGE_URL);
        return this;
    }

    public DraggablePage dragNDropSquare() {
        click(DROPPABLE_LOCATOR);
        switchToFrame();
        waitForElementVisible(SQUARE_LOCATOR);
        waitForElementVisible(TARGET_LOCATOR);
        highLightElement(SQUARE_LOCATOR);
        highLightElement(TARGET_LOCATOR);
        new Actions(driver).dragAndDrop(driver.findElement(SQUARE_LOCATOR), driver.findElement(TARGET_LOCATOR)).build().perform();
        unHighLightElement(SQUARE_LOCATOR);
        unHighLightElement(TARGET_LOCATOR);
        waitForElementVisible(SQUARE_LOCATOR);
        outOfFrame();
        click(DRAGGABLE_LOCATOR);
        return this;
    }


}
