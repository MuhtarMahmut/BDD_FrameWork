package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/Rerun/rerun.txt",
        glue = "stepDefinition",
        plugin = {
                "json:target/Reports/FailedTests/failed_tests.json",
                "html:target/Reports/FailedTests/failed_tests.html",
                "junit:target/Reports/FailedTests/failed_tests.xml",
                "pretty:target/Reports/FailedTests/failed_tests.txt",
                "usage:target/Reports/FailedTests/failed_tests_usage.json",  // reports the usage
        },
        dryRun = false,
        monochrome = true
)
public class FailedScenario {


}
