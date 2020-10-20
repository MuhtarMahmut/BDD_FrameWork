package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utility.BrowserUtils;
import utility.ConfigReader;
import utility.TestBase;

public class GoogleSearch extends TestBase {

    GooglePage google = new GooglePage();

    @Given("Environment is ready")
    public void environment_is_ready() {
        driver.navigate().to(ConfigReader.get("website"));
    }

    @When("user enters {string} in search box")
    public void user_enters_in_search_box(String string) {
        BrowserUtils.highlightElement(google.searchBox).sendKeys(string + Keys.ENTER);
    }

    @When("user also enters {string} in search box")
    public void user_also_enters_in_search_box(String string) {
        BrowserUtils.highlightElement(google.searchBox).sendKeys(string + Keys.ENTER);
    }

    @Then("Title of page changes")
    public void title_of_page_changes() {
        System.out.println("Title is changed");
    }

    @Then("Cat will be displayed")
    public void cat_will_be_displayed() {
        System.out.println("Cat is displayed");
    }

    @When("user clicks Image link")
    public void user_clicks_Image_link() {
        BrowserUtils.highlightElement(google.Images).click();
    }

    @Then("google image will be displayed")
    public void google_image_will_be_displayed() {

    }

}