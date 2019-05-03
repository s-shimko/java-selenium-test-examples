package s.shimko.actions.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screeshooter {

    private static final String SCREENSHOT_NAME_TPL = "screenshots/scr";

    public static void takeScreenshot(){
        WebDriver driver = WebDriverSingleton.getInstance();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String screenshotName = SCREENSHOT_NAME_TPL + System.currentTimeMillis();
            File copy = new File(screenshotName + ".png");
            FileUtils.copyFile(screenshot, copy);
        } catch (Exception e) {
            System.out.println("Failed to make screenshot");
        }
    }
}
