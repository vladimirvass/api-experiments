package docker;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest extends TestBase{

    @Test
    public void openHomePage() {
        String expectedTitle = "Maven Repository";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }
}
