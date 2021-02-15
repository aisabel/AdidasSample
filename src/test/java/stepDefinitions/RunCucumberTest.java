package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/searchPositions.feature",
         glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber"})
public class RunCucumberTest {
}
