package AmazonSearch;

import Pages.HomePage;
import Pages.ResultAndFilterPage;
import Pages.TodaysDealsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorkLaptopFilter extends TestBase {
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
    @Test
    public void getItemsBrandHp() throws Exception {
        homePage.open()
                .search1(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Test
    public void getItemsBrandAsus() throws Exception {
        homePage.open()
                .search2(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Test
    public void getItemsBrandDell() throws Exception {
        homePage.open()
                .search3(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Test
    public void getItemsBrandLenovo() throws Exception {
        homePage.open()
                .search4(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Test
    public void getItemsBrandAcer() throws Exception {
        homePage.open()
                .search5(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Test
    public void getItemsBrandMicrosoftr() throws Exception {
        homePage.open()
                .search6(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Test
    public void getItemsBrandMsi() throws Exception {
        homePage.open()
                .search7(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Test
    public void getItemsBrandRaser() throws Exception {
        homePage.open()
                .search8(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Test
    public void getItemsBrandApple() throws Exception {
        homePage.open()
                .search9(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
    @Test
    public void getItemsBrandWinnovo() throws Exception {
        homePage.open()
                .search10(search3);
        List<WebElement> lst = this.resultAndFilterPage.returnItemsBrand();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }




}
