package com.test.sahaja.steps;

import com.test.sahaja.pageobjects.ProductPage;
import io.cucumber.java.en.Given;

public class ProductPageSteps {

    private ProductPage productPage;

    public ProductPageSteps(ProductPage productPage) {
        this.productPage = productPage;
    }

    @Given("customer adds {string} to the cart")
    public void customerAddsToTheCart(String productName) {
        productPage.clickTshirtMenu();
        productPage.selectProduct();
    }


}
