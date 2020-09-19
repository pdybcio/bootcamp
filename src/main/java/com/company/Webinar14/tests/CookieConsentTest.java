package com.company.Webinar14.tests;

import com.company.Webinar14.driver.manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CookieConsentTest {

    private final String pageUrl = "http://www.testuj.pl";
    private WebElement acceptRadioInput;
    private WebElement cancelRadioInput;
    private WebElement cookieBox;
    private WebElement saveCookieSettings;

    @BeforeClass
    public void setup(){
        DriverManager.getWebDriver().get(pageUrl);
        cookieBox = DriverManager.getWebDriver().findElement(By.cssSelector("#cookieConsent"));
        waitForElementVisibility(cookieBox);
        DriverManager.getWebDriver().findElement(By.cssSelector("a.config")).click();

        acceptRadioInput = DriverManager.getWebDriver().findElement(By.id("cookie_agreement_option_agree"));
        Assert.assertTrue(acceptRadioInput.isDisplayed());
        cancelRadioInput = DriverManager.getWebDriver().findElement(By.id("cookie_agreement_option_cancel"));
        Assert.assertTrue(cancelRadioInput.isDisplayed());

    }

    @Test
    public void noRadioButtonIsSelectedByDefault(){
        Assert.assertFalse(acceptRadioInput.isSelected());
        Assert.assertFalse(cancelRadioInput.isSelected());
    }

    @Test(priority = 1)
    public void onlyOneRadionInputCanBeSelected(){
        acceptRadioInput.click();
        assertRadioButtons(true, false);
        cancelRadioInput.click();
        assertRadioButtons(false, true);
        acceptRadioInput.click();
        assertRadioButtons(true, false);
    }

    @Test(dependsOnMethods = "onlyOneRadionInputCanBeSelected")
    public void saveCookieConfiguration(){
        DriverManager.getWebDriver().findElement(By.cssSelector("#cookieConfig a.agree")).click();

        waitForElementToBeNotPresent(cookieBox);
    }

    @Test(dependsOnMethods = "saveCookieConfiguration")
    public void cookieConfigurationIsNotPresented(){
        DriverManager.getWebDriver().navigate().refresh();
        waitForElementToBeNotPresent(cookieBox);

    }



    private void assertRadioButtons(boolean acceptState, boolean cancelState){
        Assert.assertEquals(acceptRadioInput.isSelected(), acceptState);
        Assert.assertEquals(cancelRadioInput.isSelected(), cancelState);
    }

    private void waitForElementVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    private void waitForElementToBeNotPresent(WebElement element){
        WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), 5);
        wait.until(ExpectedConditions.stalenessOf(element));
    }
}
