package pages.Library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageUtility.BasePage;

public class AC_1 extends BasePage {

    @FindBy(xpath ="//input[@type='email']" )
    public WebElement emailAddressBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;












}
