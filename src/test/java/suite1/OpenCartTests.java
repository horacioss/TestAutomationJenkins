package suite1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTests {

    @Test
    public void testFirst() {
        System.out.println("First test was executed!");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Now is excuting before each Test!");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I'm excuted after Test!!");
    }
}
