package HomeWork11;

import AmazonSearch.TestBase;
import Pages.HomePage;
import Pages.ResultAndFilterPage;
import Pages.TodaysDealsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PositiveTest extends TestBase {
    String search1 = "Samsung";
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
    public void getOnlyIphoneInResultP() throws Exception {
        homePage.open()
                .search(search2);
        List<WebElement> lst = resultAndFilterPage.returnItemsName();

        Assert.assertEquals(lst.size(), 20);

    }
}
