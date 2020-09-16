package com.company.Webinar12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/");
    }

    @Test
    public void firstTest(){
        Actions actions = new Actions(driver);

        WebElement womenLink = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]"));
        actions.moveToElement(womenLink).pause(3000).build().perform();
        WebElement eveningDressesLink = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
        eveningDressesLink.click();
        String title = driver.getTitle();
        Assert.assertEquals(title,"Evening Dresses - My Store");

        driver.findElement(By.xpath("//i[@class='icon-th-list']")).click();
        driver.findElement(By.xpath("//span[contains(.,'More')]")).click();
        driver.findElement(By.cssSelector("#color_24")).click();
        Select size = new Select(driver.findElement(By.id("group_1")));
        size.selectByVisibleText("L");
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
