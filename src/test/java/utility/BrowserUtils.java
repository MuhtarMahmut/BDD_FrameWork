package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.apache.log4j.Logger;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    final static Logger logger = Logger.getLogger(BrowserUtils.class);

    /*
     * This method stops the current thread for given second(s)
     */
    public static void sleep(double Seconds) {
        try {
            Thread.sleep((long) (Seconds * 1000));

        } catch (Exception e) {
            logger.error("Error: ", e);

        }
    }



    /**
     * Scrolls down to an element using JavaScript
     */
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) TestBase.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    /**
     * Performs double click action on an element
     */
    public static void doubleClick(WebElement element) {
        new Actions(TestBase.driver).doubleClick(element).build().perform();
    }


    /*
     * switches to new window by the exact title
     * returns to original window if windows with given title not found
     */
    public static void switchToWindow(String targetTitle) {
        String origin = TestBase.driver.getWindowHandle();
        for (String handle : TestBase.driver.getWindowHandles()) {
            TestBase.driver.switchTo().window(handle);
            if (TestBase.driver.getTitle().equals(targetTitle)) {
                return;
            }
        }
        TestBase.driver.switchTo().window(origin);
    }


    /**
     * return a list of string from a list of elements ignores any element with no text
     */
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }


    /**
     * executes the given JavaScript command on given web element
     */
    public static void executeJScommand(WebElement element, String command) {
        JavascriptExecutor jse = (JavascriptExecutor) TestBase.driver;
        jse.executeScript(command, element);

    }


    /***
     * This method highlights Web-site Elements using Javascript
     */
    public static WebElement highlightElement(WebElement element) {

            try {
                for (int i = 0; i < 3; i++) {

                    JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
                    js.executeScript(
                            "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
                    sleep(0.1);
                    js.executeScript(
                            "arguments[0].setAttribute('style', 'background: red; border: 2px solid yellow;');", element);
                    sleep(0.1);
                    js.executeScript(
                            "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
                    sleep(0.1);
                }
            } catch (Exception e) {
                logger.error("Error: ", e);
            }

        return element;
    }


    /***
     * This method takes screenshots
     */
    public static void TakeScreenShots(String saveAs){

        String DateTime= LocalDate.now().toString()+ LocalTime.now().toString().substring(0,5);
        saveAs = saveAs+"_"+DateTime.replaceAll("[-,:]","");
        try {
            TakesScreenshot ss = (TakesScreenshot) TestBase.driver;
            File muhtar = ss.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(muhtar, new File("src/test/resources/Files/ScreenShots/"+saveAs+".png"));
        } catch (Exception e){}

    }


    /**
     * Clicks on an element using JavaScript
     */
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) TestBase.driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) TestBase.driver).executeScript("arguments[0].click();", element);
    }



}
