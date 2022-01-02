package com.cybertek.test;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class chercherTest {

    WebDriver driver;

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


    }
}
