package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1600,900");
//        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-menu-id='6']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text() = 'Computer Components']")).click();
        Thread.sleep(1000);

        String itemText = driver.findElement(By.xpath("//div[@data-index='0']//h2//span")).getText();
//        driver.quit();

        System.out.println(itemText);


    }
}
