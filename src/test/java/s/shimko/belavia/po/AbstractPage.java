package s.shimko.belavia.po;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {

    protected String PAGE_TITTLE;

    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }
}
