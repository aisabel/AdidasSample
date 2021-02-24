package io.cucumber.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class SearchPositions {

    /*Enable below code, and commented import class - if you wish to use chromeDriver instead*/
    public static WebDriver driver;

    public SearchPositions() {
        //Replace path to chromeDriver if necesary
        //System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/usr/local/share/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        options.add_argument('window-size=1920x1080');
        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.get("https://careers.adidas-group.com/");
    }

    /*Currently enabled code is to use htmlUnit driver
    public WebDriver driver;
    public SearchPositions() {

        // turn off htmlunit warnings
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);

        // Creating a new instance of the HTML unit driver
        driver = new HtmlUnitDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://careers.adidas-group.com/");
        System.out.println("Page title is: " + driver.getTitle());
    }*/


    @Given("^user is in Careers Adidas Group$")
    public void user_is_in_Careers_Adidas_Group(){
        System.out.println(driver.getTitle());
    }


    @When("^search for \"([^\"]*)\" in \"([^\"]*)\"$")
    public void search(String position, String location) {
        driver.findElement(By.id("filterKeyword")).sendKeys(position);
        driver.findElement(By.id("filterLocation")).sendKeys(location);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.id("filterLocation")).sendKeys(Keys.ARROW_DOWN);
        //driver.findElement(By.id("filterLocation")).sendKeys(Keys.ENTER);

        /*Enable below assertions when you enable chromeDriver, for htmlUnitDriver is not required
        //driver.findElement(By.id("eac-container-filterLocation")).click();
        //driver.findElement(By.className("eac-item")).click();
        */
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



