package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.Library.AC_1;
import utility.ConfigReader;
import utility.TestBase;

public class LibrarySearch extends TestBase {

    AC_1 ac1 = new AC_1();

    @When("user enters {string} in email adress inputBox")
    public void user_enters_in_email_adress_input_box(String string) {
        ac1.emailAddressButton.sendKeys(string);
    }

    @When("enters {string} in password input box")
    public void enters_in_password_input_box(String string) {
        ac1.passwordButton.sendKeys(string,Keys.ENTER);
    }

    @Given("log in as a Test Librarian")
    public void log_in_as_a_test_librarian() {

    }


    @When("I am under the books module")
    public void i_am_under_the_books_module() {

    }

    @Then("Add Book header should be displayed.")
    public void add_book_header_should_be_displayed() {

    }









}
