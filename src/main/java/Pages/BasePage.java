package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;


public abstract class BasePage {

    private final By btnLanFlag = By.id("icp-nav-flyout");
    private final By navBarInput = By.id("twotabsearchtextbox");
    private String locatorLang = "//div[@id='nav-flyout-icp']//a[descendant::span[contains(text(), '%s')]]";
    private By seeMore = By.xpath("//div[@class='a-row a-expander-container a-expander-extend-container']//span[contains(text(), 'See more')]");
    private By locatorFilter10 = By.xpath("//div[@id='brandsRefinements']//span[contains(text(), 'HP')]");
    private By locatorFilter1 = By.xpath("//div[@id='brandsRefinements']//span[contains(text(), 'ASUS')]");
    private By locatorFilter2 = By.xpath("//div[@id='brandsRefinements']//span[contains(text(), 'Dell')]");
    private By locatorFilter3 = By.xpath("//div[@id='brandsRefinements']//span[contains(text(), 'Lenovo')]");
    private By locatorFilter4 = By.xpath("//div[@id='brandsRefinements']//span[contains(text(), 'Acer')]");
    private By locatorFilter5 = By.xpath("//div[@id='brandsRefinements']//span[contains(text(), 'Microsoft')]");
    private By locatorFilter6 = By.xpath("//div[@id='brandsRefinements']//span[contains(text(), 'MSI')]");
    private By locatorFilter7 = By.xpath("//div[@id='brandsRefinements']//span[contains(text(), 'Razer')]");
    private By locatorFilter8 = By.xpath("//div[@id='brandsRefinements']//span[contains(text(), 'Apple')]");
    private By locatorFilter9 = By.xpath("//div[@id='brandsRefinements']//span[contains(text(), 'Winnovo')]");


    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    protected Logger log;


    protected BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        actions = new Actions(driver);
        log = LogManager.getLogger(BasePage.class);
    }

    public BasePage() {

    }

    protected abstract BasePage open();

    public BasePage selectLanguage(String language) {
        actions.moveToElement(driver.findElement(btnLanFlag)).perform();
        By lang = By.xpath(String.format(locatorLang, language));
        wait.until(ExpectedConditions.elementToBeClickable(lang)).click();
        return this;
    }

    public BasePage search(String search) throws Exception {
        log.info("in search and search str: " + search);
        if (search.equals("iPhone")) {
            log.info("in if, and search: " + search);
        }
        log.info("in search and search str: " + search);
        if (search.equals("Samsung")) {
            log.info("in if, and search: " + search);
        }

        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        return this;
    }

    public BasePage search1(String search) throws Exception {
        log.info("in search and search str: " + search);
        if (search.equals("HP")) {
            log.info("in if, and search: " + search);
        }
        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        log.info("info");
        log.trace("trace");
        log.debug("debug");
        driver.findElement(locatorFilter10).click();

        return this;
    }
    public BasePage search2(String search) throws Exception {
        log.info("in search and search str: " + search);

        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        log.info("info");
        log.trace("trace");
        log.debug("debug");
        driver.findElement(locatorFilter1).click();

        return this;
    }
    public BasePage search3(String search) throws Exception {
        log.info("in search and search str: " + search);

        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        log.info("info");
        log.trace("trace");
        log.debug("debug");
        driver.findElement(locatorFilter2).click();

        return this;
    }
    public BasePage search4(String search) throws Exception {
        log.info("in search and search str: " + search);

        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        log.info("info");
        log.trace("trace");
        log.debug("debug");
        driver.findElement(locatorFilter3).click();

        return this;
    }
    public BasePage search5(String search) throws Exception {
        log.info("in search and search str: " + search);

        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        log.info("info");
        log.trace("trace");
        log.debug("debug");
        driver.findElement(locatorFilter4).click();

        return this;
    }
    public BasePage search6(String search) throws Exception {
        log.info("in search and search str: " + search);

        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        log.info("info");
        log.trace("trace");
        log.debug("debug");
        driver.findElement(locatorFilter5).click();

        return this;
    }
    public BasePage search7(String search) throws Exception {
        log.info("in search and search str: " + search);

        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        log.info("info");
        log.trace("trace");
        log.debug("debug");
        driver.findElement(locatorFilter6).click();

        return this;
    }
    public BasePage search8(String search) throws Exception {
        log.info("in search and search str: " + search);

        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        log.info("info");
        log.trace("trace");
        log.debug("debug");
        driver.findElement(seeMore).click();
        driver.findElement(locatorFilter7).click();

        return this;
    }
    public BasePage search9(String search) throws Exception {
        log.info("in search and search str: " + search);

        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        log.info("info");
        log.trace("trace");
        log.debug("debug");
        driver.findElement(seeMore).click();
        driver.findElement(locatorFilter8).click();

        return this;
    }
    public BasePage search10(String search) throws Exception {
        log.info("in search and search str: " + search);

        driver.findElement(navBarInput).click();
        driver.findElement(navBarInput).clear();
        driver.findElement(navBarInput).sendKeys(search, Keys.ENTER);
        log.info("info");
        log.trace("trace");
        log.debug("debug");
        driver.findElement(seeMore).click();
        driver.findElement(locatorFilter9).click();

        return this;
    }


}




