package s.shimko.patterns.creational.factoryMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverCreator extends DriverCreator {

    public static final String PATH_TO_FIREFOX_DRIVER = "c:\\sergey\\tools\\geckodriver-v0.24.0\\geckodriver.exe";

    @Override
    public WebDriver create() {
        System.setProperty("webdriver.gecko.driver", PATH_TO_FIREFOX_DRIVER);
        driver = new FirefoxDriver();
        System.out.println(driver.getClass().getName() + " created");
        return driver;
    }
}
