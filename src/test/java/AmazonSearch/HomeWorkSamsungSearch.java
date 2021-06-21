package AmazonSearch;

import Pages.HomePage;
import Pages.ResultAndFilterPage;
import Pages.TodaysDealsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorkSamsungSearch extends TestBase {

    String search1 = "Samsung";
    ExpectedCondition custom;
    HomePage homePage;
    ResultAndFilterPage resultAndFilterPage;

    @BeforeMethod
    public void setUp1() {
        homePage = new HomePage(driver);
        resultAndFilterPage = new ResultAndFilterPage(driver);
    }

    @Test
    public void getOnlySamsungInResult() throws Exception {
        homePage.open()
                .search(search1);
        List<WebElement> lst = resultAndFilterPage.returnItemsName();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);

    }
}
