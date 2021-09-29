package docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public abstract class TestBase {

    static final String APP_URL = "https://mvnrepository.com/";
    static final String HOST_URL = "http://localhost:4444"; // Grid 4
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        var opt = new ChromeOptions();
        opt.addArguments("--ignore-ssl-errors=yes"
                , "--ignore-certificate-errors");
        try {
            driver = new RemoteWebDriver(new URL(HOST_URL), opt);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        var timeouts = Duration.ofSeconds(10);
        driver.manage().timeouts().implicitlyWait(timeouts);
        driver.get(APP_URL);
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
