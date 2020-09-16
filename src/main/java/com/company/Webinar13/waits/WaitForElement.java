package com.company.Webinar13.waits;

import com.company.Webinar13.driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitForElement {

    public static void waitUntilElementIsVisible(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getWebDriver(), 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementIsClickable(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getWebDriver(), 10);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
