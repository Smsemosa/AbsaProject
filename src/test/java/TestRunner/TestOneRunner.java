package TestRunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

//This runner uses Cucumber with serenity for reports
@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (features ="classpath:TestOne.feature", //this is the file bound to test runner
        glue =  {"StepDef"},  //folder that conatains the feature file bound to this test runner
                plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                        "junit:target/cucumber-reports/Cucumber.xml",
                        "html:target/cucumber-reports"}, //format the repoert are to be store  from serenity
        monochrome = true)
public class TestOneRunner
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );

    }
}
