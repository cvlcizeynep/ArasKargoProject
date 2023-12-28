package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",

        },
        features = {"src/test/resources/features/us02.feature"
        ,"src/test/resources/features/us10.feature"},
        glue = "stepDefinitions",
        tags = "@mkdss",
        dryRun =false
)
public class Runner_Mkdds {

}
