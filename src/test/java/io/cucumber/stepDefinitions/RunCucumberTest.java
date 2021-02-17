package io.cucumber.stepDefinitions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:io/cucumber/features/searchPositions.feature",
        plugin = {"pretty", "summary", "html:target/cucumber-report.html"}, publish = true)
public class RunCucumberTest {
}
