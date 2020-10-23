package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utility.BrowserUtils;
import utility.TestBase;

import javax.rmi.CORBA.Util;
import java.util.concurrent.TimeUnit;

public class AmazonSearch extends TestBase {

    AmazonPage amazon = new AmazonPage();



    @Given("user is on events page")
    public void user_is_on_events_page() {
        driver.navigate().to("https://www.amazon.com/events/holidaydash?ref_=nav_td_dash_dt_cr");
    }

    @When("user clicks {string} option")
    public void user_clicks_option(String string) {
        amazon.topBrands.click();
    }

    @Then("{string} will be displayed")
    public void will_be_displayed(String string) {
        System.out.println("amazon.dealsOnTopBrands.isDisplayed() = " + amazon.dealsOnTopBrands.isDisplayed());
    }

    @When("user clicks Home & Seasonal option")
    public void user_clicks_Home_Seasonal_option() {
        amazon.homeAndSeasonal.click();
    }

    @Then("user should see Sort by {string} dropdown button")
    public void user_should_see_Sort_by_dropdown_button(String string) {
        System.out.println("amazon.dropdown.isDisplayed() = " + amazon.dropdown.isDisplayed());
    }

    @When("user clicks Sort by {string} dropdown button")
    public void user_clicks_Sort_by_dropdown_button(String string) {
        amazon.dropdown.click();
    }

    @Then("user should see {string} option")
    public void user_should_see_option(String string) {
        act.moveToElement(amazon.dropdown).click().moveToElement(amazon.priceOption).click().perform();


//        System.out.println("amazon.priceOption.isDisplayed() = " + amazon.priceOption.isDisplayed());
    }



}
