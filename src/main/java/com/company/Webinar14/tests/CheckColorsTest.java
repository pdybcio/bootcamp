package com.company.Webinar14.tests;

import com.company.Webinar14.pages.AddOwnerPage;
import com.company.Webinar14.pages.PetTypes;
import com.company.Webinar14.pages.Specialties;
import org.testng.annotations.Test;


public class CheckColorsTest extends BaseTest{

    AddOwnerPage addOwnerPage = new AddOwnerPage();
    Specialties specialties = new Specialties();
    PetTypes petTypes = new PetTypes();

    @Test
    public void checkFirstAndLastNameColor() {
        addOwnerPage.clickOnNewlyCreatedOwner();
        addOwnerPage.checkColorsInOwnerModal();
    }

    @Test(dependsOnMethods = "checkFirstAndLastNameColor")
    public void takeScreenshot() {
        addOwnerPage.takeScreenshot();
    }

    @Test
    public void checkColorsForSpecialties() {
        specialties.checkBackgroundColor();
    }

    @Test
    public void checkColorsForPetTypes() {
        petTypes.checkBackgroundColor();
    }

}
