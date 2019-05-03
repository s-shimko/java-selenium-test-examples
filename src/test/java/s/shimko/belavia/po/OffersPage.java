package s.shimko.belavia.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import s.shimko.belavia.dto.Offer;

import java.util.ArrayList;
import java.util.List;

public class OffersPage extends AbstractPage {

    @FindBy(css = ".offers")
    private List<WebElement> allOffersList;

    @FindBy(css = ".offer-group")
    private List<WebElement> offerRoutes;

    @FindBys({@FindBy(css = ".offer-details strong")})
    private List<WebElement> offeredPrices;

    public OffersPage(WebDriver driver) {
        super(driver);
    }

    public ArrayList<Offer> getListOfOffers() {
        ArrayList<Offer> offers = new ArrayList<>();
        for (int i = 0; i < offeredPrices.size(); i++) {
            Offer offer = new Offer();
            offer.setPrice(offeredPrices.get(i).getText());
            offers.add(offer);
        }
        return offers;
    }


}
