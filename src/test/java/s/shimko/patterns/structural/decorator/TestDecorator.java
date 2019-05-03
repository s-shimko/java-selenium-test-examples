package s.shimko.patterns.structural.decorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDecorator {

    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        WebDriver newDriver = new Decorator(chromeDriver);

        newDriver.get("http://www.github.com");
        newDriver.findElement(By.xpath("//a[contains(.,'Sign up your')]")).click();
        chromeDriver.quit();
    }
}
