package com.test.sahaja.steps;

import com.test.sahaja.model.World;
import com.test.sahaja.pageobjects.HomePage;
import com.test.sahaja.pageobjects.SigninPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.json.simple.JSONObject;

public class SignInSteps {

    private HomePage homePage;
    private SigninPage signinPage;

    public SignInSteps(HomePage homePage,SigninPage signinPage){
        this.homePage = homePage;
        this.signinPage = signinPage;
    }

    @Given("the user has logged in with {string}")
    public void theUserHasLoggedIn(String user) {
        homePage.clickSignIn();
        signinPage.successfulSignIn(World.userDetailsJson.get("UserName").toString(),World.userDetailsJson.get("password").toString());
    }


    @When("proceeds to the checkout and registers as new user")
    public void proceedsToTheCheckoutAndRegistersAsNewUser() {

    }
}
