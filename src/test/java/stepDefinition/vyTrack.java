package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.vYtrackProject.Login;
import pages.vYtrackProject.vYTrackPage;
import utility.ConfigReader;
import utility.TestBase;

import java.security.Key;

public class vyTrack extends Login {


    vYTrackPage vytrack = new vYTrackPage();

    @When("user enters {string} in username box")
    public void user_enters_in_username_box(String string) {
      vytrack.username.sendKeys(string);
    }

    @When("enters {string} in password box")
    public void enters_in_password_box(String string) {

    }

    @Then("user can log in")
    public void user_can_log_in() {

    }

    @When("user click on Fleet module")
    public void user_click_on_Fleet_module() {

    }

    @When("click on Vehicle Odometer")
    public void click_on_Vehicle_Odometer() {

    }

    @Then("user should be able to go to Vehicle Odometer page")
    public void user_should_be_able_to_go_to_Vehicle_Odometer_page() {

    }

    @Given("user is on Vehicles Odometers module")
    public void user_is_on_Vehicles_Odometers_module() {

    }

    @Then("Vehicles Odometers text should be on displayed")
    public void vehicles_Odometers_text_should_be_on_displayed() {

    }

    @When("user clicks on Create Vehicle Odometer link")
    public void user_clicks_on_Create_Vehicle_Odometer_link() {

    }

    @Then("user should able to Create Vehicle Odometer")
    public void user_should_able_to_Create_Vehicle_Odometer() {

    }

    @When("user clicks on Export Grid dropdown")
    public void user_clicks_on_Export_Grid_dropdown() {

    }

    @Then("user should able to select CSV option")
    public void user_should_able_to_select_CSV_option() {

    }

    @Then("user should able to select XLSX option")
    public void user_should_able_to_select_XLSX_option() {

    }

    @When("user selects All option in the small dropdown button")
    public void user_selects_All_option_in_the_small_dropdown_button() {

    }

    @Then("all the checkboxes should be selected")
    public void all_the_checkboxes_should_be_selected() {

    }

    @When("user selects None option in the small dropdown button")
    public void user_selects_None_option_in_the_small_dropdown_button() {

    }

    @Then("all the checkboxes should be de-selected")
    public void all_the_checkboxes_should_be_de_selected() {

    }

    @Given("user is on Page{int}")
    public void user_is_on_Page(Integer int1) {

    }

    @When("user right click page arrow option")
    public void user_right_click_page_arrow_option() {

    }

    @Then("user should be able to go to the next page")
    public void user_should_be_able_to_go_to_the_next_page() {

    }

    @When("user left click page arrow option")
    public void user_left_click_page_arrow_option() {

    }

    @Then("user should be able to go back to the previous page")
    public void user_should_be_able_to_go_back_to_the_previous_page() {

    }

    @When("user clicks on the page input box")
    public void user_clicks_on_the_page_input_box() {

    }

    @Then("user should be able to insert page numbers")
    public void user_should_be_able_to_insert_page_numbers() {

    }















}
