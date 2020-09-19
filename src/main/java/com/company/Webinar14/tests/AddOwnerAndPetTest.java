package com.company.Webinar14.tests;

import com.company.Webinar14.pages.AddOwnerPage;
import com.company.Webinar14.pages.AddPetPage;
import org.testng.annotations.Test;

public class AddOwnerAndPetTest extends BaseTest {

    @Test
    public void asUserIwantCreateOwnerAndAddPet() {

        AddOwnerPage addOwnerPage = new AddOwnerPage();
        addOwnerPage.createOwner();
        addOwnerPage.clickOnNewlyCreatedOwner();

        AddPetPage addPetPage = new AddPetPage();
        addPetPage.addNewPet();
        addPetPage.addVisit();
        addPetPage.asserttsPetsAndVisits();
        addPetPage.assertsOwnerInfo();
    }
}
