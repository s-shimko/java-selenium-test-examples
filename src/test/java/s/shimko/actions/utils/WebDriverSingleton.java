package s.shimko.actions.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {

    private static WebDriver instance;

    public static WebDriver getInstance() {
        if (instance == null) {
            instance = init();
        }
        return instance;
    }

    private static WebDriver init() {
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = null;
        try {
//            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.chrome());
            driver = new ChromeDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static void kill() {
        if (instance != null) {
            try {
                instance.quit();
            } catch (Exception e) {
                System.out.println("Cannot quit browser");
            } finally {
                instance = null;
            }
        }
    }
}


