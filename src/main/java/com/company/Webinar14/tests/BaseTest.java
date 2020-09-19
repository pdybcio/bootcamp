package com.company.Webinar14.tests;

import com.company.Webinar14.driver.manager.DriverManager;
import com.company.Webinar14.driver.manager.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage("http://petclinic.akademia.testowanie.pl/petclinic/owners");
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }
}
