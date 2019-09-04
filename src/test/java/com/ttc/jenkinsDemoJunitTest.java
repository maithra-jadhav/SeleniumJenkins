package com.ttc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Maithra Jadhav
 */
public class jenkinsDemoJunitTest
{
    private static String Base_Url = "https://www.facebook.com";
    private WebDriver driver;

    @Before
    public void setUp() 
    {
         ChromeOptions options = new ChromeOptions();
         options.addArguments("headless");
         options.addArguments("window-size=1200x600");
         driver = new ChromeDriver(options);
         driver.get(Base_Url);
    }

    @After
    public void after()
    {
        driver.quit();
    }
    
    @Test
    public void testCasePassed()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='login_form']")).isDisplayed());
    }

    @Test
    public void testCaseFailed()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='failed case']")).isDisplayed());
    }

    @Ignore
    @Test
    public void testCaseIgnored()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='ignored case']")).isDisplayed());
    }
}
