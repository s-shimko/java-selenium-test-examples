package s.shimko.cucumberJvm.search;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import s.shimko.cucumberJvm.search.selenium.BaseSelenium;

@CucumberOptions(
        features = "src/test/resources/search",
        strict = true,
        glue = "s.shimko.cucumberJvm.search.steps",
        plugin = {
                "pretty", "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        }
)
public class RunAcceptanceTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void initSelenium() {
        BaseSelenium.init();
    }

    @AfterClass
    public static void closeSelenium(){
        BaseSelenium.close();
    }
}
