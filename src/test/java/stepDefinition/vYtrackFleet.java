package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.vYTrackPage;
import utility.ConfigReader;
import utility.TestBase;

public class vYtrackFleet extends TestBase {

    vYTrackPage vytrack = new vYTrackPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get(ConfigReader.get("website"));
    }

    @When("user enters {string} in username box")
    public void user_enters_in_username_box(String string) {
          vytrack.login(string);
    }

    @When("enters {string} in password box")
    public void enters_in_password_box(String string) {
        vytrack.login(string);
    }

    @Then("user can log in")
    public void user_can_log_in() {
        vytrack.loginButton.click();
    }

    @Given("user is on Vehicles Odometers module")
    public void user_is_on_vehicles_odometers_module() {

    }

    @Then("Vehicles Odometers text should be on displayed")
    public void vehicles_odometers_text_should_be_on_displayed() {

    }

    @When("user clicks on Export Grid dropdown")
    public void user_clicks_on_export_grid_dropdown() {

    }

    @Then("user should able to select CSV option")
    public void user_should_able_to_select_csv_option() {

    }

    @Then("user should able to select XLSX option")
    public void user_should_able_to_select_xlsx_option() {

    }

    @When("user selects All option in the small dropdown button")
    public void user_selects_all_option_in_the_small_dropdown_button() {

    }

    @Then("all the checkboxes should be selected")
    public void all_the_checkboxes_should_be_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user is on Page one")
    public void user_is_on_page_one() {

    }

    @When("user right click page arrow option")
    public void user_right_click_page_arrow_option() {

    }

    @Then("user should be able to go to the next page")
    public void user_should_be_able_to_go_to_the_next_page() {

    }
















}
