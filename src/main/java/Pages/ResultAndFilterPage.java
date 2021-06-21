package Pages;

import org.apache.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import java.util.List;

public class ResultAndFilterPage extends BasePage {

    private By chkBoxMinPrice = By.id("low-price");
    private By chkBoxMaxPrice = By.id("high-price");
    private By btnGo = By.xpath("//input[@aria-labelledby='a-autoid-1-announce']");
    private By itemPrice = By.xpath("//span[@aria-hidden=\"true\" and ancestor::span[@class='a-price']]");
    private By itemName = By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']");
    private By itemBrand = By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']");



    public ResultAndFilterPage(WebDriver driver) {
        super(driver);
        log = LogManager.getLogger(ResultAndFilterPage.class);
    }

    public ResultAndFilterPage(WebDriver driver, By itemName) {
        super(driver);
        this.itemName = itemName;
    }

    public By getItemName() {
        return itemName;
    }
    public By getItemBrand() {
        return itemBrand;
    }

    @Override
    public BasePage open() {
        return this;
    }

    public ResultAndFilterPage setPriceRangeAndClickGoBtn(String min, String max) {
        driver.findElement(chkBoxMinPrice).sendKeys(min);
        driver.findElement(chkBoxMaxPrice).sendKeys(max);
        driver.findElement(btnGo).click();
        return this;
    }
    public ResultAndFilterPage setFilter(String ChkBoxBrand) {
        driver.findElement(By.id(ChkBoxBrand)).click();

        return this;
    }

    public WebElement returnFirstItemPrice() {
        log.info("in returnFirstItemPrice()");
        return driver.findElement(itemPrice);
    }

    public String returnFirstItemPriceAsText() {
        return driver.findElement(itemPrice).getText();
    }


    public Float returnFirstItemPriceInFloat() {
        String firstItemPrice = driver.findElement(itemPrice).getText()
                .replace("$", "")
                .replace("\n", ".");
        return Float.valueOf(firstItemPrice);
    }

    public List<WebElement> returnItemsName() {

        return driver.findElements(itemName);
    }

    public List<WebElement> returnItemsBrand() {


        return driver.findElements(itemBrand);
    }



}




