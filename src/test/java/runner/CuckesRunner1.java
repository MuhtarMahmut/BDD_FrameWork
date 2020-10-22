package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // we use Junit' RunWith annotation to run the cucumber

@CucumberOptions(
        features = "src/test/resources/Features/feature1",  // linked to the directory that has feature files
        glue = "stepDefinition",
        dryRun = false,
        /*
        when dry run is:
                true: only the feature file will run, we can get the missing steps
                false: first runs the step definition, then runs feature file
         */
        tags = "@google",   // used for specifying which scenario(s) or feature(s) files to run
        plugin = {
                "json:target/Reports/JSON/cucumber.json",
                "html:target/Reports/HTML/HTML_Report.html",
                "junit:target/Reports/JUNIT/MyJunit.xml",
                "pretty:target/Reports/Pretty/Myprestty.txt"
        }, // used for generating reports,

        publish = true // publishes a report for 24 hours only on website


)

public class CuckesRunner1 {


        
}


/*
 glue = "",  // specify the path of the step definitions
        dryRun = false,  // when dry run is:
                        //    false: the classes in glue' directory will run first then the features
                        //    true: only runs the feature file

        tags = "",   // used for specifying which scenario(s) or feature(s) files to run
        plugin = {
                "json:target/Reports/JSON/cucumber.json",
                "html:target/Reports/HTML/default-html-reports",
                "junit:target/Reports/JUNIT/MyJunit.xml",
                "pretty:target/Reports/Pretty/Myprestty.txt"
        } // used for generating reports

 */