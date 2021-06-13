package AmazonRegisterNegativeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class AmazonRegisterNegativeReEnterFieldEmpty extends AmazonRegisterNegativeTestBase {

    @Test

    public void emptyReenterPasswordField() {

        By id = By.id("ap_customer_name");
        By id1 = By.id("ap_email");
        By id2 = By.id("ap_password");
        By id3 = By.id("ap_password_check");

        SoftAssert softAssert = new SoftAssert();

        driver.findElement(new By.ByXPath("//a[@data-csa-c-content-id='nav_ya_signin']")).click();
        driver.findElement(new By.ByXPath("//a[@id='createAccountSubmit']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement customerName = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
        customerName.click();
        customerName.sendKeys("Nadiia Frendziuk");


        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(id1)).perform();

        wait.until(ExpectedConditions
                .and(ExpectedConditions.presenceOfElementLocated(id1), ExpectedConditions.presenceOfElementLocated(id1)));

        WebElement appEmail = driver.findElement(By.xpath("//input[@id='ap_email']"));
        appEmail.click();
        appEmail.sendKeys("nadi4ka88@gmail.com");

        Actions actions1 = new Actions(driver);
        actions.moveToElement(driver.findElement(id2)).perform();

        wait.until(ExpectedConditions
                .and(ExpectedConditions.presenceOfElementLocated(id2), ExpectedConditions.presenceOfElementLocated(id2)));

        WebElement appPassword = driver.findElement(By.xpath("//input[@id='ap_password']"));
        appPassword.click();
        appPassword.sendKeys("4esZXdr5");


        driver.findElement(new By.ByXPath("//input[@id='continue']")).click();

        Actions actions2 = new Actions(driver);
        actions.moveToElement(driver.findElement(id)).perform();
        String color = driver.findElement(id).getCssValue("border-color");
        String NoTextInBox = driver.findElement(id).getAttribute("value");
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).click();

        Actions actions3 = new Actions(driver);
        actions.moveToElement(driver.findElement(id1)).perform();

        String color1 = driver.findElement(id1).getCssValue("border-color");
        String NoTextInBox1 = driver.findElement(id1).getAttribute("value");
        driver.findElement(By.xpath("//input[@id='ap_email']")).click();

        Actions actions4 = new Actions(driver);
        actions.moveToElement(driver.findElement(id)).perform();
        String color2 = driver.findElement(id2).getCssValue("border-color");
        String NoTextInBox2 = driver.findElement(id2).getAttribute("value");
        driver.findElement(By.xpath("//input[@id='ap_password']")).click();

        WebElement reEnterPassword = driver.findElement(By.xpath("//input[@id='ap_password_check']"));
        appPassword.click();
        appPassword.sendKeys("");
        String color3 = driver.findElement(id3).getCssValue("border-color");
        String NoTextInBox3 = driver.findElement(id3).getAttribute("value");
        driver.findElement(By.xpath("//input[@id='ap_password_check']")).click();
        String expectedErrorMsg = "Type your password again";

        WebElement exp = driver.findElement(By.xpath("//div[@id='auth-passwordCheck-missing-alert']//div[@class='a-alert-content']"));
        String actualErrorMsg = exp.getText();


        softAssert.assertEquals(color, "rgb(148, 148, 148) rgb(166, 166, 166) rgb(166, 166, 166)");
        System.out.println(color);
        softAssert.assertEquals(color1, "rgb(148, 148, 148) rgb(166, 166, 166) rgb(166, 166, 166)");
        System.out.println(color1);
        softAssert.assertEquals(color2, "rgb(148, 148, 148) rgb(166, 166, 166) rgb(166, 166, 166)");
        System.out.println(color2);
        softAssert.assertEquals(color3, "rgb(221, 0, 0)");
        System.out.println(color3);
        softAssert.assertEquals(actualErrorMsg, expectedErrorMsg);
        System.out.println(actualErrorMsg);
        softAssert.assertAll();




    }
    }










