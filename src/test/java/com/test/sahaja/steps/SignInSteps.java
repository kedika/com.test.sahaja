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
        World.userJson = (JSONObject) World.userDetailsJson.get(user);
        signinPage.successfulSignIn(String.valueOf(World.userJson.get("username")),String.valueOf(World.userJson.get("password")));
    }


    @When("proceeds to the checkout and signin with existing user")
    public void proceedsToTheCheckoutAndRegistersAsNewUser() {
        World.userJson = (JSONObject) World.userDetailsJson.get("TestUser");
        signinPage.successfulSignIn(String.valueOf(World.userJson.get("username")),String.valueOf(World.userJson.get("password")));

    }
}
