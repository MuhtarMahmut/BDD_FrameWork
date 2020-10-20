package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private Driver(){
    }

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver driver(){
            String name = ConfigReader.get("browser");
        switch (name) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driverPool.set(new ChromeDriver());
                break;

            case "chrome-headless":
                WebDriverManager.chromedriver().setup();
                driverPool.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driverPool.set(new FirefoxDriver());
                break;

            case "firefox-headless":
                WebDriverManager.firefoxdriver().setup();
                driverPool.set(new FirefoxDriver(new FirefoxOptions().setHeadless(true)));
                break;

            case "ie":
                if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                    throw new WebDriverException("Your OS doesn't support Internet Explorer");
                WebDriverManager.iedriver().setup();
                driverPool.set(new InternetExplorerDriver());
                break;

            case "edge":
                if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                    throw new WebDriverException("Your OS doesn't support Edge");
                WebDriverManager.edgedriver().setup();
                driverPool.set(new EdgeDriver());
                break;

            case "safari":
                if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                    throw new WebDriverException("Your OS doesn't support Safari");
                WebDriverManager.getInstance(SafariDriver.class).setup();
                driverPool.set(new SafariDriver());
                break;
        }

        return driverPool.get();
    }


}
