package AmazonSearch;


import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    protected ChromeOptions options;
//    protected FirefoxOptions options1;
    protected WebDriver driver;
//    protected WebDriver driver1;
    protected WebDriverWait wait;


    @BeforeMethod
    public void setUp(ITestContext result) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
//        driver = new RemoteWebDriver(new URL("http://18.222.148.69:4444/wd/hub"), options);
        result.setAttribute("driver", driver);

//        System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver.exe");
//        options1 = new FirefoxOptions();
//        options1.addArguments("start-maximized");
//        driver1 = new FirefoxDriver(options1);
//        result.setAttribute("driver", driver1);
    }


    @AfterMethod
    public void tearDown(ITestResult result) {

        driver.quit();
//        driver1.quit();
    }
}
