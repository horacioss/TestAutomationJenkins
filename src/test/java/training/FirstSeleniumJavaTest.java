package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstSeleniumJavaTest {
    private WebDriver driver;

    @Test
    public void testEasy() {
        driver.get("https://testautomationu.applitools.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        AssertJUnit.assertTrue(title.equals("Test Automation University | Applitools"));
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver93");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
