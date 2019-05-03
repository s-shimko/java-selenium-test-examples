package s.shimko.cucumberJvm.search.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import s.shimko.cucumberJvm.search.selenium.BaseSelenium;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class BaseStepDef extends BaseSelenium {

    @Given("^I set search request \"(.*)\"$")
    public void iSearchRequest(String searchRequest){
        driver.get("http://ebay.com");
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys(searchRequest);
    }

    @When("^I perform search$")
    public void iPerformSearch() {
        driver.findElement(By.cssSelector("#gh-btn")).click();
    }

    @Then("^the term query \"([^\"]*)\" should be the first in the search Result grid$")
    public void theTermQueryShouldBeTheFirstInTheSearchResultGrid(String expectedPhrase) throws Throwable {
        String firstSnippet = driver.findElement(By.xpath("(.//h3[@class='s-item__title'])[1]")).getText();
        System.out.println(firstSnippet);
        assertThat(firstSnippet, containsString(expectedPhrase));
    }
}
