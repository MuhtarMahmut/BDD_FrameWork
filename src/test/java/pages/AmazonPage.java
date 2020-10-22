package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.TestBase;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(TestBase.driver,this);
    }

    @FindBy(xpath = "//*[text()='Top Brands']")
    public WebElement topBrands;

    @FindBy(xpath = "//h1[contains(text(),'Deals on')]")
    public WebElement dealsOnTopBrands;

    @FindBy(xpath = "//*[text()='Home & Seasonal']")
    public WebElement homeAndSeasonal;

    @FindBy(xpath = "//span[contains(text(),'Featured')]")
    public WebElement dropdown;

    @FindBy(xpath = "//a[@id='dropdown-18510163916166533_1']")
    public WebElement priceOption;






}
