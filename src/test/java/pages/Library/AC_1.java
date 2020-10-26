package pages.Library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageUtility.BasePage;

public class AC_1 extends BasePage {

    @FindBy(xpath ="//label[contains(text(),'Email address')]" )
    public WebElement emailAddressButton;

    @FindBy(xpath = "//label[contains(text(),'Password')]")
    public WebElement passwordButton;












}
