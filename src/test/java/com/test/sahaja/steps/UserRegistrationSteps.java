package com.test.sahaja.steps;

import com.test.sahaja.helper.PropUtils;
import com.test.sahaja.model.World;
import com.test.sahaja.pageobjects.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserRegistrationSteps {

    private RegistrationPage registrationPage;
    private String firstName;

    public UserRegistrationSteps(RegistrationPage registrationPage) {
        this.registrationPage = registrationPage;
    }

    @When("the user update {string}")
    public void theUserUpdate(String field) {
        registrationPage.clickPersonalInfoLink();
        firstName = World.randomAlphabetic(9);
        registrationPage.updateFirstName(firstName);
        registrationPage.enterCurrentPwd(World.userDetailsJson.get("password").toString());
        registrationPage.saveChanges();
    }

    @Then("should be able to update with success message")
    public void shouldBeAbleToUpdateWithSuccessMessage() {
        Assert.assertEquals(PropUtils.getMessage("updatePersonalDetails"), registrationPage.getSuccessMsg());
    }

    @And("the updated {string} should appear in personal info page")
    public void theUpdatedShouldAppearInPersonalInfoPage(String field) {
        registrationPage.clickBackToAccounts();
        registrationPage.clickPersonalInfoLink();
        Assert.assertEquals(firstName, registrationPage.getFirstName());

    }
}
