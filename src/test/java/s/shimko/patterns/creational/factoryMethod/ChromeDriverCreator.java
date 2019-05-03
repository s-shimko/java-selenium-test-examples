package s.shimko.patterns.creational.factoryMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCreator extends DriverCreator {


    @Override
    public WebDriver create() {
        driver = new ChromeDriver();
        System.out.println(driver.getClass().getName() + " created");
        return driver;
    }
}
