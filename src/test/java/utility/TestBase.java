package utility;

import io.cucumber.core.api.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public  static WebDriver driver;
    protected  static WebDriverWait wait;
    protected  static Actions act;


    public static void BeforeScenario(){
        driver = Driver.driver();
        wait = new WebDriverWait(driver,10);
        act = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public static void AfterScenario(Scenario result){
            // in my hooks class in the @after i have passed scenario result and
        // i can manage what do to if result is failed, or successed
        // no not clear

        // sorry i didnt understand the accent

        if( result.isFailed() )
            result.embed( ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES) ,"image/png" );

        BrowserUtils.sleep(1);
        driver.quit();
    }


}
