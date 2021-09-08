package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstSeleniumJavaTest {
    private WebDriver driver;

    @Test
    public void testEasy() {
        driver.get("https://the-internet.herokuapp.com/");

        String title = driver.getTitle();
        assertEquals(title, "The Internet");
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver93");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
