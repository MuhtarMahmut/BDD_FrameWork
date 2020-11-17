package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/feature1"},
        glue = "stepDefinition",
        plugin = {
                "json:target/Reports/cucumber.json",
                "html:target/Reports/tests.html",
                "junit:target/Reports/tests.xml",
                "pretty:target/Reports/tests.txt",
                "usage:target/Reports/tests_usage.json",  // reports the usage
                "rerun:target/Rerun/rerun.txt"  // generates a text file automatically whenever test case fails
        },
        dryRun = false,
        tags = "@somke" ,
        monochrome = true,
        publish = false
)
public class CucksRunner {

}
