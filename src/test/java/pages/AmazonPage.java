package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.pageUtility.BasePage;
import utility.TestBase;

public class AmazonPage extends BasePage {


    @FindBy(xpath = "//*[text()='Top Brands']")
    public WebElement topBrands;

    @FindBy(xpath = "//h1[contains(text(),'Deals on')]")
    public WebElement dealsOnTopBrands;

    @FindBy(xpath = "//*[text()='Home & Seasonal']")
    public WebElement homeAndSeasonal;

    @FindBy(xpath = "//span[contains(text(),'Featured')]")
    public WebElement dropdown;

    @FindBy(xpath = "//a[contains(text(),'Price - Low to Hi')]")
    public WebElement priceOption;






}
