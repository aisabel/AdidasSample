package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class searchPositions {

    public static WebDriver driver;

    public searchPositions() {
        /*This inheritance class calls itself in order to use the browser and page set up across the whole test and deleting cookies first*/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\irodriguez\\IdeaProjects\\AdidasSample\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://careers.adidas-group.com/");
    }

    @Given("user is in Careers Adidas Group")
    public void user_is_in_Careers_Adidas_Group()throws Throwable {
        System.out.println(driver.getTitle());
    }


    @When("^search for \"([^\"]*)\" in \"([^\"]*)\"$")
    public void search(String position, String location)  {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("filterKeyword")).sendKeys(position);
        driver.findElement(By.id("filterLocation")).sendKeys(location);
        driver.findElement(By.className("eac-item")).click();
    }

    @And("^click Find Jobs button$")
    public void findJobsButton() {
        driver.findElement(By.cssSelector("button[class$='submit']")).click();
    }

    @Then("^results are displayed$")
    public void results() {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement searchResult = driver.findElement(By.id("search-result__count-number"));
        int resultCount = Integer.parseInt(searchResult.getAttribute("data-count-to"));
        System.out.println("Results found: "+resultCount);

        if (0 < resultCount) {
            System.out.println("Position found: "+driver.findElement(By.className("job-list__title")).getText());
        }
        else {
            System.out.println("Position not found");
        }
        driver.quit();
    }
}



