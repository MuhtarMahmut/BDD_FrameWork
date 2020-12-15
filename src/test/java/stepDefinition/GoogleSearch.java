package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utility.BrowserUtils;
import utility.ConfigReader;
import utility.TestBase;

public class GoogleSearch extends TestBase {

    GooglePage google = new GooglePage();

    @Given("user is already on google website")
    public void user_is_already_on_google_website() {
       driver.navigate().to(ConfigReader.get("website"));
    }


    @When("user enters {string} and {string} in search box")
    public void user_enters_and_in_search_box(String string, String string2) {
      google.searchBox.sendKeys(string+" "+string2 + Keys.ENTER);
    }

    @Then("Title of google will change")
    public void title_of_google_will_change() {
        BrowserUtils.TakeScreenShots("Beautiful");
        act.pause(5000).perform();
        System.out.println("Hi pretty ladies");
    }



}
