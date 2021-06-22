package AmazonSearch;

import Pages.HomePage;
import Pages.ResultAndFilterPage;
import Pages.TodaysDealsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

public class HomeWorkSamsungSearch extends TestBase {

    String search1 = "Samsung";
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
    public void getOnlyIphoneInResult() throws Exception {
        homePage.open()
                .search(search1);
        List<WebElement> lstSam = resultAndFilterPage.returnItemsName();


        System.out.println(lstSam.size());


        List<String> itemText = new ArrayList<>();

        for (WebElement el:lstSam) {
            itemText.add(el.getText());
        }

        itemText.forEach(System.out::println);

        for (String a:itemText) {
            Assert.assertTrue(a.toLowerCase(Locale.ROOT).contains("samsung"), "Doesn't contain "+a);
        }

    }

}
