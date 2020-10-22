package pages.vYtrackProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.ConfigReader;

public class Login {

    @FindBy(id = "prependedInput")
    public WebElement username;      //in class we did it private //To not use web elements directly in step definition classes
                                     //helps to prevent code duplication and keep step definitions clean

    @FindBy(id = "prependedInput2")
    private WebElement password;

    public void login(String role) {
        String usernameValue = "";
        String passwordValue = ConfigReader.get("password");

        if (role.equalsIgnoreCase("sales manager")) {
            usernameValue = ConfigReader.get("salesmanager.username");
        } else if (role.equalsIgnoreCase("driver")) {
            usernameValue = ConfigReader.get("driver.username");
        } else {
            usernameValue = ConfigReader.get("storemanager.username");
        }

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }
}
