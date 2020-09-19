package com.company.Webinar14.pages;

import com.company.Webinar14.driver.manager.DriverManager;
import com.company.Webinar14.waits.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddPetPage {

    @FindBy(xpath = "//*[text() = 'Add New Pet']")
    private WebElement addPetButton;
    @FindBy(css = "#name")
    private WebElement petNameField;
    @FindBy(xpath = "//input[@name='birthDate']")
    private WebElement calendarBirthDateInput;
    @FindBy(xpath = "//input[@name='date']")
    private WebElement calendarVisitDateInput;
    @FindBy(css = "#type")
    private WebElement typeField;
    @FindBy(xpath = "//*[text()='Save Pet']")
    private WebElement savePetButton;
    @FindBy(xpath = "//*[text()='Add Visit']")
    private WebElement addVisitButton;
    @FindBy(css = "#description")
    private WebElement descriptionField;
    @FindBy(xpath = "//td[contains(text(),'2020')]")
    private WebElement assertVisitDate;
    @FindBy(xpath = "//td[contains(text(),'Wizyta kontrolna')]")
    private WebElement assertDesc;
    @FindBy(xpath = "//dd[contains(text(),'Koles')]")
    private WebElement assertPetName;
    @FindBy(xpath = "//dd[contains(text(),'2000')]")
    private WebElement assertBirthDate;
    @FindBy(xpath = "//dd[contains(text(),'dog')]")
    private WebElement assertType;
    @FindBy(css = "div > table:nth-child(2) tr:nth-child(1) td b")
    private WebElement assertOwnerName;
    @FindBy(css = "div > table:nth-child(2) tr:nth-child(2) td")
    private WebElement assertAddress;
    @FindBy(css = "div > table:nth-child(2) tr:nth-child(3) td")
    private WebElement assertCity;
    @FindBy(css = "div > table:nth-child(2) tr:nth-child(4) td")
    private WebElement assertTelephoneNumber;


    public AddPetPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void addNewPet() {
        Actions addPetAction = new Actions(DriverManager.getWebDriver());
        addPetAction.moveToElement(addPetButton).click().build().perform();
        WaitForElement.waitUntilElementIsVisible(petNameField);
        petNameField.sendKeys("Koles");
        WaitForElement.waitUntilElementIsVisible(calendarBirthDateInput);
        calendarBirthDateInput.clear();
        calendarBirthDateInput.sendKeys("2000/01/01");
        Select select = new Select(typeField);
        select.selectByVisibleText("dog");
        savePetButton.click();
    }

    public void addVisit() {
        WaitForElement.waitUntilElementIsVisible(addVisitButton);
        addVisitButton.click();
        calendarVisitDateInput.sendKeys("2020/09/16");
        descriptionField.sendKeys("Wizyta kontrolna");
        addVisitButton.click();
    }

    public void asserttsPetsAndVisits() {
        Assert.assertEquals("Koles", assertPetName.getText());
        Assert.assertEquals("2000/01/01", assertBirthDate.getText());
        Assert.assertEquals("dog", assertType.getText());
        Assert.assertEquals("2020/09/16" , assertVisitDate.getText());
        Assert.assertEquals("Wizyta kontrolna", assertDesc.getText());
    }

    public void assertsOwnerInfo() {
        Assert.assertEquals("Krzysztof Nowak", assertOwnerName.getText());
        Assert.assertEquals("Petuniowa 9/5", assertAddress.getText());
        Assert.assertEquals("Wrocław", assertCity.getText());
        Assert.assertEquals("123456789", assertTelephoneNumber.getText());
    }
}
