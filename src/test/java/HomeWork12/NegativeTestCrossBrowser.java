package HomeWork12;
import AmazonSearch.TestBase;
import Pages.HomePage;
import Pages.ResultAndFilterPage;
import Pages.TodaysDealsPage;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.List;

@Epic("Brands Filter")
@Story("Check filter by brands")
@Feature("Unhappy scenarios")
public class NegativeTestCrossBrowser extends TestBase {

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
    @Severity(SeverityLevel.MINOR)
        @Test
        public void getOnlyIphoneInResultN () throws Exception {
            homePage.open()
                    .search(search2);
            List<WebElement> lst = resultAndFilterPage.returnItemsName();

            Assert.assertEquals(lst.size(), 15);

        }
    }


