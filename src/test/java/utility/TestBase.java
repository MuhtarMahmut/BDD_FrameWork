package utility;



import io.cucumber.java.Scenario;
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

        if( result.isFailed() ) {
            byte[] t = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            result.attach(t,"image/png", result.getName());
        }
        driver.quit();
    }


}
