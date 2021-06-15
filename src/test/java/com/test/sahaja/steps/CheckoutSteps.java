package com.test.sahaja.steps;

import com.test.sahaja.pageobjects.CheckoutPage;
import com.test.sahaja.pageobjects.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutSteps {

    private CheckoutPage checkoutPage;
    private ProductPage productPage;

    public CheckoutSteps(CheckoutPage checkoutPage,ProductPage productPage){
        this.checkoutPage = checkoutPage;
        this.productPage = productPage;
    }

    @Then("product details should be available in review order history")
    public void productDetailsShouldBeAvailableInReviewOrderHistory() {
        checkoutPage.clickProcessAddress();
        checkoutPage.checkTCs();
        checkoutPage.clickProcessCarrier();
    }

    @And("should be able to make the payment")
    public void shouldBeAbleToMakeThePayment() throws InterruptedException {
        Assert.assertTrue("Pay by wire option not displayed",checkoutPage.isPaymentOptionAvailable());
        checkoutPage.signout();

    }
}
