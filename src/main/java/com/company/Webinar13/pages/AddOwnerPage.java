package com.company.Webinar13.pages;

import com.company.Webinar13.driver.manager.DriverManager;
import com.company.Webinar13.waits.WaitForElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddOwnerPage {

    @FindBy(css = "input#firstName")
    private WebElement firstNameField;
    @FindBy(css = "input#lastName")
    private WebElement lastNameField;
    @FindBy(css = "input#address")
    private WebElement addressField;
    @FindBy(css = "input#city")
    private WebElement cityField;
    @FindBy(css = "input#telephone")
    private WebElement telephoneField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement addOwerButton;
    @FindBy(xpath = "(//td[@class='ownerFullName']/a)[last()]")
    private WebElement lastElementWithSpecificName;


    public AddOwnerPage () {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    public void createOwner() {
        firstNameField.sendKeys("Krzysztof");
        lastNameField.sendKeys("Nowak");
        addressField.sendKeys("Petuniowa 9/5");
        cityField.sendKeys("Wrocław");
        telephoneField.sendKeys("123456789");
        Assert.assertTrue(addOwerButton.isDisplayed());
        addOwerButton.click();
    }

    public void clickOnNewlyCreatedOwner() {
        ((JavascriptExecutor) DriverManager.getWebDriver())
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        lastElementWithSpecificName.click();

    }
}
