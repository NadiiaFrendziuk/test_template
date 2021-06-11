package AmazonRegisterNegativeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.asserts.SoftAssert.*;

public class RegisterNegativeAllEmptyFields extends AmazonRegisterNegativeTestBase {

    @Test

    public void EmptyFields() {

        By id = By.id("ap_customer_name");
        By id1 = By.id("ap_email");
        By id2 = By.id("ap_password");

        SoftAssert softAssert = new SoftAssert();

        driver.findElement(new By.ByXPath("//a[@data-csa-c-content-id='nav_ya_signin']")).click();
        driver.findElement(new By.ByXPath("//a[@id='createAccountSubmit']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//input[@id='continue']")).click();

        WebElement customerName = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
        customerName.click();
        customerName.sendKeys("");
        String color = driver.findElement(id).getCssValue("border-color");
        String NoTextInBox = driver.findElement(id).getAttribute("value");
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).click();



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


        softAssert.assertEquals(color, "rgb(221, 0, 0)");
        softAssert.assertEquals(color1, "rgb(221, 0, 0)");
        softAssert.assertEquals(color2, "rgb(221, 0, 0)");
        softAssert.assertAll();




    }


    }


