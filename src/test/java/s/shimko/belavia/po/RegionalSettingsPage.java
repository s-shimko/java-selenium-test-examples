package s.shimko.belavia.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegionalSettingsPage extends AbstractPage {

    public static final String BELAVIA_URL = "http://belavia.by";

    @FindBy(css="#select-lang")
    private WebElement openSelectLangMenu;

    @FindBy(css="#lang-menu")
    private WebElement languageDropdown;

    public RegionalSettingsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public RegionalSettingsPage setRegionalSettings(String language) {
        openSelectLangMenu.click();
        new Select(languageDropdown).selectByValue(language);
        return this;
    }

    public HomePage openHomePage() {
        return PageFactory.initElements(driver, HomePage.class);
    }
}
