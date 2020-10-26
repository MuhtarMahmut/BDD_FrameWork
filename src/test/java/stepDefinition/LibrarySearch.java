package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Library.AC_1;
import utility.ConfigReader;
import utility.TestBase;

public class LibrarySearch extends TestBase {

    AC_1 ac1 = new AC_1();

    @Given("user is on the login page of library")
    public void user_is_on_the_login_page_of_library() {
        driver.get(ConfigReader.get("website"));
    }

    @When("user enters username in the email box")
    public void user_enters_username_in_the_email_box() {
        ac1.emailAddressBox.sendKeys(ConfigReader.get("testlibrarian.username"));
    }

    @When("user enters password in the password box")
    public void user_enters_password_in_the_password_box() {
        ac1.passwordBox.sendKeys(ConfigReader.get("testlibrarian.password")+Keys.ENTER);
    }

    @Then("title should change to {string}")
    public void title_should_change_to(String string) {
        boolean result = driver.getTitle().contains(string);
        Assert.assertTrue(result);
    }














}