package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // we use Junit' RunWith annotation to run the cucumber

@CucumberOptions(
        features = "src/test/resources/Features/feature1",  // linked to the directory that has feature files

        glue = "stepDefinition", // specify the path of the step definitions

        dryRun = false,
        /*
        when dry run is:
                true: only the feature file will run, we can get the missing steps
                false: first runs the step definition, then runs feature file
         */
        tags = "@v",   // used for specifying which scenario(s) or feature(s) files to run

        plugin = {
                "json:target/Reports/JSON/cucumber.json",
                "html:target/Reports/HTML/HTML_Report.html",
                "junit:target/Reports/JUNIT/MyJunit.xml",
                "pretty:target/Reports/Pretty/Myprestty.txt"
        }, // used for generating reports,

        publish = true, // publishes a report for 24 hours only on website

       // strict = true,
        /*
                true: skips undefined tests
                 false: does not fail the execution and undefined steps
        */

        monochrome = true // it means that the console output for the Cucumber test are much more readable

)

public class CuckesRunner1 {


        
}
