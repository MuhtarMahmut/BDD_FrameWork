package stepDefinition;

import org.openqa.selenium.WebElement;
import utility.TestBase;

public class AmazonSearch extends TestBase {

    public void method(){
        WebElement dropdown =null;
        WebElement Option =null;
        act.moveToElement(dropdown).click().moveToElement(Option).click().perform();

        WebElement searchBox = null;
        act.moveToElement(searchBox).click().sendKeys("Hazel").perform();

    }


}
