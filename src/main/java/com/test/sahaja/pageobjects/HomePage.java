package com.test.sahaja.pageobjects;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By signIn = By.cssSelector(".login");
    private By productList = By.cssSelector(".dataRow");
    private By productDescList = By.cssSelector(".descriptionTd .link2");

    public void clickSignIn(){
        waitForExpectedElement(signIn).click();
    }

}
