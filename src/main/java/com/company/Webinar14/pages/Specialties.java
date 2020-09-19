package com.company.Webinar14.pages;

import com.company.Webinar14.driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Specialties {

    @FindBy(css = "input[name=\"spec_name\"]")
    List<WebElement> specialtiesList;

    public Specialties() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void checkBackgroundColor() {
        DriverManager.getWebDriver().get("http://petclinic.akademia.testowanie.pl/petclinic/specialties");
        for (WebElement we: specialtiesList) {
            String bgc = we.getCssValue("background-color");
            String backgroundColor = Color.fromString(bgc).asHex();

            Assert.assertEquals(backgroundColor, "#eeeeee");
        }
    }
}
