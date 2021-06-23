package AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class AllEmptyFields extends AmazonTestBase {

    @Test

    public void EmptyFields() {

        By id = By.id("ap_customer_name");
        By id1 = By.id("ap_email");
        By id2 = By.id("ap_password");

        SoftAssert softAssert = new SoftAssert();
        Actions hover = new Actions(driver);

        WebElement Elem_to_hover = driver.findElement(By.id("nav-link-accountList"));

        hover.moveToElement(Elem_to_hover).build().perform();

        driver.findElement(new By.ByXPath("//div[@id='nav-al-signin']")).click();
        driver.findElement(new By.ByXPath("//a[@id='createAccountSubmit']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//input[@id='continue']")).click();

        WebElement customerName = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
        customerName.click();
        customerName.sendKeys("");
        String color = driver.findElement(id).getCssValue("border-color");
        String NoTextInBox = driver.findElement(id).getAttribute("value");
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).click();
        String expectedErrorMsg = "Enter your name";

        WebElement exp = driver.findElement(By.xpath("//div[@id='auth-customerName-missing-alert']//div[@class='a-alert-content']"));
        String actualErrorMsg = exp.getText();


        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(id1)).perform();

        wait.until(ExpectedConditions
                .and(ExpectedConditions.presenceOfElementLocated(id1), ExpectedConditions.presenceOfElementLocated(id1)));

        WebElement appEmail = driver.findElement(By.xpath("//input[@id='ap_email']"));
        appEmail.click();
        appEmail.sendKeys("");
        String color1 = driver.findElement(id1).getCssValue("border-color");
        String NoTextInBox1 = driver.findElement(id).getAttribute("value");
        driver.findElement(By.xpath("//input[@id='ap_email']")).click();
        String expectedErrorMsg1 = "Enter your email or mobile phone number";

        WebElement exp1 = driver.findElement(By.xpath("//div[@id='auth-email-missing-alert']//div[@class='a-alert-content']"));
        String actualErrorMsg1 = exp1.getText();


        Actions actions1 = new Actions(driver);
        actions.moveToElement(driver.findElement(id2)).perform();

        wait.until(ExpectedConditions
                .and(ExpectedConditions.presenceOfElementLocated(id2), ExpectedConditions.presenceOfElementLocated(id2)));

        WebElement appPassword = driver.findElement(By.xpath("//input[@id='ap_password']"));
        appPassword.click();
        appPassword.sendKeys("");
        String color2 = driver.findElement(id1).getCssValue("border-color");
        String NoTextInBox2 = driver.findElement(id2).getAttribute("value");
        driver.findElement(By.xpath("//input[@id='ap_password']")).click();
        String expectedErrorMsg2 = "Minimum 6 characters required";

        WebElement exp2 = driver.findElement(By.xpath("//div[@id='auth-password-missing-alert']//div[@class='a-alert-content']"));
        String actualErrorMsg2 = exp2.getText();


        softAssert.assertEquals(color, "rgb(221, 0, 0)");
        System.out.println(color);
        softAssert.assertEquals(actualErrorMsg, expectedErrorMsg);
        System.out.println(actualErrorMsg);
        softAssert.assertEquals(color1, "rgb(221, 0, 0)");
        System.out.println(color1);
        softAssert.assertEquals(actualErrorMsg1, expectedErrorMsg1);
        System.out.println(actualErrorMsg1);
        softAssert.assertEquals(color2, "rgb(221, 0, 0)");
        System.out.println(color2);
        softAssert.assertEquals(actualErrorMsg2, expectedErrorMsg2);
        System.out.println(actualErrorMsg2);
        softAssert.assertAll();





    }


    }


