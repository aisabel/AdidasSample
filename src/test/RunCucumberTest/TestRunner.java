package RunCucumberTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*The JUnit runner uses the JUnit framework to run Cucumber.
In order to run the project just right click on JUnit test runner file and click on "Run As -> JUnit test"*/

@RunWith(Cucumber.class)
/*Cucumber options are defined in order to match feature files with stepDefinitions and show as a result a nice formatted log
 * Also a file results is automatically generated according to format selected.
 *
 * Customize Format according to requirements, below you can find the options:
 * format = {“html:Folder_Name“} ->This will generate a HTML report at the location mentioned in the for-matter itself
 * format = { “junit:Folder_Name/cucumber.xml“}" -> This report is meant to be post-processed into another visual format by 3rd party tools such as Cucumber Jenkins
 * format = { “junit:Folder_Name/cucumber.xml“} -> This report generates XML files just like Apache Ant’s JUnit report task.
 * This XML format is understood by most Continuous Integration servers, who will use it to generate visual reports
 *
 * ,
        format = {"html:output","json:target/cucumber-report.json"}
 * */

@CucumberOptions(
        features = "test/java/resources/features/",
        glue="stepDefinitions",
        plugin = {"pretty", "summary"})
public class TestRunner {
}
