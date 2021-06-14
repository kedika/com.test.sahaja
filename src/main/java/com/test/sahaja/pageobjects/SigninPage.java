package com.test.sahaja.pageobjects;

import org.openqa.selenium.By;

public class SigninPage extends BasePage {

    private By email = By.id("email");
    private By password = By.id("passwd");
    private By signIn = By.cssSelector("icon-lock left");

    public void successfulSignIn(String user,String pwd){
        waitForExpectedElement(email).sendKeys(user);
        waitForExpectedElement(password).sendKeys(pwd);
        waitForExpectedElement(signIn).click();
    }



}
