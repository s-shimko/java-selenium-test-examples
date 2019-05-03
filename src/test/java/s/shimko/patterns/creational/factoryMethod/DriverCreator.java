package s.shimko.patterns.creational.factoryMethod;

import org.openqa.selenium.WebDriver;

public abstract class DriverCreator {

    protected WebDriver driver;

    public abstract WebDriver create();

}
