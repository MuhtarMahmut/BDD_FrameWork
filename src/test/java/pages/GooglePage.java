package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.GoogleSearch;
import utility.TestBase;

public class GooglePage extends BasePage {

//    public GooglePage(){
//        PageFactory.initElements(TestBase.driver , this);
//        // we do this for every single classes in pages package
//    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[text()='Images']")
    public WebElement Images;



}
