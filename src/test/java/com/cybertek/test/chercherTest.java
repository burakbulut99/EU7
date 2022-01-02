package com.cybertek.test;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class chercherTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod

    public void setup(){
        driver= WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    }

    @AfterMethod

    public void tearDown(){
        driver.close();
    }

    @Test
    public void alertPresentTest(){

        driver.findElement(By.id("alert")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Test

    public void disabledButtonTest(){

        WebElement button = driver.findElement(By.id("disable"));
        button.click();

        WebElement buttonİniator = driver.findElement(By.id("enable-button"));
        buttonİniator.click();

        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(button));

        System.out.println("button.isEnabled() = " + button.isEnabled());
        Assert.assertTrue(button.isEnabled(),"verify the button is enabled");

    }
}
