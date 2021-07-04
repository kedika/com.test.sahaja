package com.test.sahaja.pageobjects;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    private By tshirtMenu = By.xpath("//div/ul/li/a[contains(@title, 'T-shirts')]");
    private By dressesMenu = By.xpath("//div/ul/li/a[contains(@title, 'Dresses')]");
    private By summerDresses = By.xpath("(//ul/li/a[contains(@title, 'Summer Dresses')])[2]");
    private By addToCart = By.name("Submit");
    private By product = By.xpath("//a[contains(text(),'Printed Chiffon Dress')]");
    private By proceedToCheckout = By.xpath("//*[contains(@title, 'Proceed to checkout')]");
    private By proceed = By.xpath("//p/a[contains(@title, 'Proceed to checkout')]");

    public void clickTshirtMenu(){
        waitForExpectedElement(tshirtMenu).click();
    }

    public void clickSummerDresses(){
        mouseHover(dressesMenu);
        waitForExpectedElement(summerDresses).click();
    }

    public void selectProduct(){
        waitForExpectedElement(product).click();
        waitForExpectedElement(addToCart).click();
        waitForExpectedElement(proceedToCheckout).click();
        waitForExpectedElement(proceed).click();
    }



}
