package pages.pageUtility;

import org.openqa.selenium.support.PageFactory;
import utility.TestBase;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(TestBase.driver, this);
    }




    /*
    Every single class in Pages package MUST have IS A relation with this BasePage class
    and no constructor should be created in them
     */


}
