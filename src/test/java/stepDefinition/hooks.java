package stepDefinition;

import utility.TestBase;
import io.cucumber.java.*;

public class hooks  {

    // YOU DO NOT Need Touch THOSE, if you want to modify setUp & tearDown, just go to TestBase

    @Before // runs before each scenarios from each feature files
    public void setup(){
        TestBase.BeforeScenario();
    }


    @After // runs after each scenarios from each feature files
    public void tearDown(Scenario result){
        TestBase.AfterScenario(result);
    }




}
