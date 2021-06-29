package HomeWork11;

import AmazonSearch.TestBase;
import Pages.HomePage;
import Pages.ResultAndFilterPage;
import Pages.TodaysDealsPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;


public class NegativeTest extends TestBase {

    String search2 = "iPhone";
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
    public void getOnlyIphoneInResultN() throws Exception {
        homePage.open()
                .search(search2);
        List<WebElement> lst = resultAndFilterPage.returnItemsName();

        Assert.assertEquals(lst.size(), 15);

    }

    @Test
    public void getOnlyIphoneInResultX() throws Exception {
        homePage.open()
                .search("Xiaomi");
        List<WebElement> lst = resultAndFilterPage.returnItemsName();

        Assert.assertEquals(lst.size(), 10);

    }
}

