package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.pageUtility.BasePage;
import utility.ConfigReader;
import utility.TestBase;

import java.security.Key;

public class vYTrackPage extends BasePage {


    @FindBy(id = "prependedInput")
    private WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    private WebElement passwordBox;

//    public void loginUsername(String string){
//
//        String username = ConfigReader.get("username");
//        usernameBox.sendKeys(username);
//
//    }
//    public void loginPassword(String string){
//
//        String password = ConfigReader.get("password");
//        passwordBox.sendKeys(password);
//    }

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

        usernameBox.sendKeys(usernameValue);
        passwordBox.sendKeys(passwordValue);
    }


    @FindBy(xpath ="button[@id='_submit']" )
    public WebElement loginButton;

    @FindBy(xpath ="" )
    public WebElement x4;

    @FindBy(xpath ="" )
    public WebElement x5;

    @FindBy(xpath ="" )
    public WebElement x6;

    @FindBy(xpath ="" )
    public WebElement x7;

    @FindBy(xpath ="" )
    public WebElement x8;

    @FindBy(xpath ="" )
    public WebElement x9;

    @FindBy(xpath ="" )
    public WebElement x10;



}
