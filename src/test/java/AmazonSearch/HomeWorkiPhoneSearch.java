package AmazonSearch;

import Pages.HomePage;
import Pages.ResultAndFilterPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorkiPhoneSearch extends TestBase {
    String search2 = "iPhone";
    ExpectedCondition custom;
    HomePage homePage;
    ResultAndFilterPage resultAndFilterPage;



    @BeforeMethod
    public void setUp1() {
        homePage = new HomePage(driver);
        resultAndFilterPage = new ResultAndFilterPage(driver);
    }

    @Test
    public void getOnlyIphoneInResult() throws Exception {
        homePage.open()
                .search(search2);
        List<WebElement> lst = resultAndFilterPage.returnItemsName();

        System.out.println(lst.size());
        Assert.assertEquals(lst.size(), 22);
    }


}




