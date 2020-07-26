package meetup.reprograma.setup;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ResourceBundle;

public class Hooks {

    public static WebDriver driver;
    public static ResourceBundle bundle = ResourceBundle.getBundle("project");

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void startTest(Scenario scenario) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.get(bundle.getString("env.url"));
//        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        driver.close();
    }


}
