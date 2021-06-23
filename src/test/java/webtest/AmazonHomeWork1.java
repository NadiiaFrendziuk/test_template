package webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AmazonHomeWork1 {
    WebDriver driver;
    public static void main (String[] arg) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb_intl_52df97a2eee74206a8343034e85cd058']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        String itemText1 = driver.findElement(By.xpath("//div[@class='a-row a-spacing-top-mini unitLineHeight']//span[contains(text(),'List:')]/../preceding-sibling::div[@class='a-row priceBlock unitLineHeight']//span[@class='gb-font-size-medium inlineBlock unitLineHeight dealPriceText']")).getText();
        itemText1 = itemText1.replaceAll("\\$|(?<=\\d),(?=\\d)", "");
        String itemText2 = driver.findElement(By.xpath("//div[@class='a-row a-spacing-top-mini unitLineHeight']//span[contains(text(),'List:')]//following::span")).getText();
        itemText2 = itemText2.replaceAll("\\$|(?<=\\d),(?=\\d)", "");
        System.out.print("New price: " + itemText1);
        System.out.println(", old price: " + itemText2);






        driver.quit();
    }
}
