package com.test.sahaja.pageobjects;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    private By tshirtMenu = By.xpath("//div/ul/li/a[contains(@title, 'T-shirts')]");
    private By addToCart = By.cssSelector(".ajax_add_to_cart_button");
    private By product = By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]");
    private By proceedToCheckout = By.xpath("//*[contains(@title, 'Proceed to checkout')]");
    private By proceed = By.xpath("//p/a[contains(@title, 'Proceed to checkout')]");

    public void clickTshirtMenu(){
        waitForExpectedElement(tshirtMenu).click();
    }

    public void selectProduct(){
        mouseHover(product);
        waitForExpectedElement(addToCart).click();
        waitForExpectedElement(proceedToCheckout).click();
        waitForExpectedElement(proceed).click();
    }



}
