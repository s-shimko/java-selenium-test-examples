package s.shimko.actions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import s.shimko.actions.pages.DraggablePage;
import s.shimko.actions.utils.WebDriverSingleton;

public class ActionsDemoTests {

    @Test(description = "drag and drop",enabled = false)
    public void dragNDropDemo(){
        DraggablePage draggablePage = new DraggablePage();
        draggablePage.open();
//        Screeshooter.takeScreenshot();
        draggablePage.dragNDropSquare();
//        Screeshooter.takeScreenshot();
    }

    @AfterTest
    public void tearDown(){
        WebDriverSingleton.kill();
    }
}
