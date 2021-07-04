package com.test.sahaja.steps;

import com.test.sahaja.pageobjects.HomePage;
import io.cucumber.java.en.Given;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("the customer is on {string} page")
    public void theUserIsOnPage(String page) throws InterruptedException {
        if (page.equals("Home")) {
            homePage.startPage();
        }
    }


}
