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


    @Given("customer adds {string} summer dress to the cart")
    public void customerAddsSummerDressToTheCart(String arg0) {
        productPage.clickSummerDresses();
        productPage.selectProduct();
    }
}
