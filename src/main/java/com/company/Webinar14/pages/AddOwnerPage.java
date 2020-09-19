package com.company.Webinar14.pages;

import com.company.Webinar14.driver.manager.DriverManager;
import com.company.Webinar14.utils.TakeScreenShot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddOwnerPage {

    @FindBy(css = "td b")
    private WebElement nameField;
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
    @FindBy(xpath = "//button[contains(text(),'< Back')]")
    private WebElement backButton;
    @FindBy(xpath = "//button[contains(text(),'Edit Owner')]")
    private WebElement editOwnerButton;
    @FindBy(xpath = "//button[contains(text(),'Add New Pet')]")
    private WebElement addNewPetButton;


    public AddOwnerPage() {
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

    public void checkColorsInOwnerModal() {
        String nameLabelColor = nameField.getCssValue("font-weight"); //700 == bold https://stackoverflow.com/questions/10100438/how-to-verify-bold-appearance-of-a-certain-field-in-selenium
        String backButtonBGC = backButton.getCssValue("background-color");
        String backgroundButtonColor = Color.fromString(backButtonBGC).asHex();
        String backButtonColor = backButton.getCssValue("border-bottom-color");
        String editOwnerBGC = editOwnerButton.getCssValue("background-color");
        String editOwnerColor = editOwnerButton.getCssValue("border-bottom-color");
        String addNewPetBGC = addNewPetButton.getCssValue("background-color");
        String addNewPetColor = addNewPetButton.getCssValue("border-bottom-color");

        Assert.assertTrue(nameLabelColor.equals("700") || nameLabelColor.equals("bold"));
        Assert.assertEquals(backgroundButtonColor, "#34302d");
        Assert.assertEquals(backButtonBGC, "rgba(52, 48, 45, 1)");
        Assert.assertEquals(backButtonColor, "rgba(109, 179, 63, 1)");
        Assert.assertEquals(editOwnerBGC, "rgba(52, 48, 45, 1)");
        Assert.assertEquals(editOwnerColor, "rgba(109, 179, 63, 1)");
        Assert.assertEquals(addNewPetBGC, "rgba(52, 48, 45, 1)");
        Assert.assertEquals(addNewPetColor, "rgba(109, 179, 63, 1)");

    }

    public void takeScreenshot() {
        TakeScreenShot.screesnshotCatcher(DriverManager.getWebDriver(), "takescreenshot");

    }
}
