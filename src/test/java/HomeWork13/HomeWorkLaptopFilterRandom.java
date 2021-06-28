package HomeWork13;
import AmazonSearch.TestBase;
import Pages.HomePage;
import Pages.ResultAndFilterPage;
import Pages.TodaysDealsPage;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
@Epic("Brands Filter")
@Story("Check filter by brands")
@Link ("https://amazon.com")
@TmsLink("AS-2025")
public class HomeWorkLaptopFilterRandom extends TestBase {
    String search3 = "Laptop";
    HomePage homePage;
    TodaysDealsPage todaysPage;
    ResultAndFilterPage resultAndFilterPage;

    @BeforeMethod
    public void setUp1() {
        homePage = new HomePage(driver);
        todaysPage = new TodaysDealsPage(driver);
        resultAndFilterPage = new ResultAndFilterPage(driver);

    }
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void getItemsBrandHp() throws Exception {
        homePage.open()
                .search1(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void getItemsBrandAsus() throws Exception {
        homePage.open()
                .search2(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void getItemsBrandDell() throws Exception {
        homePage.open()
                .search3(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void getItemsBrandLenovo() throws Exception {
        homePage.open()
                .search4(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void getItemsBrandAcer() throws Exception {
        homePage.open()
                .search5(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Severity(SeverityLevel.NORMAL)
    @Test

    public void getItemsBrandMicrosoftr() throws Exception {
        homePage.open()
                .search6(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Severity(SeverityLevel.NORMAL)
    @Test

    public void getItemsBrandMsi() throws Exception {
        homePage.open()
                .search7(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Severity(SeverityLevel.NORMAL)
    @Test

    public void getItemsBrandRaser() throws Exception {
        homePage.open()
                .search8(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Severity(SeverityLevel.NORMAL)
    @Test

    public void getItemsBrandApple() throws Exception {
        homePage.open()
                .search9(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Severity(SeverityLevel.NORMAL)
    @Test

    public void getItemsBrandWinnovo() throws Exception {
        homePage.open()
                .search10(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void getItemsBrandRandom() throws Exception {
        homePage.open()
                .Random(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
}


