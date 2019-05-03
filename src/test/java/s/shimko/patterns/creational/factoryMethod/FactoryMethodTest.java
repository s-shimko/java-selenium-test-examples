package s.shimko.patterns.creational.factoryMethod;

import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class FactoryMethodTest {
    public static void main(String[] args) {
        WebDriver ffDriver = new FirefoxDriverCreator().create();
        WebDriver chromebDriver = new ChromeDriverCreator().create();
    }
}
