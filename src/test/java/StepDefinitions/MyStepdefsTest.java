package StepDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MyStepdefsTest {

    private static WebDriver driver;

    @Given("^I open \"([^\"]*)\" page$")
    @Test
    public void iOpenPage(String url) {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("WebDriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        //throw new PendingException();
    }
}
