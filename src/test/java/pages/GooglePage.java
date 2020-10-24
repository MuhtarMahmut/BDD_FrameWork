package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageUtility.BasePage;

public class GooglePage extends BasePage {


    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[text()='Images']")
    public WebElement Images;



}
